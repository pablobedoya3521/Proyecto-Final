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
    private static final long serialVersionUID = -761086192410419774L; 
    private String placa;
    private int numAsientos;
    private Viaje viaje;
    private boolean estado;

    public Bus(String placa,int numAsientos) {
        this.placa=placa;
        this.numAsientos = numAsientos;
        this.viaje = null;
        this.estado=false;
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
    
    public boolean asignarViajeAbus(Viaje viaje){
        if(this.viaje==null){
            this.viaje=viaje;
            return true;
        }
        return false;
    }
    
    public void desasignarViaje(){
        this.viaje=null;
    }
    
    public void cambiarEstado(){
        if(this.estado==true){
            this.estado=false;
        }else if(this.estado==false){
            this.estado=true;
        }
    }

    public boolean isEstado() {
        return estado;
    }
    
    
}
