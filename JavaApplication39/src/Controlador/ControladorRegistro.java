/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AdministradorFlota;
import Modelo.AdministradorTerminal;
import Modelo.Cliente;
import Modelo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author juan
 */
public class ControladorRegistro {
    private ArrayList<Cliente> clientes;
    private ArrayList<AdministradorFlota> administradoresFlota;
    private ArrayList<AdministradorTerminal> administradoresTerminal;
    
    public ControladorRegistro(){
        this.clientes=new ArrayList<>();
        this.administradoresFlota=new ArrayList<>();
        this.administradoresTerminal=new ArrayList<>();
    }
    
    public String registrar(Usuario usuario){
        if(usuario instanceof AdministradorFlota){
            AdministradorFlota admin = (AdministradorFlota) usuario;
            return  registrarAdminFlota(admin);
        }else if(usuario instanceof AdministradorTerminal){
            AdministradorTerminal admin = (AdministradorTerminal) usuario;
            return registrarAdminTerminal(admin);
        }else if(usuario instanceof Cliente){
            Cliente cliente = (Cliente) usuario;
            return registrarCliente(cliente);
        }
        return "Error al registrar, escoge tu rol";
    }

    private String registrarAdminFlota(AdministradorFlota admin){
        for(int i=0; i< administradoresFlota.size();i++){
            if(administradoresFlota.get(i).getCedula().equals(admin.getCedula())){
                return "Ya estas registrado con esta cedula";   
            }else if(administradoresFlota.get(i).getCorreo().equals(admin.getCorreo())){
                return "Ya existe un registro con este correo";
            }
        }
        administradoresFlota.add(admin);
        return "Registrado correctamente";
    }
    
    private String registrarAdminTerminal(AdministradorTerminal admin){
        for(int i=0; i< administradoresTerminal.size(); i++){
            if(administradoresTerminal.get(i).getCedula().equals(admin.getCedula())){
                  return "Ya estas registrado con esta cedula"; 
            }else if(administradoresTerminal.get(i).getCorreo().equals(admin.getCorreo())){
                 return "Ya existe un registro con este correo";
            }
        }
        administradoresTerminal.add(admin);
        return "Registrado correctamente";    
    }
    
    private String registrarCliente(Cliente cliente){
        for(int i=0; i< clientes.size();i++){
            if(clientes.get(i).getCedula().equals(cliente.getCedula())){
                return "Ya estas registrado con esta cedula"; 
            }else if(clientes.get(i).getCorreo().equals(cliente.getCorreo())){
                 return "Ya existe un registro con este correo";
            }
        }
        clientes.add(cliente);
        return "Registrado correctamente";
    }
}
