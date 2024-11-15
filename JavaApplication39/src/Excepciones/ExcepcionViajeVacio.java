/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;


public class ExcepcionViajeVacio extends Exception{
    public ExcepcionViajeVacio(){
        super("No existe ningun viaje con este ID");
    }
}
