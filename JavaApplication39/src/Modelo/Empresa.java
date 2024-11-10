/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

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
    
    
    public String guardarBus(Bus bus){
       Caseta[][] casetas = serializadora.leerObjeto();
       Bus respuesta = buscarBus(bus.getPlaca());
       if (respuesta == null) {
           listaBuses.add(bus);
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
           return "Bus guardado";
       }
       return "ya hay un bus registrado con esta placa";
    }
    
    public Bus buscarBus(String placa){
        for (int i = 0; i<listaBuses.size(); i++) {
            if(listaBuses.get(i).getPlaca().equals(placa)){
                return listaBuses.get(i);
            }
        }
        return null;
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