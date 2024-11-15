/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

public class ExcepcionBusYaRegistrado extends Exception{

    public ExcepcionBusYaRegistrado() {
        super("Lo siento, ya hay un bus registrado con esta placa");
    }
    
}
