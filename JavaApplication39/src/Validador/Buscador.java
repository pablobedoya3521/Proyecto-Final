/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validador;

import Modelo.Caseta;
import Modelo.Viaje;
import Persistencia.SerializadoraCaseta;
import Util.Lista;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Buscador {
    private SerializadoraCaseta serializadoraCaseta;

    public Buscador() {
        this.serializadoraCaseta = new SerializadoraCaseta();
    }

    public Lista<Viaje> buscar(String referencia) {
        Caseta[][] casetas = serializadoraCaseta.leerObjeto();
        Lista<Viaje> nuevaLista = new Lista<>();

        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                if (casetas[i][j].getEmpresa() != null) {
                    Lista<Viaje> listaObtenida = casetas[i][j].getEmpresa().getListaViajes();
                    for (int k = 0; k < listaObtenida.size(); k++) {
                        Viaje viaje = listaObtenida.get(k);
                        String destino = viaje.getDestino();
                        LocalDate fechaSalida = viaje.getFechaSalida();

                        // Comparar la referencia como fecha
                        try {
                            LocalDate fechaReferencia = LocalDate.parse(referencia);
                            if (fechaSalida.equals(fechaReferencia)) {
                                nuevaLista.add(viaje);
                            }
                        } catch (DateTimeParseException e) {
                            // Si no se puede parsear como fecha, se intenta como destino
                            if (destino.equals(referencia)) {
                                nuevaLista.add(viaje);
                            }
                        }
                    }
                }
            }
        }
        return nuevaLista;
    }
}
