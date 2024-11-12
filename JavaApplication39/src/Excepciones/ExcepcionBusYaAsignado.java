/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author juan
 */
public class ExcepcionBusYaAsignado extends Exception{

    public ExcepcionBusYaAsignado() {
        super("Lo siento, este bus ya está asignado a otro viaje");
    }
    
}
