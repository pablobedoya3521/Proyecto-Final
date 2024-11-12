/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import Excepciones.ExcepcionBusVacio;
import Persistencia.SerializadoraCaseta;
import java.io.Serializable;

/**
 *
 * @author sebastian
 */
public class Bus implements Serializable{
    private static final long serialVersionUID = 1L;
    private String placa;
    private int numAsientos;
    private Viaje viaje;
    private boolean estado;
    private SerializadoraCaseta serializadora;

    public Bus(String placa,int numAsientos) {
        this.placa=placa;
        this.numAsientos = numAsientos;
        this.viaje = null;
        this.estado=false;
        this.serializadora= new SerializadoraCaseta();
    }
    
    public Bus(){
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }
    
public boolean asignarViajeAbus(Viaje viaje) throws ExcepcionBusVacio {
    Caseta[][] casetas = serializadora.leerObjeto();
    System.out.println("Buscando en casetas..."); // Mensaje de depuración
    for (int i = 0; i < casetas.length; i++) {
        for (int j = 0; j < casetas[i].length; j++) {
            if (casetas[i][j].getEmpresa() != null) {
                System.out.println("Empresa encontrada: " + casetas[i][j].getEmpresa().getNombreEmpresa()); //Mensaje de depuración
                for (int k = 0; k < casetas[i][j].getEmpresa().getListaBuses().size(); k++) {
                    Bus busActual = casetas[i][j].getEmpresa().getListaBuses().get(k);
                    System.out.println("Bus encontrado: " + busActual.getPlaca()); // Mensaje de depuración
                    if (busActual.getPlaca().equals(this.placa)) {
                        busActual.setViaje(viaje); //Asigna el viaje directamente
                        busActual.setEstado(true); //Cambia el estado
                        serializadora.escribirObjeto(casetas);
                        System.out.println("Viaje asignado al bus: " + busActual.getPlaca()); //Mensaje de depuración
                        return true;
                    }
                }
            }
        }
    }
    
    System.out.println("No se encontró el bus con la placa: " + this.placa); // Mensaje de depuración
    return false;
}
    
    public void desasignarViaje(){
        this.viaje=null;
        
    }
    
   

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
