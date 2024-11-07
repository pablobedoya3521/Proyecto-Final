/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.io.Serializable;

/**
 *
 * @author juan
 */
public class Lista<S> implements IList<S>, Serializable{
    
    private Nodo<S> primero;
    private int size;
    
    public Lista(){
        this.primero=null;
        this.size=0;
    }
    
    public int size(){
        return this.size;
    }
    
    public void add(S dato){//recibe el dato que ira guardado en el nodo
        Nodo<S> nuevoNodo= new Nodo(dato);//creo un objeto tipo nodo el cual recibe ese dato se lo asigna y crea el siguiente nodo null
        if(primero==null){//para guardar ese nodo en la lista, debemos recorrer la lista hasta encontrar un null, por defecto la lista cuando apenas se inicializa, el primer valor el null
                          //por ende, si la primera posicion esta nula, de una, que la guarde ahi..., sino pues tendra que seguir avanzando hasta encontrar el espacion null
            primero=nuevoNodo;//asigno en la primera posicion el nodo
        }else{//desde aca empieza a recorrer para encontrar la posicion null
            Nodo<S> referencia = primero; 
           while(referencia.siguiente!=null){//busco algun nodo null para guardar el nodo
               referencia=referencia.siguiente;
           }
           referencia.siguiente=nuevoNodo;//guardo en la posicion nula el valor que se creo
        }
        size++;//incremento 1 al tamaño de la lista
    }
    
    public S get(int index){
        if(index==0){
            return primero.dato;
        }else{
            Nodo<S> referencia = primero;
            int contador =0;
            while(contador<index){
                referencia= referencia.siguiente;
                contador++;
            }
            return referencia.dato;
            
            
           /* for(int contador=0; contador<index;contador++ ){
                 referencia= referencia.siguiente;
            }
            return referencia.dato;*/
           
           
        }
    }
    
    public void remove(int index){
        if(index==0){                        
            primero=primero.siguiente;
        }else{
            Nodo<S> referencia = primero;
            int contador=0;
            while(contador<index-1){//pongo -1 para llegar al nodo anterior al que deseo eliminar... y asi dejo de apuntar al siguiente, mejor apunto al siguiente del siguiente
                referencia=referencia.siguiente;
                contador++;//incremento al contador
            }
              
           referencia.siguiente = referencia.siguiente.siguiente;//el anterior nodo del que voy a eliminar debe de apuntar al proximo del cual se quiere eliminar
        }
        size--;//le resto al tamaño, y me conviene ya que asi no estare llenado una lista y apuntando a null
    }
    
    public boolean isEmpty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }
    
    public void insert(int index, S dato){
        Nodo<S> nuevoNodo=new Nodo(dato);
        if(index==0){
            nuevoNodo.siguiente=primero;
            primero=nuevoNodo;     
        }else{
            Nodo<S> referencia=primero;
            int contador=0;
            while(contador<index-1){
                referencia=referencia.siguiente;
                contador++;
            }
            nuevoNodo.siguiente=referencia.siguiente;
            referencia.siguiente=nuevoNodo;  
        }
        size++;
    }
}