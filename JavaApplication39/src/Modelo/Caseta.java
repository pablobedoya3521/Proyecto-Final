/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author juan
 */
public class Caseta implements Serializable{
    private int id;
    private Empresa empresa;
    private double valorArrendamiento;
    private int cantidadPlazas;
    
    public Caseta(int id){
        this.id=id;
        this.empresa=null;
        this.valorArrendamiento=0.0;
        this.cantidadPlazas=0;
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
    
    public boolean asignarEmpresa(Empresa empresa){
        if(this.empresa==null){
            this.empresa=empresa;
            return true;
        }
       return false;
    }
    
    public boolean asignarValorArrendamiento(double valor){
        this.valorArrendamiento=valor;
        return true;
    }
    
    public boolean asignarCantidadPlazas(int plazas){
        this.cantidadPlazas=plazas;
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}