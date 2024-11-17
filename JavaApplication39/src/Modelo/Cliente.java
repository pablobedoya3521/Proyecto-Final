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
    private String direccion;
    //private Lista<Reserva> listaReservas;
    private Lista<Tiquete> listaTiquetes;
    //private Lista<Reserva> listaReservasCanceladas;
    private SerializadoraUsuarios serializadoraUsuarios;
    private ControladorRegistro controladorRegistro;
        
    public Cliente(String nombre, String apellido, String cedula, String correo, String contraseña, String telefono, int edad, String direccion) {
        super(nombre, apellido, cedula, correo, contraseña);
        this.puntosAcumulados=0;
        this.telefono=telefono;
        this.edad=edad;
        this.direccion=direccion;
        this.listaTiquetes=new Lista<>();
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
        double precioTiquete = tiquete.getViaje().getPrecioViaje(); 
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

}