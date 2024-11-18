/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author juan
 */
public class ExcepcionMontoInsuficiente extends Exception{
    public ExcepcionMontoInsuficiente(){
        super("Lo siento, no tienes el dinero suficiente");
    }
}
