/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.ExcepcionCodigoTiqueteEnUso;
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
}