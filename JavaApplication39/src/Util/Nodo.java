/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

/**
 *
 * @author sebastian
 */
public class Nodo <T> {
    
    T dato;
    Nodo<T> siguente;

    public Nodo(T dato) {
        this.dato = dato;
        this.siguente = null;
    }
       
}
