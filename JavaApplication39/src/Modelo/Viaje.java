/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Excepciones.ExcepcionAsientosInsuficientes;
import Excepciones.ExcepcionCodigoReservaEnUso;
import Excepciones.ExcepcionCodigoTiqueteEnUso;
import Excepciones.ExcepcionTiqueteVacio;
import Persistencia.SerializadoraCaseta;
import Util.Lista;
import java.io.Serializable;
import java.time.LocalDate;


public class Viaje implements Serializable{
    private static final long serialVersionUID = 1L;
    private String id;
    private String origen;
    private String destino;
    private String horaDeSalida;
    private String horaDeLlegada;
    private String fechaSalida;
    private String fechaLLegada;
    private LocalDate fechaCreacion;
    private Bus bus;
    private double precioViaje;
    private String estado;
    private Lista<Tiquete> listaTiquetes;
    private SerializadoraCaseta serializadora;
    private Lista<Reserva> listaReservas;

    public Viaje(String id,String destino, String horaDeSalida, 
            String horaDeLlegada, String fechaSalida, String fechaLLegada, Bus bus, double precioViaje) {
        
        this.id=id;
        this.origen = "Armenia";
        this.destino = destino;
        this.horaDeSalida=horaDeSalida;
        this.horaDeLlegada = horaDeLlegada;
        this.fechaSalida=fechaSalida;
        this.fechaLLegada=fechaLLegada;
        this.fechaCreacion = LocalDate.now();
        this.bus = bus;
        this.precioViaje = precioViaje;
        this.estado="Programado";
        this.listaTiquetes=new Lista<>();
        this.listaReservas= new Lista<>();
        this.serializadora=new SerializadoraCaseta();
    }

    public Viaje() {
        this.serializadora = new SerializadoraCaseta();
    }
    
    
    
    public void guardarTiquete(Tiquete tiquete) throws ExcepcionCodigoTiqueteEnUso, ExcepcionAsientosInsuficientes {
        Caseta[][] casetas = serializadora.leerObjeto();

        // Primero verificamos si el código del tiquete ya existe
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                Empresa empresa = casetas[i][j].getEmpresa();
                if (empresa != null) {
                    Lista<Viaje> listaViajes = empresa.getListaViajes();
                    for (int k = 0; k < listaViajes.size(); k++) {
                        Viaje viaje = listaViajes.get(k);
                        if(viaje.getId().equals(this.id)){
                            Lista<Tiquete> tiquetes = viaje.getListaTiquetes();
                            for (int l = 0; l < tiquetes.size(); l++) {
                                Tiquete tiqueteAdquirido = tiquetes.get(l);
                                if(tiqueteAdquirido.getCodigoTiquete() == tiquete.getCodigoTiquete()){
                                    throw new ExcepcionCodigoTiqueteEnUso();
                                }
                            }
                        }
                    }
                }
            }
        }

        // busco el viaje para verificar asientos y guardar el tiquete
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                Empresa empresa = casetas[i][j].getEmpresa();
                if (empresa != null) {
                    Lista<Viaje> listaViajes = empresa.getListaViajes();
                    for (int k = 0; k < listaViajes.size(); k++) {
                        Viaje viaje = listaViajes.get(k);
                        if (viaje.getId().equals(this.id)) {
                            int asientosDisponibles = viaje.getBus().getNumAsientos();
                            if (asientosDisponibles < tiquete.getCantidad()) {
                                throw new ExcepcionAsientosInsuficientes();
                            }
                            viaje.getListaTiquetes().add(tiquete);
                            viaje.getBus().setNumAsientos(asientosDisponibles - tiquete.getCantidad());
                            serializadora.escribirObjeto(casetas);
                            return;
                        }
                    }
                }
            }
        }
    }

    
    public Tiquete buscarTiquete(int codigoTiquete) throws ExcepcionTiqueteVacio{
        Caseta[][] casetas = serializadora.leerObjeto();
        
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
            
              Empresa empresa = casetas[i][j].getEmpresa();

                if (empresa != null) {
                  Lista<Viaje> listaViajes = empresa.getListaViajes();
                    for (int k = 0; k < listaViajes.size(); k++) {
                      Viaje viaje = listaViajes.get(k);
                      Lista<Tiquete> listaTiquetes = viaje.getListaTiquetes();
                        for (int l = 0; l < listaTiquetes.size(); l++) {
                          Tiquete tiquete = listaTiquetes.get(l);
                            if (tiquete.getCodigoTiquete() == codigoTiquete) {
                                return tiquete;
                            }
                        }
                    }
                }
            }
        }
        throw new ExcepcionTiqueteVacio();
    }
    
    public void eliminarTiquete(int codigoTiquete) throws ExcepcionTiqueteVacio {
        Caseta[][] casetas = serializadora.leerObjeto();

        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                Empresa empresa = casetas[i][j].getEmpresa();
                if (empresa != null) {
                    Lista<Viaje> listaViajes = empresa.getListaViajes();
                    for (int k = 0; k < listaViajes.size(); k++) {
                        Viaje viaje = listaViajes.get(k);
                        Lista<Tiquete> listaTiquetes = viaje.getListaTiquetes();
                        for (int l = 0; l < listaTiquetes.size(); l++) {
                            Tiquete tiquete = listaTiquetes.get(l);
                            if (tiquete.getCodigoTiquete() == codigoTiquete) {
                                // Antes de eliminar el tiquete, devolvemos los asientos
                                int asientosActuales = viaje.getBus().getNumAsientos();
                                int asientosARestaurar = tiquete.getCantidad();
                                viaje.getBus().setNumAsientos(asientosActuales + asientosARestaurar);

                                // Ahora sí eliminamos el tiquete
                                listaTiquetes.remove(l);
                                serializadora.escribirObjeto(casetas);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new ExcepcionTiqueteVacio();
    }
    
    public void modificarTiquete(Tiquete tiquete) throws ExcepcionTiqueteVacio {
        Caseta[][] casetas = serializadora.leerObjeto();

        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                Empresa empresa = casetas[i][j].getEmpresa();
                if (empresa != null) {
                    Lista<Viaje> listaViajes = empresa.getListaViajes();
                    for (int k = 0; k < listaViajes.size(); k++) {
                        Viaje viaje = listaViajes.get(k);
                        Lista<Tiquete> listaTiquetes = viaje.getListaTiquetes();
                        for (int l = 0; l < listaTiquetes.size(); l++) {
                            Tiquete tiqueteExistente = listaTiquetes.get(l);
                            if (tiqueteExistente.getCodigoTiquete() == tiquete.getCodigoTiquete()) {
                              
                                tiqueteExistente.getViaje().setId(tiquete.getViaje().getId());
                                tiqueteExistente.getCliente().setCorreo(tiquete.getCliente().getCorreo());
                                tiqueteExistente.setFechaDeCompra(tiquete.getFechaDeCompra());
                                tiqueteExistente.setHoraDeCompra(tiquete.getHoraDeCompra());
                                tiqueteExistente.setCantidad(tiquete.getCantidad());
                                
                                serializadora.escribirObjeto(casetas);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new ExcepcionTiqueteVacio();
    }
    
    public void guardarReserva(Reserva reserva) throws ExcepcionCodigoReservaEnUso, ExcepcionAsientosInsuficientes{
        Caseta[][] casetas = serializadora.leerObjeto();

        // Primero verificamos si el código de la reserva ya existe
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                Empresa empresa = casetas[i][j].getEmpresa();
                if (empresa != null) {
                    Lista<Viaje> listaViajes = empresa.getListaViajes();
                    for (int k = 0; k < listaViajes.size(); k++) {
                        Viaje viaje = listaViajes.get(k);
                        if(viaje.getId().equals(this.id)){
                            Lista<Reserva> reservas = viaje.getListaReservas();
                            for (int l = 0; l < reservas.size(); l++) {
                                Reserva reservaAdquirida = reservas.get(l);
                                if(reservaAdquirida.getCodigo().equals(reserva.getCodigo())){
                                    throw new ExcepcionCodigoReservaEnUso();
                                }
                            }
                        }
                    }
                }
            }
        }

        // busco el viaje para verificar asientos y guardar la reserva
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                Empresa empresa = casetas[i][j].getEmpresa();
                if (empresa != null) {
                    Lista<Viaje> listaViajes = empresa.getListaViajes();
                    for (int k = 0; k < listaViajes.size(); k++) {
                        Viaje viaje = listaViajes.get(k);
                        if (viaje.getId().equals(this.id)) {
                            int asientosDisponibles = viaje.getBus().getNumAsientos();
                            if (asientosDisponibles < reserva.getCantidadDeTiquetes()) {
                                throw new ExcepcionAsientosInsuficientes();
                            }
                            viaje.getListaReservas().add(reserva);
                            viaje.getBus().setNumAsientos(asientosDisponibles - reserva.getCantidadDeTiquetes());
                            serializadora.escribirObjeto(casetas);
                            return;
                        }
                    }
                }
            }
        }
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(String horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHoraDeLlegada() {
        return horaDeLlegada;
    }

    public void setHoraDeLlegada(String horaDeLlegada) {
        this.horaDeLlegada = horaDeLlegada;
    }
    

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public double getPrecioViaje() {
        return precioViaje;
    }

    public void setPrecioViaje(double precioViaje) {
        this.precioViaje = precioViaje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaLLegada() {
        return fechaLLegada;
    }

    public void setFechaLLegada(String fechaLLegada) {
        this.fechaLLegada = fechaLLegada;
    }

    public Lista<Tiquete> getListaTiquetes() {
        return listaTiquetes;
    }

    public void setListaTiquetes(Lista<Tiquete> listaTiquetes) {
        this.listaTiquetes = listaTiquetes;
    }

    public Lista<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(Lista<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }
    
    
  
}