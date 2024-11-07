/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author juan
 */
public class Empresa implements Serializable{
    private int nit;
    private String nombreEmpresa;
    private AdministradorFlota administradorFlota;
    private ArrayList<Bus> buses;
    private ArrayList<Viaje> viajes;
    
    public Empresa(int nit, String nombreEmpresa, AdministradorFlota administradorFlota){
        this.nit=nit;
        this.nombreEmpresa=nombreEmpresa;
        this.administradorFlota=administradorFlota;
        this.buses=new ArrayList<>();
        this.viajes= new ArrayList<>();
    }
    
    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public AdministradorFlota getAdministradorFlota() {
        return administradorFlota;
    }

    public void setAdministradorFlota(AdministradorFlota administradorFlota) {
        this.administradorFlota = administradorFlota;
    }

    public ArrayList<Bus> getBuses() {
        return buses;
    }

    public void setBuses(ArrayList<Bus> buses) {
        this.buses = buses;
    }

    public ArrayList<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(ArrayList<Viaje> viajes) {
        this.viajes = viajes;
    }
    
}