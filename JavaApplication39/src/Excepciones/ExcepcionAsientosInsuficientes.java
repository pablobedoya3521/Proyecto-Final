/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

public class ExcepcionAsientosInsuficientes extends Exception {
    public ExcepcionAsientosInsuficientes() {
        super("No hay suficientes asientos disponibles para realizar esta venta");
    }
}