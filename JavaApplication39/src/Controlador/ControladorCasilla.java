/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Caseta;

/**
 *
 * @author sebastian
 */
public class ControladorCasilla {
     private Caseta[][] casetas;
    private int contador;
    
    public ControladorCasilla(){
        casetas = new Caseta[4][]; // Elimina la declaración de la variable local
        casetas[0] = new Caseta[5];
        casetas[1] = new Caseta[2];
        casetas[2] = new Caseta[2];
        casetas[3] = new Caseta[2];
        initCasetas();
        
    }
     
    private void initCasetas(){
         for(int i=0; i<casetas.length;i++){
             for(int j=0; j<casetas[i].length;j++){
                casetas[i][j]=new Caseta(contador++);   
             }
         }
    }
    
    public Caseta entregarCaseta(int fila, int columna){
        return casetas[fila][columna];
    }

    public Caseta[][] getLockers() {
        return casetas;
    }

    public void setLockers(Caseta[][] casetas) {
        this.casetas = casetas;
    }

    

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
