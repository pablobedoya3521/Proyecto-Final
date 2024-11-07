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
    
    
}
