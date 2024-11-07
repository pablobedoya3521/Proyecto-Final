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
public class Tiquete implements Serializable{
     private static final long serialVersionUID = 1L; 
    private String codigo;
    private Viaje viaje;
    private Cliente cliente;
    private int cantidad;
    private String fechaDeCompra;
    
    public Tiquete(String codigo,Viaje viaje,Cliente cliente, int cantidad,String fechaDeCompra){
        this.codigo=codigo;
        this.viaje=viaje;
        this.cliente=cliente;
        this.cantidad=cantidad;
        this.fechaDeCompra=fechaDeCompra;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
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

    public String getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(String fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }
    
    
}
