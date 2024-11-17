/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.VentanaAdminTerminal.VentanaPrincipalAdminTerminal;
import java.io.Serializable;

public class AdministradorTerminal extends Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    
    public AdministradorTerminal(String nombre, String apellido, String cedula, String correo, String contraseña) {
        super(nombre, apellido, cedula, correo, contraseña);
    }

    @Override
    public void login(Object empresa) {
        VentanaPrincipalAdminTerminal ventana= new VentanaPrincipalAdminTerminal();
        ventana.setVisible(true);
    }
    
}