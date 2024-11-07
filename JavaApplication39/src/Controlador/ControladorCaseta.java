/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Caseta;
import Modelo.Empresa;

/**
 *
 * @author sebastian
 */
public class ControladorCaseta {
    private Caseta caseta;
    
    public ControladorCaseta(Caseta caseta){
        this.caseta=caseta;
    }
    
    public boolean asignarEmpresa(Empresa empresa){
        return caseta.asignarEmpresa(empresa);
    }
}
