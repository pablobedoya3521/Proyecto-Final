/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.ExcepcionBusVacio;
import Excepciones.ExcepcionBusYaRegistrado;
import Excepciones.ExcepcionCantidadPlazasNula;
import Excepciones.ExcepcionIdDeViajeEnUso;
import Excepciones.ExcepcionViajeVacio;
import Modelo.Bus;
import Modelo.Caseta;
import Modelo.Empresa;
import Modelo.Viaje;
import Persistencia.SerializadoraCaseta;

/**
 *
 * @author sebastian
 */
public class ControladorEmpresa{
    private Empresa empresa;
    private Caseta[][] casetas;
    private SerializadoraCaseta serializadora;
    
    public ControladorEmpresa(Empresa empresa){
        this.empresa=empresa;
        this.serializadora=new SerializadoraCaseta();
        this.casetas=serializadora.leerObjeto();
    }

    
    public Empresa getEmpresa() {
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; casetas[i].length < 10; j++) {
                if(casetas[i][j].getEmpresa()!=null && casetas[i][j].getEmpresa().getNit()==this.empresa.getNit()){ 
                    return casetas[i][j].getEmpresa();
                }
            }
        }
        return null;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    //Metodos del buss
    public void guardarBus(Bus bus) throws ExcepcionBusYaRegistrado, ExcepcionCantidadPlazasNula{
       empresa.guardarBus(bus);
    }
    
    public Bus buscarBus(String placa) throws ExcepcionBusVacio{
        return empresa.buscarBus(placa);
    }
    
    public void modificarBus(Bus bus) throws ExcepcionBusVacio{
        empresa.modificarBus(bus);
    }
    
    public void eliminarBus(String placa) throws ExcepcionBusVacio{
       empresa.eliminarBus(placa);
    }
   
   //metodos del viaje
    
    public void guardarViaje(Viaje viaje) throws ExcepcionIdDeViajeEnUso{
        empresa.guardarViaje(viaje);
    }
    
    public Viaje buscarViaje(String id) throws ExcepcionViajeVacio{
        return empresa.buscarViaje(id);
    }
    
    public void eliminarViaje(String id) throws ExcepcionViajeVacio{
        empresa.eliminarViaje(id);
    }
    
    public void modificarViaje(Viaje viaje)throws ExcepcionViajeVacio{
        empresa.modificarViaje(viaje);
    }

}
