/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.ExcepcionCodigoTiqueteEnUso;
import Excepciones.ExcepcionViajeVacio;
import Modelo.Tiquete;
import Modelo.Viaje;


public class ControladorViaje {
    private Viaje viaje;
    public ControladorViaje(Viaje viaje){
        this.viaje=viaje;
    }

    public void guardarTiquete(Tiquete tiquete) throws ExcepcionCodigoTiqueteEnUso{
        viaje.guardarTiquete(tiquete);
    }
    
    public void buscarTiquete(int codigoTiquete) throws ExcepcionViajeVacio{
        viaje.buscarTiquete(codigoTiquete);
    }
    
    public void eliminarTiquete(int codigoTiquete)throws ExcepcionViajeVacio{
        viaje.eliminarTiquete(codigoTiquete);
    }
    
    public void modificarTiquete(Tiquete tiquete) throws ExcepcionViajeVacio{
        viaje.modificar(tiquete);
    }
}
