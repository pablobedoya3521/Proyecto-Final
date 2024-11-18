/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.ExcepcionAsientosInsuficientes;
import Excepciones.ExcepcionCodigoTiqueteEnUso;
import Excepciones.ExcepcionMontoInsuficiente;
import Excepciones.ExcepcionReservaVacia;
import Excepciones.ExcepcionTiqueteVacio;
import Modelo.Tiquete;
import Modelo.Viaje;

public class ControladorViaje {
    private Viaje viaje;
    
    public ControladorViaje(Viaje viaje){
        this.viaje=viaje;
    }

    public void guardarTiquete(Tiquete tiquete) throws ExcepcionCodigoTiqueteEnUso, ExcepcionAsientosInsuficientes, ExcepcionMontoInsuficiente{
        viaje.guardarTiquete(tiquete);
    }
    
    public void buscarTiquete(int codigoTiquete) throws ExcepcionTiqueteVacio{
        viaje.buscarTiquete(codigoTiquete);
    }
    
    public void eliminarTiquete(int codigoTiquete)throws ExcepcionTiqueteVacio{
        viaje.eliminarTiquete(codigoTiquete);
    }
    
    public void modificarTiquete(Tiquete tiquete) throws ExcepcionTiqueteVacio{
        viaje.modificarTiquete(tiquete);
    }
    
    public void eliminarReserva(String codigoReserva) throws ExcepcionReservaVacia{
        viaje.eliminarReserva(codigoReserva);
    }
    
    public void guardarDEvolucion(Tiquete tiquete){
        viaje.guardarDevolucion(tiquete);
    }
}