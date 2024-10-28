/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validador;

import Controlador.ControladorRegistro;
import Vista.VentanaAdminFlota.VentanaPrincipalAdminFlota;
import Vista.VentanaAdminTerminal.VentanaPrincipalAdminTerminal;
import Vista.VentanasCliente.VentanaPrincipalCliente;

/**
 *
 * @author juan
 */
public class ValidarIdentificacionUsuario {
    private ControladorRegistro controladorRegistro;
    public ValidarIdentificacionUsuario(ControladorRegistro controladorRegistro){
        this.controladorRegistro=controladorRegistro;
    }
    
    
    public Object IdentificarUsuario(String correo, String contraseña){
      for(int i=0; i<controladorRegistro.getClientes().size();i++){
          if(controladorRegistro.getClientes().get(i).getCorreo().equals(correo)){
           return new VentanaPrincipalCliente(this.controladorRegistro);
          }     
      }
      
      for(int i=0; i<controladorRegistro.getAdministradoresFlota().size();i++){
          if(controladorRegistro.getAdministradoresFlota().get(i).getCorreo().equals(correo)){
              return new VentanaPrincipalAdminFlota(this.controladorRegistro);
          }
      }
      
      for(int i=0; i<controladorRegistro.getAdministradoresTerminal().size();i++){
          if(controladorRegistro.getAdministradoresTerminal().get(i).getCorreo().equals(correo)){
              return new VentanaPrincipalAdminTerminal(this.controladorRegistro);
          }
      }
      
       return null;
    }
}
