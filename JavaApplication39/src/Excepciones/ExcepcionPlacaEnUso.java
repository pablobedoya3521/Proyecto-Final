/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author sebastian
 */
public class ExcepcionPlacaEnUso extends Exception{
    public ExcepcionPlacaEnUso(){
        super("No se puede crear el bus, placa en uso");
    }
}
