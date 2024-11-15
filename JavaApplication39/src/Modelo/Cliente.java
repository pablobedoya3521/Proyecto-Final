/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


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

        public Cliente(String nombre, String apellido, String cedula, String correo, String contraseña, String telefono, int edad, String direccion) {
            super(nombre, apellido, cedula, correo, contraseña);
            this.puntosAcumulados=0;
            this.telefono=telefono;
            this.edad=edad;
            this.direccion=direccion;
            this.listaTiquetes=new Lista<>();
        }

        //@Override
        public void login(Object cliente) {
           Cliente cliente1 = (Cliente) cliente;
           VentanaPrincipalCliente ventana = new VentanaPrincipalCliente(cliente1);
           ventana.setVisible(true);
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }  

}
