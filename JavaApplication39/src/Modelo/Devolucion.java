/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author juan
 */
public class Devolucion implements Serializable{
     private static final long serialVersionUID = 1L;
     private Tiquete tiquete;
     private LocalDate fechaDevolucion;
     private LocalTime horaDevolucion;

    public Devolucion(Tiquete tiquete) {
        this.tiquete = tiquete;
        this.horaDevolucion= LocalTime.now().withNano(0);
        this.fechaDevolucion=LocalDate.now();
    }

    public Tiquete getTiquete() {
        return tiquete;
    }

    public void setTiquete(Tiquete tiquete) {
        this.tiquete = tiquete;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public LocalTime getHoraDevolucion() {
        return horaDevolucion;
    }

    public void setHoraDevolucion(LocalTime horaDevolucion) {
        this.horaDevolucion = horaDevolucion;
    }
      
}