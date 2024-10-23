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
public class Lista {
    private Nodo primero;
    private int size;
    
    public Lista(){
        this.primero=null;
        this.size=0;
    }
    
    public int size(){
        return this.size;
    }
    
    public void add(Persona dato){
        Nodo nuevoNodo=new Nodo(dato);
        
        if(primero==null){
            primero=nuevoNodo;
        }else{
            Nodo referencia = primero;
            while(referencia.siguiente!=null){
                referencia=referencia.siguiente;
            }
            referencia.siguiente=nuevoNodo;
        }
        size++;
    }
    
    public Persona get(int index){
        if(index==0){
            return primero.dato;
        }else{
            Nodo referencia = primero;
            int contador=0;
            while(contador<index){
                referencia=referencia.siguiente;
                contador++;
            }
            return referencia.dato;
        }
    }
    
    public void remove(int index){
        if(index==0){
            primero=primero.siguiente;
        }else{
            Nodo referencia= primero;
            int contador=0;
            while(contador<index-1){
                referencia=referencia.siguiente;
                contador++;
            }
            
            referencia.siguiente=referencia.siguiente.siguiente;
        }
        size--;
    }
    
    public boolean isEmpty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }
    
    public void insert(int index, Persona dato){
        Nodo nuevoNodo= new Nodo(dato);
        if(index==0){
            nuevoNodo.siguiente=primero;
            primero=nuevoNodo;
        }else{
            Nodo referencia = primero;
            int contador=0;
            while(contador<index-1){
                referencia=referencia.siguiente;
                contador++;
            }
            nuevoNodo.siguiente=referencia.siguiente.siguiente;
            referencia.siguiente=nuevoNodo;
        }
        size++;
    }
}
