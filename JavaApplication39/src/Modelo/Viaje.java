/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Excepciones.ExcepcionAsientosInsuficientes;
import Excepciones.ExcepcionCodigoReservaEnUso;
import Excepciones.ExcepcionCodigoTiqueteEnUso;
import Excepciones.ExcepcionMontoInsuficiente;
import Excepciones.ExcepcionReservaVacia;
import Excepciones.ExcepcionTiqueteVacio;
import Persistencia.SerializadoraCaseta;
import Util.Lista;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class Viaje implements Serializable{
    private static final long serialVersionUID = 1L;
     private String id;
    private String origen;
    private String destino;
    private LocalTime horaDeSalida; // Cambiado a LocalTime
    private LocalTime horaDeLlegada; // Cambiado a LocalTime
    private LocalDate fechaSalida; // Cambiado a LocalDate
    private LocalDate fechaLLegada; // Cambiado a LocalDate
    private LocalDate fechaCreacion;
    private Bus bus;
    private double precioViaje;
    private String estado;
    private Lista<Tiquete> listaTiquetes;
    private SerializadoraCaseta serializadora;
    private Lista<Reserva> listaReservas;
    private Lista<Devolucion> listaDevoluciones;

    public Viaje(String id, String destino, LocalTime horaDeSalida, 
                 LocalTime horaDeLlegada, LocalDate fechaSalida, LocalDate fechaLLegada, 
                 Bus bus, double precioViaje) {
        
        this.id=id;
        this.origen = "Armenia";
        this.destino = destino;
        this.horaDeSalida = horaDeSalida;
        this.horaDeLlegada = horaDeLlegada;
        this.fechaSalida = fechaSalida;
        this.fechaLLegada = fechaLLegada;
        this.fechaCreacion = LocalDate.now();
        this.bus = bus;
        this.precioViaje = precioViaje;
        this.estado = "Programado";
        this.listaTiquetes = new Lista<>();
        this.listaReservas = new Lista<>();
        this.listaDevoluciones= new Lista<>();
        this.serializadora = new SerializadoraCaseta();
    }

    public Viaje() {
        this.serializadora = new SerializadoraCaseta();
    }
    
    
    
    public void guardarTiquete(Tiquete tiquete) throws ExcepcionCodigoTiqueteEnUso, ExcepcionAsientosInsuficientes, ExcepcionMontoInsuficiente {
        Caseta[][] casetas = serializadora.leerObjeto();
        
        //valido monto del cliente
        if(tiquete.getCliente().getMonto()>=tiquete.getViaje().getPrecioViaje()*tiquete.getCantidad()){
            
                // despues verificamos si el código del tiquete ya existe
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
        }else{
            throw new ExcepcionMontoInsuficiente();
        } 
    }
    
    public void guardarDevolucion(Tiquete tiquete){
        Caseta[][] casetas = serializadora.leerObjeto();
        Devolucion devolucion = new Devolucion(tiquete);
         for (int i = 0; i < casetas.length; i++) {
               for (int j = 0; j < casetas[i].length; j++) {
                   Empresa empresa = casetas[i][j].getEmpresa();
                   if (empresa != null) {
                       Lista<Viaje> listaViajes = empresa.getListaViajes();
                       for (int k = 0; k < listaViajes.size(); k++) {
                           Viaje viaje = listaViajes.get(k);
                           if (viaje.getId().equals(this.id)) {
                               viaje.getListaDevoluciones().add(devolucion);
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
    
    public void eliminarReserva(String codigoReserva) throws ExcepcionReservaVacia {
        Caseta[][] casetas = serializadora.leerObjeto();
        boolean reservaEncontrada = false;

        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                Empresa empresa = casetas[i][j].getEmpresa();
                if (empresa != null) {
                    Lista<Viaje> listaViajes = empresa.getListaViajes();
                    for (int k = 0; k < listaViajes.size(); k++) {
                        Viaje viaje = listaViajes.get(k);
                        if (viaje.getId().equals(this.id)) {
                            Lista<Reserva> reservas = viaje.getListaReservas();
                            for (int l = 0; l < reservas.size(); l++) {
                                Reserva reservaActual = reservas.get(l);
                                if (reservaActual.getCodigo().equals(codigoReserva)) {
                                    int asientosActuales = viaje.getBus().getNumAsientos();
                                    int asientosADevolver = reservaActual.getCantidadDeTiquetes();
                                    reservas.remove(l);
                                    viaje.getBus().setNumAsientos(asientosActuales + asientosADevolver);
                                    reservaEncontrada = true;
                                    serializadora.escribirObjeto(casetas);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }

        if (!reservaEncontrada) {
            throw new ExcepcionReservaVacia();
        }
    }
    
    public void actualizarEstado() {
        LocalDate ahoraFecha = LocalDate.now();
        LocalTime ahoraHora = LocalTime.now();
        LocalDateTime ahora = LocalDateTime.of(ahoraFecha, ahoraHora);
        
        // Combinar LocalDate y LocalTime para crear LocalDateTime
        LocalDateTime fechaSalida = LocalDateTime.of(this.fechaSalida, this.horaDeSalida);
        LocalDateTime fechaLlegada = LocalDateTime.of(this.fechaLLegada, this.horaDeLlegada);

        // Cambiar el estado del viaje según la fecha y hora
        if (ahora.isAfter(fechaSalida) && ahora.isBefore(fechaLlegada)) {
            this.estado = "En Curso";
        } else if (ahora.isAfter(fechaLlegada)) {
            this.estado = "Finalizado";
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

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalTime getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(LocalTime horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public LocalTime getHoraDeLlegada() {
        return horaDeLlegada;
    }

    public void setHoraDeLlegada(LocalTime horaDeLlegada) {
        this.horaDeLlegada = horaDeLlegada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public LocalDate getFechaLLegada() {
        return fechaLLegada;
    }

    public void setFechaLLegada(LocalDate fechaLLegada) {
        this.fechaLLegada = fechaLLegada;
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

    public Lista<Tiquete> getListaTiquetes() {
        return listaTiquetes;
    }

    public void setListaTiquetes(Lista<Tiquete> listaTiquetes) {
        this.listaTiquetes = listaTiquetes;
    }

    public SerializadoraCaseta getSerializadora() {
        return serializadora;
    }

    public void setSerializadora(SerializadoraCaseta serializadora) {
        this.serializadora = serializadora;
    }

    public Lista<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(Lista<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public Lista<Devolucion> getListaDevoluciones() {
        return listaDevoluciones;
    }

    public void setListaDevoluciones(Lista<Devolucion> listaDevoluciones) {
        this.listaDevoluciones = listaDevoluciones;
    }
   
}