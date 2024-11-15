/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author sebastian
 */
public class Tiquete implements Serializable{
    private static final long serialVersionUID = 1L; 
    private static int contador = 1;
    private int codigo;
    private Viaje viaje;
    private Cliente cliente;
    private int cantidad;
    private LocalDate fechaDeCompra;
    private LocalTime horaDeCompra;
  
    
    public Tiquete(Viaje viaje,Cliente cliente, int cantidad){
        this.codigo=contador++;
        this.viaje=viaje;
        this.cliente=cliente;
        this.cantidad=cantidad;
        this.fechaDeCompra=LocalDate.now();
        this.horaDeCompra=LocalTime.now();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(LocalDate fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }

}
