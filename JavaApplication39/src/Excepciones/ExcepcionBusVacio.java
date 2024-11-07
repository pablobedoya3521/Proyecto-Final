/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author sebastian
 */
public class ExcepcionBusVacio extends Exception {
    public ExcepcionBusVacio(){
        super("No se puede crear el viaje, no hay bus disponible");
    }
}
