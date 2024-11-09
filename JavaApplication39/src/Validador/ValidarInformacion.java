/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validador;

import Controlador.ControladorCasilla;
import Controlador.ControladorRegistro;
import Modelo.AdministradorFlota;
import Modelo.Cliente;

/**
 *
 * @author juan
 */
public class ValidarInformacion {
    private ControladorRegistro controladorRegistro;
    private ControladorCasilla controladorCasillas;
    
    public ValidarInformacion(){
        this.controladorRegistro=new ControladorRegistro();
        this.controladorCasillas= new ControladorCasilla();
    }
    
public Object validarInformacion(String correo) {
    for (int i = 0; i < controladorRegistro.getUsuarios().size(); i++) {
        if (controladorRegistro.getUsuarios().get(i).getCorreo().equals(correo)) {
            if (controladorRegistro.getUsuarios().get(i) instanceof Cliente) {
                return controladorRegistro.getUsuarios().get(i);
            } else if (controladorRegistro.getUsuarios().get(i) instanceof AdministradorFlota) {
                for (int k = 0; k < controladorCasillas.getCaseta().length; k++) {
                    for (int l = 0; l < controladorCasillas.getCaseta()[k].length; l++) { // Cambiar i por k
                        if (controladorCasillas.getCaseta()[k][l].getEmpresa().getAdministradorFlota().getCorreo().equals(correo)) {
                            return controladorCasillas.getCaseta()[k][l].getEmpresa();
                        }
                    }
                }
            }
        }
    }
    return null;
}
    
    
}
