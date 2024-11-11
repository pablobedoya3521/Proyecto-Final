/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.ExcepcionBusVacio;
import Excepciones.ExcepcionBusYaRegistrado;
import Modelo.Bus;
import Modelo.Empresa;
import Modelo.Viaje;

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
    public void guardarBus(Bus bus) throws ExcepcionBusYaRegistrado{
       empresa.guardarBus(bus);
    }
    
    public Bus buscarBus(String placa){
        return empresa.buscarBus(placa);
    }
    
    public String guardarViaje(Viaje viaje){
        return empresa.guardarViaje(viaje);
    }
    
    public void eliminarBus(String placa) throws ExcepcionBusVacio{
       empresa.eliminarBus(placa);
    }
   
    public void modificarBus(Bus bus) throws ExcepcionBusVacio{
        empresa.modificarBus(bus);
    }
}
