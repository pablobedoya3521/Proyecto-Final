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
    LocalDate fechaSalidaNuevoViaje = nuevoViaje.getFechaSalida();
    LocalDate fechaLlegadaNuevoViaje = nuevoViaje.getFechaLLegada();
    
    for (int i = 0; i < empresa.getListaViajes().size(); i++) {
        Viaje viajeExistente = empresa.getListaViajes().get(i);
        
        // Verificar si el bus es el mismo
        if (viajeExistente.getBus().getPlaca().equals(nuevoViaje.getBus().getPlaca())) {
            LocalDate fechaSalidaExistente = viajeExistente.getFechaSalida();
            LocalDate fechaLlegadaExistente = viajeExistente.getFechaLLegada();
            
            // Verificar si hay superposición de fechas
            if (!(fechaSalidaNuevoViaje.isAfter(fechaLlegadaExistente) || 
                  fechaLlegadaNuevoViaje.isBefore(fechaSalidaExistente))) {
                throw new ExcepcionBusNoDisponible();
            }
        }
    }
}
}