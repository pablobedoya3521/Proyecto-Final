/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import Util.Lista;
import Vista.VentanasCliente.VentanaPrincipalCliente;
import java.io.Serializable;

/**
 *
 * @author juan
 */
public class Cliente extends Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    private int puntosAcumulados;
    private String telefono;
    private int edad;
    //private Lista<Reserva> listaReservas;
    private Lista<Tiquete> listaTiquetes;
    //private Lista<Reserva> listaReservasCanceladas;

    public Cliente(String nombre, String apellido, String cedula, String correo, String contraseña, String telefono, int edad) {
        super(nombre, apellido, cedula, correo, contraseña);
        this.puntosAcumulados=0;
        this.telefono=telefono;
        this.edad=edad;
        this.listaTiquetes=new Lista<>();
    }

    //@Override
    public void login() {
       VentanaPrincipalCliente ventana = new VentanaPrincipalCliente();
       ventana.setVisible(true);
    }
    
}
