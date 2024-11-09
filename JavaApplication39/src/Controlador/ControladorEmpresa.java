/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Bus;
import Modelo.Empresa;

/**
 *
 * @author sebastian
 */
public class ControladorEmpresa {
    private Empresa empresa;

    
    public ControladorEmpresa(Empresa empresa){
        this.empresa=empresa;
    }

    
    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    //Metodos
    public String guardarBus(Bus bus){
        return empresa.guardarBus(bus);
    }
    
    public Bus buscarBus(String placa){
        return empresa.buscarBus(placa);
    }
   
}
