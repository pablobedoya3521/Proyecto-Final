/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

public class ExcepcionCantidadPlazasNula extends Exception{
    public ExcepcionCantidadPlazasNula() {
        super("Lo siento, No hay mas plazas disponibles");
    }
}