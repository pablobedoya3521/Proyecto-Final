/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validador;
import Controlador.ControladorRegistro;
import Excepciones.ExcepcionContraseñaIncorrecta;


/**
 *
 * @author juan
 */
public class ValidarContraseña {
    private ControladorRegistro controladorRegistro;
    
    public ValidarContraseña(){
        this.controladorRegistro=new ControladorRegistro();
    }
    
    public void ValidarContraseña(String correo, String contraseña) throws ExcepcionContraseñaIncorrecta{
        
        for(int i=0; i<controladorRegistro.getClientes().size();i++){
            if(controladorRegistro.getClientes().get(i).getCorreo().equals(correo)){
                if(!(controladorRegistro.getClientes().get(i).getContraseña().equals(contraseña))){
                   throw new ExcepcionContraseñaIncorrecta();
                }
            }     
        }
        
        for(int i=0; i<controladorRegistro.getAdministradoresFlota().size();i++){
            if(controladorRegistro.getAdministradoresFlota().get(i).getCorreo().equals(correo)){
                if(!(controladorRegistro.getAdministradoresFlota().get(i).getContraseña().equals(contraseña))){
                    throw new ExcepcionContraseñaIncorrecta();
                }
            }
        }
        
        if(controladorRegistro.getAdministradorTerminal().getCorreo().equals(correo)){
           if(!(controladorRegistro.getAdministradorTerminal().getContraseña().equals(contraseña))){
              throw new ExcepcionContraseñaIncorrecta();
           }
        }
        
        
    }
}
