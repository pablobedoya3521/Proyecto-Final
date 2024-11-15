/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.VentanaAdminFlota.VentanaPrincipalAdminFlota;
import java.io.Serializable;


public class AdministradorFlota extends Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    private String nivelExp;
    private double sueldo;
    private String horario;
   

    public AdministradorFlota(String nivelExp, double sueldo, String horario, String nombre, String apellido, String cedula, String correo, String contraseña) {
        super(nombre, apellido, cedula, correo, contraseña);
        this.nivelExp = nivelExp;
        this.sueldo = sueldo;
        this.horario = horario;
        
    }

    @Override
    public void login(Object empresa) {
        Empresa empresa1 = (Empresa) empresa;
        VentanaPrincipalAdminFlota ventana = new VentanaPrincipalAdminFlota(empresa1);
        ventana.setVisible(true);
    }

    public String getNivelExp() {
        return nivelExp;
    }

    public void setNivelExp(String nivelExp) {
        this.nivelExp = nivelExp;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

}
