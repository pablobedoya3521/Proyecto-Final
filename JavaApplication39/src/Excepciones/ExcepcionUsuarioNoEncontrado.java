/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

public class ExcepcionUsuarioNoEncontrado extends Exception{
       public ExcepcionUsuarioNoEncontrado(){
        super("Usuario no encontrado, debes de registrarte");
    }
}