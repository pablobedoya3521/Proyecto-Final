/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author juan
 */
public class AdministradorTerminal extends Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    
    public AdministradorTerminal(){
        
    }
    
    public AdministradorTerminal(String cedula, String nombre,String apellido, String correo, String contraseña) {
        super(cedula, nombre,apellido, correo, contraseña);
    }
    
}
