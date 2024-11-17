/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author juan
 */
public class ExcepcionReservaVacia extends Exception{
    public ExcepcionReservaVacia(){
        super("No hay ninguna reserva con este codigo");
    }
}
