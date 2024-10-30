/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

/**
 *
 * @author sebastian
 */
public class Lista<S> implements ILista<S>{
    private Nodo<S> primero;
    private int size;
    
    public Lista(){
        this.primero=null;
        this.size=0;
    }
    
    public int size(){
        return this.size;
    }
    
    public void add(S dato){
        Nodo<S> nuevo=new Nodo(dato);
        if(primero==null){
            primero=nuevo;
        }else{
            Nodo<S> aux  = primero;
            while(aux.siguente!=null){
                aux=aux.siguente;
            }
            aux.siguente=nuevo;
        }
        size++;
    }
    
    public S get(int index){
        if(index==0){
            return primero.dato;
        }
        else{
            Nodo<S> aux=primero;
            int contador=0;
            while(contador < index){
                aux=aux.siguente;
                contador++;
            }
            return aux.dato;
        }
    }
    
    public void remove(int posicion){
        if(posicion==0){
            primero=primero.siguente;
        }else{
            Nodo referencia=primero;
            int contador=0;
            
            while(contador < posicion-1){
                referencia=referencia.siguente;
                contador++;
            }
            
            referencia.siguente=referencia.siguente.siguente;
        
        }
        
        size--;
    }
    
    public boolean isEmpty(){
        return size==0;
     }
    
    
    
    public void insert(int posicion,S valor){
        Nodo<S> nodoNuevo=new Nodo(valor);
        if(posicion==0){
            nodoNuevo.siguente=primero;
            primero=nodoNuevo;
        }else{
            Nodo referencia=primero;
            int contador=0;
            
            while(contador < posicion-1){
                referencia=referencia.siguente;
                contador++;
            
            }
            nodoNuevo.siguente=referencia.siguente;
            referencia.siguente=nodoNuevo;
        }
    }
}

