/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Excepciones.ExcepcionBusVacio;
import Excepciones.ExcepcionBusYaRegistrado;
import Excepciones.ExcepcionCantidadPlazasNula;
import Persistencia.SerializadoraCaseta;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author juan
 */
public class Empresa implements Serializable{
    private static final long serialVersionUID = 1L;
    private int nit;
    private String nombreEmpresa;
    private AdministradorFlota administradorFlota;
    private ArrayList<Bus> listaBuses;
    private ArrayList<Viaje> listaViajes;
    private SerializadoraCaseta serializadora;
    
public Empresa(int nit, String nombreEmpresa, AdministradorFlota administradorFlota){
       this.nit = nit;
       this.nombreEmpresa = nombreEmpresa;
       this.administradorFlota = administradorFlota;
       this.listaBuses = new ArrayList<>();
       this.listaViajes = new ArrayList<>();
       this.serializadora = new SerializadoraCaseta();
   }
    
    
    public void guardarBus(Bus bus) throws ExcepcionBusYaRegistrado, ExcepcionCantidadPlazasNula{
       Caseta[][] casetas = serializadora.leerObjeto();
       Bus respuesta = buscarBus(bus.getPlaca());
       
       if (respuesta != null) {
          throw new ExcepcionBusYaRegistrado();
       }
       
       boolean busGuardado=false;
       
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                if(casetas[i][j].getEmpresa()!=null){
                    if(casetas[i][j].getEmpresa().getNit()==this.nit){
                        if(casetas[i][j].getCantidadPlazas()>0){
                            listaBuses.add(bus);
                            casetas[i][j].setCantidadPlazas(casetas[i][j].getCantidadPlazas()-1);
                            casetas[i][j].setEmpresa(this);
                            serializadora.escribirObjeto(casetas); 
                            busGuardado=true;
                            break;
                        }
                    }
                }
            }
        }
       
        if (!busGuardado) {
            throw new ExcepcionCantidadPlazasNula();
        }
           
    }
    
    public Bus buscarBus(String placa){
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
        return null;
    }
    
    public void eliminarBus(String placa) throws ExcepcionBusVacio{
        Caseta[][] casetas = serializadora.leerObjeto();
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                if (casetas[i][j].getEmpresa() != null && casetas[i][j].getEmpresa().getNit() == this.nit) {
                    for (int k = 0; k < casetas[i][j].getEmpresa().getListaBuses().size(); k++) {
                        if (casetas[i][j].getEmpresa().getListaBuses().get(k).getPlaca().equals(placa)) {
                            listaBuses.remove(k);
                            casetas[i][j].setEmpresa(this);
                            serializadora.escribirObjeto(casetas);
                            return;
                        }
                    }
                }
            }
        }
        throw new ExcepcionBusVacio();
    }
    
    public void modificarBus(Bus bus) throws ExcepcionBusVacio {
        boolean modificado = false;
        Caseta[][] casetas = serializadora.leerObjeto();

        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                if (casetas[i][j].getEmpresa() != null && casetas[i][j].getEmpresa().getNit() == this.nit) {
                    for (int k = 0; k < listaBuses.size(); k++) {  // Modificamos directamente la lista local
                        if (listaBuses.get(k).getPlaca().equals(bus.getPlaca())) {

                            listaBuses.get(k).setNumAsientos(bus.getNumAsientos());

                            modificado = true; 
                            break;
                        }
                    }
                }
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
    
    public String guardarViaje(Viaje viaje){
        Caseta[][] casetas = serializadora.leerObjeto();
        Viaje respuesta = buscarViaje(viaje.getId());
        if(respuesta==null){
            listaViajes.add(viaje);
             for (int i = 0; i < casetas.length; i++) {
               for (int j = 0; j < casetas[i].length; j++) {
                   if(casetas[i][j].getEmpresa()!=null){
                        if(casetas[i][j].getEmpresa().getNit()==this.nit){
                            casetas[i][j].setEmpresa(this);
                            serializadora.escribirObjeto(casetas);
                        }
                   }
               }
           }
           return "Viaje guardado";  
        }
        return "ya hay un viaje registrado con este id";
    } 
    
    public Viaje buscarViaje(String id) {
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
        return null; // No se encontró el viaje
    }

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

    public ArrayList<Bus> getListaBuses() {
        return listaBuses;
    }

    public ArrayList<Viaje> getListaViajes() {
        return listaViajes;
    }

}