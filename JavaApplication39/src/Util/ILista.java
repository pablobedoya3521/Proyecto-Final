/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Util;

/**
 *
 * @author sebastian
 */
public interface ILista<T> {
    
    public void add (T dato);
    
    public T get(int index);
    
    public void insert (int index, T dato);
    
    public void remove(int index);
    
    public boolean isEmpty();
    
    public int size();
}
