/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validador;


import Controlador.ControladorRegistro;
import Excepciones.ExcepcionContraseñaIncorrecta;
import Excepciones.ExcepcionUsuarioNoEncontrado;
import Vista.VentanaAdminFlota.VentanaPrincipalAdminFlota;
import Vista.VentanaAdminTerminal.VentanaPrincipalAdminTerminal;
import Vista.VentanasCliente.VentanaPrincipalCliente;

/**
 *
 * @author juan
 */
public class ValidarIdentificacionUsuario {
    private ControladorRegistro controladorRegistro;
   
    public ValidarIdentificacionUsuario(){
        this.controladorRegistro=new ControladorRegistro();
    }
    
    public Object IdentificarUsuario(String correo, String contraseña) throws ExcepcionContraseñaIncorrecta, ExcepcionUsuarioNoEncontrado{
        for(int i=0; i<controladorRegistro.getClientes().size();i++){
          if(controladorRegistro.getClientes().get(i).getCorreo().equals(correo)){
           return new VentanaPrincipalCliente();
          }     
        }
      
        for(int i=0; i<controladorRegistro.getAdministradoresFlota().size();i++){
            if(controladorRegistro.getAdministradoresFlota().get(i).getCorreo().equals(correo)){
              return new VentanaPrincipalAdminFlota();
            }
        }
      
        if(controladorRegistro.getAdministradorTerminal().getCorreo().equals(correo)){
            return new VentanaPrincipalAdminTerminal();
        }
   
        throw new ExcepcionUsuarioNoEncontrado();
    }
}
