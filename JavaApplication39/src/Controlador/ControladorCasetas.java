/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Caseta;
import Modelo.Empresa;
import Persistencia.SerializadoraCaseta;
import java.io.Serializable;


public class ControladorCasetas implements Serializable{
    private static final long serialVersionUID = 1L;
    private Caseta caseta;
    private SerializadoraCaseta serializadora;
    
    public ControladorCasetas(Caseta caseta){
        this.caseta=caseta;
        this.serializadora = new SerializadoraCaseta();
    }
    
    public ControladorCasetas(){
        this.serializadora=new SerializadoraCaseta();
    }
    
    public boolean AsignarEmpresa(Empresa empresa) {
        Caseta[][] casetas = serializadora.leerObjeto();
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                if (casetas[i][j].getId() == caseta.getId()) {
                    boolean resp = casetas[i][j].asignarEmpresa(empresa);
                    if (resp) {
                        serializadora.escribirObjeto(casetas);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean asignarValorArrendamiento(double valor){
        Caseta[][] casetas = serializadora.leerObjeto();
         for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                if (casetas[i][j].getId() == caseta.getId()) {
                   casetas[i][j].setValorArrendamiento(valor);             
                        serializadora.escribirObjeto(casetas);
                        return true;
                }
            }
        }
        return false;
    }
    
    public boolean asignarCantidadPlazas(int plazas){
        Caseta[][] casetas= serializadora.leerObjeto();
                 for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                if (casetas[i][j].getId() == caseta.getId()) {
                        casetas[i][j].setCantidadPlazas(plazas);
                        serializadora.escribirObjeto(casetas);
                        return true;
                }
            }
        }
        return false;
    }
    
    public boolean asignarUbicacion(String ubicacion){
        Caseta[][] casetas= serializadora.leerObjeto();
                 for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                if (casetas[i][j].getId() == caseta.getId()) {
                    casetas[i][j].setUbicacion(ubicacion);
                        serializadora.escribirObjeto(casetas);
                        return true;
                }
            }
        }
        return false;
    }
    
    public Caseta entregarCaseta(int fila, int columna){
        Caseta[][] casetas= serializadora.leerObjeto();
        return casetas[fila][columna];
    }
    
    public Caseta[][] getCaseta() {
        Caseta[][] casetas= serializadora.leerObjeto();
        return casetas;
    }
}