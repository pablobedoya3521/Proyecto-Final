/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author juan
 */
public class ExcepcionBusNoDisponible extends Exception{
    public ExcepcionBusNoDisponible(){
        super("Este bus no se encuentra disponible en ese lapso de tiempo");
    }
}
