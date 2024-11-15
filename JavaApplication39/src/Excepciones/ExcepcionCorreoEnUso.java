/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;


public class ExcepcionCorreoEnUso extends Exception {
    
    public ExcepcionCorreoEnUso(){
        super("Lo siento éste correo ya esta en uso");
    }
}
