/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;


public class ExcepcionBusVacio extends Exception {
    public ExcepcionBusVacio(){
        super("No existe ningun bus con esa placa");
    }
}
