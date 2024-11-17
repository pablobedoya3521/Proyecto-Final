/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

public class ExcepcionIdDeViajeEnUso extends Exception{
    public ExcepcionIdDeViajeEnUso(){
        super("No se puede crear el viaje, id en uso");
    }
}