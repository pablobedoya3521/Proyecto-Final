/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validador;

import Excepciones.ExcepcionBusNoDisponible;
import Modelo.Empresa;
import Modelo.Viaje;
import java.time.LocalDate;

public class ValidarDisponibilidadDeBus {

    public void validarDisponibilidadDeBus(Empresa empresa, Viaje nuevoViaje) throws ExcepcionBusNoDisponible {
        
        LocalDate fechaSalidaNuevoViaje = LocalDate.parse(nuevoViaje.getFechaSalida());
        LocalDate fechaLlegadaNuevoViaje = LocalDate.parse(nuevoViaje.getFechaLLegada());
       
        for (int i = 0; i < empresa.getListaViajes().size(); i++) {
            Viaje viajeExistente = empresa.getListaViajes().get(i);
            
            if (viajeExistente.getBus().getPlaca().equals(nuevoViaje.getBus().getPlaca())) {
                LocalDate fechaSalidaExistente = LocalDate.parse(viajeExistente.getFechaSalida());
                LocalDate fechaLlegadaExistente = LocalDate.parse(viajeExistente.getFechaLLegada());
                
                LocalDate fechaDisponibilidad = fechaLlegadaExistente.plusDays(1);
                
                if (!(fechaSalidaNuevoViaje.isAfter(fechaDisponibilidad) || 
                    fechaLlegadaNuevoViaje.isBefore(fechaSalidaExistente.minusDays(1)))) {
                    throw new ExcepcionBusNoDisponible();
                }
            }
        }
    }
}