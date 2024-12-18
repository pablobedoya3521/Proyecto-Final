/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;

public class Caseta implements Serializable{
    private static final long serialVersionUID = 1L;
    private int id;
    private Empresa empresa;
    private double valorArrendamiento;
    private int cantidadPlazas;
    private String ubicacion;
    
    public Caseta(int id){
        this.id=id;
        this.empresa=null;
        this.valorArrendamiento=0.0;
        this.cantidadPlazas=0;
        this.ubicacion=null;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public double getValorArrendamiento() {
        return valorArrendamiento;
    }

    public void setValorArrendamiento(double valorArrendamiento) {
        this.valorArrendamiento = valorArrendamiento;
    }

    public int getCantidadPlazas() {
        return cantidadPlazas;
    }

    public void setCantidadPlazas(int cantidadPlazas) {
        this.cantidadPlazas = cantidadPlazas;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public boolean asignarEmpresa(Empresa empresa){
        if(this.empresa==null){
            this.empresa=empresa;
            return true;
        }
       return false;
    }

}