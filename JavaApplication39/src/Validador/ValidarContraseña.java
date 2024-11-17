/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validador;
import Controlador.ControladorRegistro;
import Excepciones.ExcepcionContraseñaIncorrecta;

public class ValidarContraseña {
    private ControladorRegistro controladorRegistro;
    
    public ValidarContraseña(){
        this.controladorRegistro=new ControladorRegistro();
    }
    
    public void ValidarContraseña(String correo, String contraseña) throws ExcepcionContraseñaIncorrecta{
        
        for(int i=0; i<controladorRegistro.getUsuarios().size();i++){
            if(controladorRegistro.getUsuarios().get(i).getCorreo().equals(correo)){
                if(!(controladorRegistro.getUsuarios().get(i).getContraseña().equals(contraseña))){
                   throw new ExcepcionContraseñaIncorrecta();
                }
            }     
        }
    }
}