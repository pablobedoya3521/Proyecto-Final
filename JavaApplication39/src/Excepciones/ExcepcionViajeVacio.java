/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author sebastian
 */
public class ExcepcionViajeVacio extends Exception{
    public ExcepcionViajeVacio(){
        super("No se puede crear el tiquete, no hay viaje disponible");
    }
}
