/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author sebastian
 */
public class Empresa {
    private String nombre;
    private int nit;
    private AdministradorFlota administradorFlota;

    public Empresa(int nit, AdministradorFlota administradorFlota,String nombre) {
        this.nit = nit;
        this.administradorFlota = administradorFlota;
        this.nombre=nombre;
    }
    
    
}
