/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.ExcepcionBusVacio;

import Excepciones.ExcepcionCodigoEnUso;
import Excepciones.ExcepcionIdDeViajeEnUso;
import Excepciones.ExcepcionPlacaEnUso;
import Excepciones.ExcepcionUsuarioNoEncontrado;
import Excepciones.ExcepcionViajeVacio;
import Modelo.Bus;
import Modelo.Caseta;
import Modelo.Empresa;
import Modelo.Tiquete;
import Modelo.Viaje;
import Persistencia.SerializadoraBus;
import Persistencia.SerializadoraTiquete;
import Persistencia.SerializadoraViaje;
import Util.Lista;


/**
 *
 * @author sebastian
 */
public class ControladorEmpresa {
    //listas
    private Lista<Viaje> listaViajes;
    private Lista<Bus> listaBuses;
    private Lista<Tiquete> listaTiquetes;
    //serializable
    private SerializadoraBus serializadoraBus;
    private SerializadoraViaje serializadoraViaje;
    private SerializadoraTiquete serializadoraTiquete;
    private Empresa empresa;
    private Caseta caseta;
    
    public ControladorEmpresa(){
        this.serializadoraBus=new SerializadoraBus();
        this.listaBuses=serializadoraBus.leerObjeto();
        this.serializadoraViaje=new SerializadoraViaje();
        this.listaViajes=serializadoraViaje.leerObjeto();
        this.serializadoraTiquete=new SerializadoraTiquete();
        this.listaTiquetes=serializadoraTiquete.leerObjeto();
        this.empresa=empresa;
        this.caseta=caseta;
    }

    public Lista<Viaje> getListaViajes() {
        return listaViajes;
    }


    public Lista<Bus> getListaBuses() {
        return listaBuses;
    }

    public SerializadoraBus getSerializadoraBus() {
        return serializadoraBus;
    }

    public void setSerializadoraBus(SerializadoraBus serializadoraBus) {
        this.serializadoraBus = serializadoraBus;
    }

    public SerializadoraViaje getSerializadoraViaje() {
        return serializadoraViaje;
    }

    public void setSerializadoraViaje(SerializadoraViaje serializadoraViaje) {
        this.serializadoraViaje = serializadoraViaje;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Caseta getCaseta() {
        return caseta;
    }

    public void setCaseta(Caseta caseta) {
        this.caseta = caseta;
    }
       
    //Metodos
    
    public void guardarViaje(Viaje viaje)throws ExcepcionIdDeViajeEnUso,ExcepcionBusVacio{
    Viaje aux=buscarViaje(viaje.getId());
        if(aux != null){
            throw new ExcepcionIdDeViajeEnUso();
        }
        if(viaje.getBus()==null){
            throw new ExcepcionBusVacio();
        }
        listaViajes.add(viaje);
        serializadoraViaje.escribirObjeto(listaViajes);
    }
    
    public Viaje buscarViaje(String id){
        for(int i=0; i<listaViajes.size(); i++){
            if(listaViajes.get(i).getId().equals(id)){
                return listaViajes.get(i);
            }
        }
        return null;
    }
    
    public boolean eliminarViaje(String id){
        for(int i=0; i<listaViajes.size(); i++){
            if(listaViajes.get(i).getId().equals(id)){
                listaViajes.remove(i);
                serializadoraViaje.escribirObjeto(listaViajes);
                return true;
            }
        }
        return false;
    } 
     
    public boolean modificarViaje(Viaje viaje){
      Viaje aux=buscarViaje(viaje.getId());
      
      if(aux != null){
          aux.setOrigen(viaje.getOrigen());
          aux.setDestino(viaje.getDestino());
          aux.setHoraDeSalida(viaje.getHoraDeSalida());
          aux.setHoraDeLlegada(viaje.getHoraDeLlegada());
          aux.setBus(viaje.getBus());
          aux.setPrecioViaje(viaje.getPrecioViaje());
          
          serializadoraViaje.escribirObjeto(listaViajes);
          return true;
          
        }
      return false;
    }    
      
    public void guardarBus(Bus bus) throws ExcepcionPlacaEnUso{
    Bus aux=buscarBus(bus.getPlaca());
        if(aux != null){
          throw new ExcepcionPlacaEnUso();
        }
          listaBuses.add(bus);
          serializadoraBus.escribirObjeto(listaBuses);
    }
    
    public Bus buscarBus(String placa){
        for(int i=0; i<listaBuses.size(); i++){
            if(listaBuses.get(i).getPlaca().equals(placa)){
                return listaBuses.get(i);
            }
        }
        return null;
    }
    
    public boolean eliminarBus(String placa){
        for(int i=0; i<listaBuses.size(); i++){
            if(listaBuses.get(i).getPlaca().equals(placa)){
                listaBuses.remove(i);
                serializadoraBus.escribirObjeto(listaBuses);
                return true;
            }
        }
        return false;
    } 
     
    public boolean modificarBus(Bus bus){
      Bus aux=buscarBus(bus.getPlaca());
      
      if(aux != null){
          aux.setPlaca(bus.getPlaca());
          aux.setNumAsientos(bus.getNumAsientos());
          
          serializadoraBus.escribirObjeto(listaBuses);
          
          return true;
      }
      return false;
    }    
     
    public boolean aignarCaseta(Caseta caseta){
         this.caseta=caseta;
         return true;
    }
    
    public void guardarTiquete(Tiquete tiquete)throws ExcepcionCodigoEnUso,ExcepcionViajeVacio,ExcepcionUsuarioNoEncontrado{
        Tiquete aux=buscarTiquete(tiquete.getCodigo());
        if(aux != null){
            throw new ExcepcionCodigoEnUso();
        }
        if(tiquete.getViaje()==null){
            throw new ExcepcionViajeVacio();
        }
        if(tiquete.getCliente()==null){
            throw new ExcepcionUsuarioNoEncontrado();
        }
        listaTiquetes.add(tiquete);
        int restar= tiquete.getViaje().getBus().getNumAsientos()-tiquete.getCantidad();
        tiquete.getViaje().getBus().setNumAsientos(restar);
        serializadoraTiquete.escribirObjeto(listaTiquetes);
    }
    
    public Tiquete buscarTiquete(String codigo){
        for(int i=0; i<listaTiquetes.size(); i++){
            if(listaTiquetes.get(i).getCodigo().equals(codigo)){
                return listaTiquetes.get(i);
            }
        }
        return null;
    }
    
    public boolean eliminarTiquete(String codigo){
        for(int i=0; i<listaTiquetes.size(); i++){
            if(listaTiquetes.get(i).getCodigo().equals(codigo)){
                listaTiquetes.remove(i);
                serializadoraTiquete.escribirObjeto(listaTiquetes);
                return true;
            }
        }
        return false;
    } 
     
    public boolean modificarTiquete(Tiquete tiquete){
      Tiquete aux=buscarTiquete(tiquete.getCodigo());
      
      if(aux != null){
          aux.setViaje(tiquete.getViaje());
          aux.setCliente(tiquete.getCliente());
          aux.setCantidad(tiquete.getCantidad());
          aux.setFechaDeCompra(tiquete.getFechaDeCompra());
          
          serializadoraTiquete.escribirObjeto(listaTiquetes);
          return true;
          
        }
      return false;
    }    

    
}
