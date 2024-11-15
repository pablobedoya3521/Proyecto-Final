/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;



import java.io.Serializable;


public class Bus implements Serializable{
    private static final long serialVersionUID = 1L;
    private String placa;
    private int numAsientos;
    private String marca;
    private String modelo;
    private String tipoCombustible;
    private String potenciaMotor;

    public Bus(String placa,int numAsientos, String marca, String modelo, String tipoCombustible, String potenciaMotor) {
        this.placa=placa;
        this.numAsientos = numAsientos;
        this.marca=marca;
        this.modelo=modelo;
        this.tipoCombustible=tipoCombustible;
        this.potenciaMotor=potenciaMotor;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(String potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }
    
    

}
