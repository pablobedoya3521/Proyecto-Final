/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.ControladorRegistro;
import Persistencia.SerializadoraUsuarios;
import Util.Lista;
import Vista.VentanasCliente.VentanaPrincipalCliente;
import java.io.Serializable;

public class Cliente extends Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    private int puntosAcumulados;
    private String telefono;
    private int edad;
    private double monto;
    private Lista<Reserva> listaReservas;
    private Lista<Tiquete> listaTiquetes;
    private Lista<Devolucion> listaDevoluciones;
    private Lista<Tiquete> listaCanjeos;
    private SerializadoraUsuarios serializadoraUsuarios;
    private ControladorRegistro controladorRegistro;
        
    public Cliente(String nombre, String apellido, String cedula, String correo, String contraseña, String telefono, int edad, double monto) {
        super(nombre, apellido, cedula, correo, contraseña);
        this.puntosAcumulados=0;
        this.telefono=telefono;
        this.edad=edad;
        this.monto=monto;
        this.listaTiquetes=new Lista<>();
        this.listaReservas=new Lista<>();
        this.listaCanjeos= new Lista<>();
        this.listaDevoluciones= new Lista<>();
        this.serializadoraUsuarios= new SerializadoraUsuarios();
        this.controladorRegistro= new ControladorRegistro();
    }

        //@Override
    public void login(Object cliente) {
       Cliente cliente1 = (Cliente) cliente;
       VentanaPrincipalCliente ventana = new VentanaPrincipalCliente(cliente1);
       ventana.setVisible(true);
    }

        
    public void guardarCompraTiquete(Tiquete tiquete) {
        Lista<Usuario> usuarios = serializadoraUsuarios.leerObjeto();

        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getCorreo().equals(this.correo)) {
                this.listaTiquetes.add(tiquete);
                Cliente cliente = (Cliente) usuarios.get(i);
                cliente.setListaTiquetes(this.listaTiquetes);
                cliente.acumularPuntos(tiquete);
                cliente.descontarMonto(tiquete);
                controladorRegistro.setUsuarios(usuarios);
                serializadoraUsuarios.escribirObjeto(usuarios);
                break; 
            }
        } 
    }
    
    public void guardarCanjeo(Tiquete tiquete) {
        Lista<Usuario> usuarios = serializadoraUsuarios.leerObjeto();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getCorreo().equals(this.correo)) {
                this.listaCanjeos.add(tiquete);
                Cliente cliente = (Cliente) usuarios.get(i);
                cliente.setListaCanjeos(this.listaCanjeos);
                cliente.desacumularPuntosDeCanjeo();
                controladorRegistro.setUsuarios(usuarios);
                serializadoraUsuarios.escribirObjeto(usuarios);
                break; 
            }
        } 
    }
    
    public void guardarDevolucion(Tiquete tiquete) {
        Lista<Usuario> usuarios = serializadoraUsuarios.leerObjeto();
        Devolucion devolucion = new Devolucion(tiquete);
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getCorreo().equals(this.correo)) {
                this.listaDevoluciones.add(devolucion);
                Cliente cliente = (Cliente) usuarios.get(i);
                cliente.setListaDevoluciones(this.listaDevoluciones);
                controladorRegistro.setUsuarios(usuarios);
                serializadoraUsuarios.escribirObjeto(usuarios);
                break; 
            }
        } 
    }
    
    public void eliminarCompraTiquete(int codigoTiquete){
        Lista<Usuario> usuarios = serializadoraUsuarios.leerObjeto();

        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getCorreo().equals(this.correo)) {
                Cliente cliente = (Cliente) usuarios.get(i);
                Lista<Tiquete> listaTiquetes = cliente.getListaTiquetes();

                if (listaTiquetes != null && !listaTiquetes.isEmpty()) {
                    for (int j = 0; j < listaTiquetes.size(); j++) {
                        if (listaTiquetes.get(j).getCodigoTiquete() == codigoTiquete) {
                            Tiquete tiqueteCancelado = listaTiquetes.get(j);
                            listaTiquetes.remove(j);
                            cliente.setListaTiquetes(listaTiquetes);
                            cliente.desacumularPuntos(tiqueteCancelado);
                            cliente.aumentarMonto(tiqueteCancelado);
                            controladorRegistro.setUsuarios(usuarios);
                            serializadoraUsuarios.escribirObjeto(usuarios);
                            break; // Salimos del bucle una vez que se elimina el tiquete
                        }
                    }
                }
            }
        }
    }
    
    private int calcularPuntos(Tiquete tiquete) {
        double precioTiquete = tiquete.getViaje().getPrecioViaje()*tiquete.getCantidad(); 
        return (int) (precioTiquete / 10000) * 3; 
    }

    private void acumularPuntos(Tiquete tiquete){
        int puntosAcumuladosPorTiquete = calcularPuntos(tiquete);
        this.puntosAcumulados += puntosAcumuladosPorTiquete;
    }

    private void desacumularPuntos(Tiquete tiquete){
        int puntosAcumuladosPorTiquete = calcularPuntos(tiquete);
        this.puntosAcumulados -= puntosAcumuladosPorTiquete;
    }
    
    private void desacumularPuntosDeCanjeo(){
        this.puntosAcumulados-=90;
    }
    
    public void guardarReserva(Reserva reserva){
        Lista<Usuario> usuarios = serializadoraUsuarios.leerObjeto();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getCorreo().equals(this.correo)) {
                this.listaReservas.add(reserva);
                Cliente cliente = (Cliente) usuarios.get(i);
                cliente.setListaReservas(this.listaReservas);
                controladorRegistro.setUsuarios(usuarios);
                serializadoraUsuarios.escribirObjeto(usuarios);
                break; 
            }
        } 
    }
    
    public void eliminarReserva(String codigoReserva) {
        Lista<Usuario> usuarios = serializadoraUsuarios.leerObjeto();

        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getCorreo().equals(this.correo)) {
                Cliente cliente = (Cliente) usuarios.get(i);
                Lista<Reserva> listaReservasCliente = cliente.getListaReservas();
                boolean reservaEliminada = false;

                for (int j = 0; j < listaReservasCliente.size(); j++) {
                    if (listaReservasCliente.get(j).getCodigo().equals(codigoReserva)) {
                        listaReservasCliente.remove(j);
                        // Actualizar tanto el cliente serializado como la instancia actual
                        cliente.setListaReservas(listaReservasCliente);
                        this.listaReservas = listaReservasCliente; // Actualizar la lista local
                        controladorRegistro.setUsuarios(usuarios);
                        serializadoraUsuarios.escribirObjeto(usuarios);
                        reservaEliminada = true;
                        break;
                    }
                }

                if (!reservaEliminada) {
                    System.out.println("Reserva con código " + codigoReserva + " no encontrada.");
                }
                break;
            }
        }
    }
    
    private void descontarMonto(Tiquete tiquete){
        double precioTiquete = tiquete.getViaje().getPrecioViaje()*tiquete.getCantidad();
        this.monto-=precioTiquete;
    }
    
    private void aumentarMonto(Tiquete tiquete){
        double precioTiquete = tiquete.getViaje().getPrecioViaje()*tiquete.getCantidad();
        this.monto+=precioTiquete;
    }

    
    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Lista<Tiquete> getListaTiquetes() {
        return listaTiquetes;
    }

    public void setListaTiquetes(Lista<Tiquete> listaTiquetes) {
        this.listaTiquetes = listaTiquetes;
    }

        @Override
    public String getNombre() {
        return nombre;
    }

        @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

        @Override
    public String getApellido() {
        return apellido;
    }

        @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

        @Override
    public String getCedula() {
        return cedula;
    }

        @Override
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

        @Override
    public String getCorreo() {
        return correo;
    }

        @Override
    public void setCorreo(String correo) {
        this.correo = correo;
    }

        @Override
    public String getContraseña() {
        return contraseña;
    }

        @Override
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }  

    public Lista<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(Lista<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public Lista<Tiquete> getListaCanjeos() {
        return listaCanjeos;
    }

    public void setListaCanjeos(Lista<Tiquete> listaCanjeos) {
        this.listaCanjeos = listaCanjeos;
    }

    public Lista<Devolucion> getListaDevoluciones() {
        return listaDevoluciones;
    }

    public void setListaDevoluciones(Lista<Devolucion> listaDevoluciones) {
        this.listaDevoluciones = listaDevoluciones;
    }
    
    

}