/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author juan
 */
public class Caseta {
    private  int id;
    private  Empresa empresa;
    private int cantidadPlazas;
    private double valorArrendo;
    
    public Caseta(int id){
        this.id=id;
        this.empresa=null;
        this.cantidadPlazas=0;
        this.valorArrendo=0.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public int getCantidadPlazas() {
        return cantidadPlazas;
    }

    public void setCantidadPlazas(int cantidadPlazas) {
        this.cantidadPlazas = cantidadPlazas;
    }

    public double getValorArrendo() {
        return valorArrendo;
    }

    public void setValorArrendo(double valorArrendo) {
        this.valorArrendo = valorArrendo;
    }
    
    
}
