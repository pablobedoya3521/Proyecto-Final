/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import java.io.Serializable;

/**
 *
 * @author sebastian
 */
public class Bus implements Serializable{
    private String placa;
    private int numAsientos;
    private Viaje viaje;

    public Bus(String placa,int numAsientos) {
        this.placa=placa;
        this.numAsientos = numAsientos;
        this.viaje = null;
    }
    
    public Bus(){
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }
    
    public void asignarViajeAbus(Viaje viaje){
        this.viaje=viaje;
    }
    
    public void desasignarViaje(){
        this.viaje=null;
    }
}