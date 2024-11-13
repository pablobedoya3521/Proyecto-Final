/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author sebastian
 */
public class Viaje implements Serializable{
    private static final long serialVersionUID = 1L;
    private String id;
    private String origen;
    private String destino;
    private String horaDeSalida;
    private String horaDeLlegada;
    private LocalDate fechaCreacion;
    private Bus bus;
    private double precioViaje;
    private String estado;

    public Viaje(String id,String origen, String destino, String horaDeSalida, String horaDeLlegada,Bus bus, double precioViaje) {
        this.id=id;
        this.origen = origen;
        this.destino = destino;
        this.horaDeSalida=horaDeSalida;
        this.horaDeLlegada = horaDeLlegada;
        this.fechaCreacion = null;
        this.bus = bus;
        this.precioViaje = precioViaje;
        this.estado="Programado";
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(String horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHoraDeLlegada() {
        return horaDeLlegada;
    }

    public void setHoraDeLlegada(String horaDeLlegada) {
        this.horaDeLlegada = horaDeLlegada;
    }
    

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public double getPrecioViaje() {
        return precioViaje;
    }

    public void setPrecioViaje(double precioViaje) {
        this.precioViaje = precioViaje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
  
}
