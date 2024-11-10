/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Caseta;
import Persistencia.SerializadoraCaseta;
import java.io.Serializable;

/**
 *
 * @author juan
 */
public class ControladorCasilla implements Serializable{
    private static final long serialVersionUID = 1L;
    private SerializadoraCaseta serializadoraCaseta;
    private Caseta[][] casetas;
    private int contador;
    
    public ControladorCasilla() { 
        this.serializadoraCaseta=new SerializadoraCaseta();
        casetas= serializadoraCaseta.leerObjeto();
    }
      
    public Caseta entregarCaseta(int fila, int columna){
        return casetas[fila][columna];
    }

    public Caseta[][] getCaseta() {
        return casetas;
    }

    public void setCaseta(Caseta[][] auditorios) {
        this.casetas = auditorios;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

}
