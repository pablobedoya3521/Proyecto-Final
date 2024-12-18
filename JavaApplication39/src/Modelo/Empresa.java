/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Excepciones.ExcepcionBusVacio;
import Excepciones.ExcepcionBusYaRegistrado;
import Excepciones.ExcepcionCantidadPlazasNula;
import Excepciones.ExcepcionIdDeViajeEnUso;
import Excepciones.ExcepcionViajeVacio;
import Persistencia.SerializadoraCaseta;
import Util.Lista;
import java.io.Serializable;

public class Empresa implements Serializable{
    private static final long serialVersionUID = 1L;
    private int nit;
    private String nombreEmpresa;
    private AdministradorFlota administradorFlota;
    private Lista<Bus> listaBuses;
    private Lista<Viaje> listaViajes;
    private SerializadoraCaseta serializadora;
    
    public Empresa(int nit, String nombreEmpresa, AdministradorFlota administradorFlota){
        this.nit = nit;
        this.nombreEmpresa = nombreEmpresa;
        this.administradorFlota = administradorFlota;
        this.listaBuses = new Lista<>();
        this.listaViajes = new Lista<>();
        this.serializadora = new SerializadoraCaseta();
    }
    
    //metodos de bus 
    //guardar bus
    public void guardarBus(Bus bus) throws ExcepcionBusYaRegistrado, ExcepcionCantidadPlazasNula {
        Caseta[][] casetas = serializadora.leerObjeto();
        //valido que el bus no este registrado previamente
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                if (casetas[i][j].getEmpresa() != null) {
                    for (int k = 0; k < casetas[i][j].getEmpresa().getListaBuses().size(); k++) {
                        if(casetas[i][j].getEmpresa().getListaBuses().get(k).getPlaca().equals(bus.getPlaca())){
                            throw new ExcepcionBusYaRegistrado();
                        }
                    }
                }
            }
        }
        //guardo el bus en la empresa que le corresponde
        boolean busGuardado = false;
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                if (casetas[i][j].getEmpresa() != null && casetas[i][j].getEmpresa().getNit() == this.nit) {
                    if (casetas[i][j].getCantidadPlazas() > 0) {
                        listaBuses.add(bus);
                        casetas[i][j].setCantidadPlazas(casetas[i][j].getCantidadPlazas() - 1);
                        casetas[i][j].setEmpresa(this);
                        serializadora.escribirObjeto(casetas);
                        busGuardado = true;
                        break; 
                    }
                }
            }
            //si lo guarde detengo la funcion
            if (busGuardado) {
                break;
            }
        }
        //si no se pudo guardar fue porq las plazas no me dejaron, osea, no hay plazas disponibles
        if (!busGuardado) {
            throw new ExcepcionCantidadPlazasNula();
        }
    }
    
    //buscar bus
    public Bus buscarBus(String placa) throws ExcepcionBusVacio{
        Caseta[][] casetas = serializadora.leerObjeto();
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                if (casetas[i][j].getEmpresa() != null && casetas[i][j].getEmpresa().getNit() == this.nit) {
                    for (int k = 0; k < casetas[i][j].getEmpresa().getListaBuses().size(); k++) {
                        if (casetas[i][j].getEmpresa().getListaBuses().get(k).getPlaca().equals(placa)) {
                            return casetas[i][j].getEmpresa().getListaBuses().get(k);
                        }
                    }
                }
            }
        }
        throw new ExcepcionBusVacio();
    }
    
    //eliminar bus
    public void eliminarBus(String placa) throws ExcepcionBusVacio {
        Caseta[][] casetas = serializadora.leerObjeto();
        boolean busEncontrado = false;

        // Buscar y eliminar viajes relacionados con el bus
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                Empresa empresa = casetas[i][j].getEmpresa();
                if (empresa != null && empresa.getNit() == this.nit) {
                    Lista<Viaje> listaViajes = empresa.getListaViajes();
                    for (int k = 0; k < listaViajes.size(); k++) {
                        Viaje viaje = listaViajes.get(k);
                        if (viaje.getBus() != null && viaje.getBus().getPlaca().equals(placa)) {
                            listaViajes.remove(k);
                            k--; 
                        }
                    }
                }
            }
        }

        // Eliminar el bus después de limpiar los viajes
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                Empresa empresa = casetas[i][j].getEmpresa();
                if (empresa != null && empresa.getNit() == this.nit) {
                    for (int k = 0; k < empresa.getListaBuses().size(); k++) {
                        if (empresa.getListaBuses().get(k).getPlaca().equals(placa)) {
                            empresa.getListaBuses().remove(k);
                            casetas[i][j].setCantidadPlazas(casetas[i][j].getCantidadPlazas() + 1);
                            busEncontrado = true;
                            break;
                        }
                    }
                }
            }
        }
        //si el bus durante el proceso no se elimino fue porq no se encontro
        if (!busEncontrado) {
            throw new ExcepcionBusVacio();
        }

        serializadora.escribirObjeto(casetas);
    }

    //modificar bus
    public void modificarBus(Bus bus) throws ExcepcionBusVacio {
        boolean modificado = false;
        Caseta[][] casetas = serializadora.leerObjeto();
  
        for (int k = 0; k < listaBuses.size(); k++) {
            if (listaBuses.get(k).getPlaca().equals(bus.getPlaca())) {
               
                listaBuses.get(k).setModelo(bus.getModelo());
                listaBuses.get(k).setMarca(bus.getMarca());
                listaBuses.get(k).setPotenciaMotor(bus.getPotenciaMotor());
                listaBuses.get(k).setTipoCombustible(bus.getTipoCombustible());
                modificado = true;
                break;
            }
        }

        if (!modificado) {
            throw new ExcepcionBusVacio();
        }

        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                if (casetas[i][j].getEmpresa() != null && casetas[i][j].getEmpresa().getNit() == this.nit) {
                    casetas[i][j].setEmpresa(this);
                }
            }
        }

        serializadora.escribirObjeto(casetas);
    }
    
    //metodos de viaje
    
    public void guardarViaje(Viaje viaje) throws ExcepcionIdDeViajeEnUso {
        Caseta[][] casetas = serializadora.leerObjeto();

        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                if (casetas[i][j].getEmpresa() != null) {
                    for (int k = 0; k < casetas[i][j].getEmpresa().getListaViajes().size(); k++) {
                        if (casetas[i][j].getEmpresa().getListaViajes().get(k).getId().equals(viaje.getId())) {
                            throw new ExcepcionIdDeViajeEnUso();
                        }
                    }
                }
            }
        }
        
        Lista<Viaje> viajesActuales = this.getListaViajes();
        
        listaViajes.add(viaje);
        
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                if (casetas[i][j].getEmpresa() != null && casetas[i][j].getEmpresa().getNit() == this.nit) {
                    casetas[i][j].setEmpresa(this);
                    serializadora.escribirObjeto(casetas);
                    return;
                }
            }
        }
    }
    
    public Viaje buscarViaje(String id) throws ExcepcionViajeVacio{
        Caseta[][] casetas = serializadora.leerObjeto();
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                if (casetas[i][j].getEmpresa() != null && casetas[i][j].getEmpresa().getNit() == this.nit) {
                    for (int k = 0; k < casetas[i][j].getEmpresa().getListaViajes().size(); k++) {
                        if (casetas[i][j].getEmpresa().getListaViajes().get(k).getId().equals(id)) {
                            return casetas[i][j].getEmpresa().getListaViajes().get(k);
                        }
                    }
                }
            }
        }
        throw new ExcepcionViajeVacio();
    }
    
    public void eliminarViaje(String id) throws ExcepcionViajeVacio {
        Caseta[][] casetas = serializadora.leerObjeto();
        boolean viajeEncontrado = false;

        // Buscar y eliminar el viaje
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                Empresa empresa = casetas[i][j].getEmpresa();
                if (empresa != null && empresa.getNit() == this.nit) {
                    Lista<Viaje> listaViajes = empresa.getListaViajes();
                    for (int k = 0; k < listaViajes.size(); k++) {
                        if (listaViajes.get(k).getId().equals(id)) {
                            listaViajes.remove(k); 
                            viajeEncontrado = true;
                            break;
                        }
                    }
                }
            }
        }

        if (!viajeEncontrado) {
            throw new ExcepcionViajeVacio();
        }
        
        serializadora.escribirObjeto(casetas);
    }
    
    public void modificarViaje(Viaje viaje) throws ExcepcionViajeVacio{
        boolean modificado=false;
        Caseta[][] casetas = serializadora.leerObjeto();
        
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                if (casetas[i][j].getEmpresa() != null && casetas[i][j].getEmpresa().getNit() == this.nit) {
                    for (int k = 0; k < listaViajes.size(); k++) {
                        if (listaViajes.get(k).getId().equals(viaje.getId())) {

                            listaViajes.get(k).setOrigen(viaje.getOrigen());
                            listaViajes.get(k).setDestino(viaje.getDestino());
                            listaViajes.get(k).setHoraDeSalida(viaje.getHoraDeSalida());
                            listaViajes.get(k).setHoraDeLlegada(viaje.getHoraDeLlegada());
                            listaViajes.get(k).setBus(viaje.getBus());
                            listaViajes.get(k).setPrecioViaje(viaje.getPrecioViaje());

                            modificado = true; 
                            break;
                        }
                    }
                }
            }
        }
        
        if (!modificado) {
            throw new ExcepcionViajeVacio(); 
        }
        
        for (int i = 0; i < casetas.length; i++) {
           for (int j = 0; j < casetas[i].length; j++) {
               if (casetas[i][j].getEmpresa() != null && casetas[i][j].getEmpresa().getNit() == this.nit) {
                   casetas[i][j].setEmpresa(this); 
                }
            }
        }
       serializadora.escribirObjeto(casetas);

    }

    //getters and setters
    
    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public AdministradorFlota getAdministradorFlota() {
        return administradorFlota;
    }

    public void setAdministradorFlota(AdministradorFlota administradorFlota) {
        this.administradorFlota = administradorFlota;
    }

    public Lista<Bus> getListaBuses() {
        return listaBuses;
    }

    public Lista<Viaje> getListaViajes() {
        return listaViajes;
    }

    public void setListaBuses(Lista<Bus> listaBuses) {
        this.listaBuses = listaBuses;
    }

    public void setListaViajes(Lista<Viaje> listaViajes) {
        this.listaViajes = listaViajes;
    }
    
}