/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import Modelo.Persona;

/**
 *
 * @author juan
 */
public class Nodo {
    Persona dato;
    Nodo siguiente;
    
    public Nodo(Persona persona){
        this.dato=persona;
        siguiente=null;
    }
}
