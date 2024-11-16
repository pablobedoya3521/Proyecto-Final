/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validador;

import Excepciones.ExcepcionBusNoDisponible;
import Modelo.Bus;
import Modelo.Empresa;
import Modelo.Viaje;
import java.time.LocalDate;


/**
 *
 * @author juan
 */
public class ValidarDisponibilidadDeBus {

   public void validarDisponibilidadDeBus(Empresa empresa, Viaje viaje) throws ExcepcionBusNoDisponible {
    for (int i = 0; i < empresa.getListaViajes().size(); i++) {
        Viaje viajeObtenido = empresa.getListaViajes().get(i);
        if (viajeObtenido.getBus().getPlaca().equals(viaje.getBus().getPlaca())) {
            LocalDate fechaSalidaViaje =LocalDate.parse(viaje.getFechaSalida());
            LocalDate fechaSalidaViajeObtenido = LocalDate.parse(viajeObtenido.getFechaSalida());
            LocalDate fechaLlegadaViajeObtenido =LocalDate.parse( viajeObtenido.getFechaLLegada());

            // Verificar si las fechas de los viajes se solapan
            if (fechaSalidaViaje.isBefore(fechaSalidaViajeObtenido.minusDays(1)) || 
                fechaSalidaViaje.isAfter(fechaLlegadaViajeObtenido.plusDays(1))) {
                // Aquí puedes manejar la lógica si la validación pasa
            } else {
                // Si hay un conflicto en las fechas
                throw new ExcepcionBusNoDisponible();
            }
        }
    }
}
}
