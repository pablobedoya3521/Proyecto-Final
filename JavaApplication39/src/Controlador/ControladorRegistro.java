/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AdministradorFlota;
import Modelo.AdministradorTerminal;
import Modelo.Cliente;
import Modelo.Usuario;
import Persistencia.SerializadoraAdmFlota;
import Persistencia.SerializadoraAdmTerminal;
import Persistencia.SerializadoraCliente;
import java.util.ArrayList;

/**
 *
 * @author juan
 */
public class ControladorRegistro {
    private ArrayList<Cliente> clientes;
    private SerializadoraAdmTerminal serializadoraAdmTerminal;
    private SerializadoraAdmFlota serializadoraAdmFlota;
    private SerializadoraCliente serializadoraCliente;
    private ArrayList<AdministradorFlota> administradoresFlota;
    private AdministradorTerminal administradoresTerminal;
    
    public ControladorRegistro(){
        this.serializadoraAdmTerminal=new SerializadoraAdmTerminal();
        this.administradoresTerminal= serializadoraAdmTerminal.leerObjeto();
        this.serializadoraAdmFlota=new SerializadoraAdmFlota();
        this.administradoresFlota= serializadoraAdmFlota.leerObjeto();
        this.serializadoraCliente= new SerializadoraCliente();
        this.clientes=serializadoraCliente.leerObjeto();
        
        
        
    }
    
    public String registrar(Usuario usuario){
        if(usuario instanceof AdministradorFlota){
            AdministradorFlota admin = (AdministradorFlota) usuario;
            return  registrarAdminFlota(admin);
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
   
    
    private String registrarCliente(Cliente cliente){
        for(int i=0; i< clientes.size();i++){
            if(clientes.get(i).getCedula().equals(cliente.getCedula())){
                return "Ya estas registrado con esta cedula"; 
            }else if(clientes.get(i).getCorreo().equals(cliente.getCorreo())){
                 return "Ya existe un registro con este correo";
            }
        }
        clientes.add(cliente);
        serializadoraCliente.escribirObjeto(clientes);
        return "Registrado correctamente";
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<AdministradorFlota> getAdministradoresFlota() {
        return administradoresFlota;
    }

    public void setAdministradoresFlota(ArrayList<AdministradorFlota> administradoresFlota) {
        this.administradoresFlota = administradoresFlota;
    }  
}
