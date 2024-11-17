/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author juan
 */
public class ExcepcionCodigoReservaEnUso extends Exception{
    public ExcepcionCodigoReservaEnUso(){
        super("Codigo de reserva ya esta en uso");
    }
}
