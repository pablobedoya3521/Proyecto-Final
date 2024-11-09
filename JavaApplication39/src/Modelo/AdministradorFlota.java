/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.VentanaAdminFlota.VentanaPrincipalAdminFlota;
import java.io.Serializable;

/**
 *
 * @author juan
 */
public class AdministradorFlota extends Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    private String nivelExp;
    private double sueldo;
    private String horarios;

    public AdministradorFlota(String nivelExp, double sueldo, String horarios, String nombre, String apellido, String cedula, String correo, String contraseña) {
        super(nombre, apellido, cedula, correo, contraseña);
        this.nivelExp = nivelExp;
        this.sueldo = sueldo;
        this.horarios = horarios;
    }

    @Override
    public void login() {
        VentanaPrincipalAdminFlota ventana = new VentanaPrincipalAdminFlota();
        ventana.setVisible(true);
    }
    
}
