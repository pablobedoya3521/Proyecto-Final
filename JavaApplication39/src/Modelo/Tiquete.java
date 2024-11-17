/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Persistencia.SerializadoraCaseta;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class Tiquete implements Serializable{
    private static final long serialVersionUID = 1L; 
    private static int contador = 1;
    private int codigoTiquete;
    private Viaje viaje;
    private Cliente cliente;
    private int cantidad;
    private LocalDate fechaDeCompra;
    private LocalTime horaDeCompra;
    private SerializadoraCaseta serializadoraCaseta; 
  
    
    public Tiquete(Viaje viaje,Cliente cliente, int cantidad){
        this.serializadoraCaseta= new SerializadoraCaseta();
        this.viaje=viaje;
        this.codigoTiquete=obtenerCodigo();
        this.cliente=cliente;
        this.cantidad=cantidad;
        this.fechaDeCompra=LocalDate.now();
        this.horaDeCompra=LocalTime.now().withNano(0);
        
    }
    
    private int obtenerCodigo() {
        Caseta[][] casetas = serializadoraCaseta.leerObjeto();
        int maxCodigo = 0;

        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                Empresa empresa = casetas[i][j].getEmpresa();
                if (empresa != null) {

                    for (int k = 0; k < empresa.getListaViajes().size(); k++) {
                        Viaje viajeActual = empresa.getListaViajes().get(k);
                        if (viajeActual.getId().equals(this.viaje.getId())) {

                            for (int l = 0; l < viajeActual.getListaTiquetes().size(); l++) {
                                Tiquete tiqueteActual = viajeActual.getListaTiquetes().get(l);
                                if (tiqueteActual.getCodigoTiquete() > maxCodigo) {
                                    maxCodigo = tiqueteActual.getCodigoTiquete();
                                }
                            }
                        }
                    }
                }
            }
        }

        return maxCodigo + 1;
    }

    public int getCodigoTiquete() {
        return codigoTiquete;
    }

    public void setCodigoTiquete(int codigo) {
        this.codigoTiquete = codigo;
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

    public LocalTime getHoraDeCompra() {
        return horaDeCompra;
    }

    public void setHoraDeCompra(LocalTime horaDeCompra) {
        this.horaDeCompra = horaDeCompra;
    }
    
}