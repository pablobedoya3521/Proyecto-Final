/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Excepciones.ExcepcionCodigoTiqueteEnUso;
import Excepciones.ExcepcionViajeVacio;
import Persistencia.SerializadoraCaseta;
import Util.Lista;
import java.io.Serializable;
import java.time.LocalDate;


public class Viaje implements Serializable{
    private static final long serialVersionUID = 1L;
    private String id;
    private String origen;
    private String destino;
    private String horaDeSalida;
    private String horaDeLlegada;
    private String fechaSalida;
    private String fechaLLegada;
    private LocalDate fechaCreacion;
    private Bus bus;
    private double precioViaje;
    private String estado;
    private Lista<Tiquete> listaTiquetes;
    private SerializadoraCaseta serializadora;

    public Viaje(String id, String origen, String destino, String horaDeSalida, 
            String horaDeLlegada, String fechaSalida, String fechaLLegada, Bus bus, double precioViaje) {
        
        this.id=id;
        this.origen = origen;
        this.destino = destino;
        this.horaDeSalida=horaDeSalida;
        this.horaDeLlegada = horaDeLlegada;
        this.fechaSalida=fechaSalida;
        this.fechaLLegada=fechaLLegada;
        this.fechaCreacion = LocalDate.now();
        this.bus = bus;
        this.precioViaje = precioViaje;
        this.estado="Programado";
        this.listaTiquetes=new Lista<>();
        this.serializadora=new SerializadoraCaseta();
    }
    
    public void guardarTiquete(Tiquete tiquete) throws ExcepcionCodigoTiqueteEnUso, ExcepcionViajeVacio{
        Caseta[][] casetas= serializadora.leerObjeto();
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                if(casetas[i][j].getEmpresa()!=null && 
                        casetas[i][j].getEmpresa().getListaViajes().get(i).getListaTiquetes().get(i).getCodigo()==tiquete.getCodigo()){
                    throw new ExcepcionCodigoTiqueteEnUso();
                }
            }
        }
        
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                if(casetas[i][j].getEmpresa()!=null &&
                        casetas[i][j].getEmpresa().getListaViajes().get(i).getId().equals(this.id)){
                    
                    Empresa empresa = casetas[i][j].getEmpresa();
                    Viaje viaje = casetas[i][j].getEmpresa().getListaViajes().get(i);
                    viaje.guardarTiquete(tiquete);
                    viaje.setListaTiquetes(listaTiquetes);
                    empresa.modificarViaje(this);
                    casetas[i][j].setEmpresa(empresa);
                    serializadora.escribirObjeto(casetas);
                }
            }
        }
        
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

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaLLegada() {
        return fechaLLegada;
    }

    public void setFechaLLegada(String fechaLLegada) {
        this.fechaLLegada = fechaLLegada;
    }

    public Lista<Tiquete> getListaTiquetes() {
        return listaTiquetes;
    }

    public void setListaTiquetes(Lista<Tiquete> listaTiquetes) {
        this.listaTiquetes = listaTiquetes;
    }
  
}
