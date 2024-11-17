/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validador;

import Modelo.Caseta;
import Modelo.Viaje;
import Persistencia.SerializadoraCaseta;
import Util.Lista;

public class Buscador {
    private SerializadoraCaseta serializadoraCaseta;
    
    public Buscador() {
        this.serializadoraCaseta= new SerializadoraCaseta();
    }
    
    
    public Lista<Viaje> buscar(String referencia){
        Caseta[][] casetas= serializadoraCaseta.leerObjeto();
        Lista<Viaje> nuevaLista= new Lista<>();
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
               if(casetas[i][j].getEmpresa()!=null){
                    Lista<Viaje> listaObtenida = casetas[i][j].getEmpresa().getListaViajes();
                for (int k = 0; k < listaObtenida.size(); k++) {
                    String fecha = listaObtenida.get(k).getFechaSalida();
                    String destino = listaObtenida.get(k).getDestino();
                    Viaje viaje = listaObtenida.get(k);
                    if (fecha.equals(referencia)) {
                        nuevaLista.add(viaje);
                    }else if (destino.equals(referencia)) {
                        nuevaLista.add(viaje);
                    }
                }
               }
            }
        }
        return nuevaLista;
    }
}
