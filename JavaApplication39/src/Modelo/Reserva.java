/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva implements Serializable{
    private static final long serialVersionUID = 1L;
    private Cliente cliente;
    private Viaje viaje;
    private LocalDate fechaDeReserva;
    private LocalTime horaDeReserva;
    private boolean estado;
    private int cantidadDeTiquetes;
    private String codigo;

    public Reserva(String codigo,Cliente cliente, Viaje viaje, int cantidadDeTiquetes) {
        this.codigo=codigo;
        this.cliente = cliente;
        this.viaje = viaje;
        this.estado = true;
        this.cantidadDeTiquetes = cantidadDeTiquetes;
        this.fechaDeReserva=LocalDate.now();
        this.horaDeReserva=LocalTime.now();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

    public LocalDate getFechaDeReserva() {
        return fechaDeReserva;
    }

    public void setFechaDeReserva(LocalDate fechaDeReserva) {
        this.fechaDeReserva = fechaDeReserva;
    }

    public LocalTime getHoraDeReserva() {
        return horaDeReserva;
    }

    public void setHoraDeReserva(LocalTime horaDeReserva) {
        this.horaDeReserva = horaDeReserva;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCantidadDeTiquetes() {
        return cantidadDeTiquetes;
    }

    public void setCantidadDeTiquetes(int cantidadDeTiquetes) {
        this.cantidadDeTiquetes = cantidadDeTiquetes;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}