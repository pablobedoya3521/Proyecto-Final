/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Bus;
import Modelo.Viaje;
import Persistencia.SerializadoraBus;
import Persistencia.SerializadoraViaje;
import java.util.ArrayList;

/**
 *
 * @author sebastian
 */
public class ControladorEmpresa {
    private ArrayList<Viaje> viajes;
    private ArrayList<Bus> buses;
    private SerializadoraBus serializadoraBus;
    private SerializadoraViaje serializadoraViaje;
    
    public ControladorEmpresa(){
        
        this.serializadoraBus=new SerializadoraBus();
        this.serializadoraViaje=new SerializadoraViaje();
        this.viajes=serializadoraViaje.leerObjeto();
        this.buses=serializadoraBus.leerObjeto();
    }
    
    //Metodos
    
    public boolean guardarViaje(Viaje viaje){
    Viaje aux=buscarViaje(viaje.getId());
        if(aux == null){
            viajes.add(viaje);
            return true;
        }
        return false;
    }
    
    public Viaje buscarViaje(int id){
        for(int i=0; i<viajes.size(); i++){
            if(viajes.get(i).getId()==id){
                return viajes.get(i);
            }
        }
        return null;
    }
    
     public boolean eliminarViaje(int cedula){
        for(int i=0; i<viajes.size(); i++){
            if(viajes.get(i).getId() == cedula){
                viajes.remove(i);
                return true;
            }
        }
        return false;
    } 
     
      public boolean modificarViaje(Viaje viaje){
      Viaje aux=buscarViaje(viaje.getId());
      
      if(aux != null){
          aux.setOrigen(viaje.getOrigen());
          aux.setDestino(viaje.getDestino());
          aux.setHoraDeSalida(viaje.getHoraDeSalida());
          aux.setHoraDeLlegada(viaje.getHoraDeLlegada());
          aux.setBus(viaje.getBus());
          aux.setPrecioViaje(viaje.getPrecioViaje());
          
          return true;
      }
      return false;
    }    
      
    public boolean guardarBus(Bus bus){
    Bus aux=buscarBus(bus.getPlaca());
        if(aux == null){
            buses.add(bus);
            return true;
        }
        return false;
    }
    
    public Bus buscarBus(String placa){
        for(int i=0; i<buses.size(); i++){
            if(buses.get(i).getPlaca().equals(placa)){
                return buses.get(i);
            }
        }
        return null;
    }
    
     public boolean eliminarBus(String placa){
        for(int i=0; i<buses.size(); i++){
            if(buses.get(i).getPlaca().equals(placa)){
                buses.remove(i);
                return true;
            }
        }
        return false;
    } 
     
      public boolean modificarBus(Bus bus){
      Bus aux=buscarBus(bus.getPlaca());
      
      if(aux != null){
          aux.setPlaca(bus.getPlaca());
          aux.setNumAsientos(bus.getNumAsientos());
          
          return true;
      }
      return false;
    }    
}
