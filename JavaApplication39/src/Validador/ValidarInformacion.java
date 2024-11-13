/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validador;

import Controlador.ControladorCasetas;
import Controlador.ControladorRegistro;
import Modelo.AdministradorFlota;
import Modelo.Cliente;

/**
 *
 * @author juan
 */
public class ValidarInformacion {
    private ControladorRegistro controladorRegistro;
    private ControladorCasetas controladorCaseta;
    
    public ValidarInformacion(){
        this.controladorRegistro=new ControladorRegistro();
        this.controladorCaseta= new ControladorCasetas();
    }
    
    public Object validarInformacion(String correo) {
        for (int i = 0; i < controladorRegistro.getUsuarios().size(); i++) {
            if (controladorRegistro.getUsuarios().get(i).getCorreo().equals(correo)) {
                if (controladorRegistro.getUsuarios().get(i) instanceof Cliente) {
                    return controladorRegistro.getUsuarios().get(i);
                } else if (controladorRegistro.getUsuarios().get(i) instanceof AdministradorFlota) {
                    for (int k = 0; k < controladorCaseta.getCaseta().length; k++) {
                        for (int l = 0; l < controladorCaseta.getCaseta()[k].length; l++) { 
                            if(controladorCaseta.getCaseta()[k][l].getEmpresa()!=null){
                                if (controladorCaseta.getCaseta()[k][l].getEmpresa().getAdministradorFlota().getCorreo().equals(correo)) {
                                    return controladorCaseta.getCaseta()[k][l].getEmpresa();
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

}
