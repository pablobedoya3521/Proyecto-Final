/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

public class ExcepcionContraseñaIncorrecta extends Exception {
    public ExcepcionContraseñaIncorrecta(){
        super("Contraseña Incorrecta, inténtalo de nuevo");
    }
}