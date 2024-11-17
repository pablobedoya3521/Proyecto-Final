/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

public class ExcepcionTiqueteVacio extends Exception{

    public ExcepcionTiqueteVacio() {
        super("No existe ningun tiquete con este id");
    }
    
}