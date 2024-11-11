/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Caseta;
import Modelo.Empresa;
import Persistencia.SerializadoraCaseta;

/**
 *
 * @author juan
 */
public class ControladorCaseta {
    private Caseta caseta;
    private SerializadoraCaseta serializadora;

    
    public ControladorCaseta(Caseta caseta){
        this.caseta=caseta;
        this.serializadora = new SerializadoraCaseta();
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
                    boolean resp = casetas[i][j].asignarValorArrendamiento(valor);
                    if (resp) {
                        serializadora.escribirObjeto(casetas);
                        return true;
                    }
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
                    boolean resp = casetas[i][j].asignarCantidadPlazas(plazas);
                    if (resp) {
                        serializadora.escribirObjeto(casetas);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
}