/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AdministradorFlota;
import Modelo.AdministradorTerminal;
import Modelo.Cliente;
import Persistencia.SerializadoraAdminFlota;
import Persistencia.SerializadoraAdminTerminal;
import Persistencia.SerializadoraClientes;
import java.util.ArrayList;

/**
 *
 * @author juan
 */
public class ControladorRegistro {
    //listas
    private ArrayList<Cliente> ListaClientes;
    private ArrayList<AdministradorFlota> listaAdministradoresFlota;
    private AdministradorTerminal ListaAdministradorTerminal;
    //serializable
    private SerializadoraAdminTerminal serializadoraAdminiTerminal;
    private SerializadoraClientes serializadoraClientes;
    private SerializadoraAdminFlota serializadoraAdminFlota;
    
    public ControladorRegistro(){
        this.serializadoraAdminFlota= new SerializadoraAdminFlota();
        this.serializadoraAdminiTerminal= new SerializadoraAdminTerminal();
        this.serializadoraClientes= new SerializadoraClientes();
       this.ListaClientes=serializadoraClientes.leerObjeto();
       this.listaAdministradoresFlota=serializadoraAdminFlota.leerObjeto();
       this.ListaAdministradorTerminal=serializadoraAdminiTerminal.leerObjeto();
    }
    
    public boolean guardarAdministradorFlota(AdministradorFlota administradorFlota){
    AdministradorFlota aux=buscarAdministradorFlota(administradorFlota.getCedula());
        if(aux == null){
            listaAdministradoresFlota.add(administradorFlota);
            serializadoraAdminFlota.escribirObjeto(listaAdministradoresFlota);
            return true;
        }
        return false;
    }
    
    public AdministradorFlota buscarAdministradorFlota(String cedula){
        for(int i=0; i<listaAdministradoresFlota.size(); i++){
            if(listaAdministradoresFlota.get(i).getCedula().equals(cedula)){
                return listaAdministradoresFlota.get(i);
            }
        }
        return null;
    }
    
     public boolean eliminarAdministradorFlota(String cedula){
        for(int i=0; i<listaAdministradoresFlota.size(); i++){
            if(listaAdministradoresFlota.get(i).getCedula().equals(cedula)){
                listaAdministradoresFlota.remove(i);
                return true;
            }
        }
        return false;
    } 
     
      public boolean modificarAdministradorFlota(AdministradorFlota administradorFlota){
      AdministradorFlota aux=buscarAdministradorFlota(administradorFlota.getCedula());
      
      if(aux != null){
          aux.setCedula(administradorFlota.getCedula());
          aux.setNombre(administradorFlota.getNombre());
          aux.setApellido(administradorFlota.getApellido());
          aux.setCorreo(administradorFlota.getCorreo());
          aux.setContraseña(administradorFlota.getContraseña());
          
          return true;
      }
      return false;
    }
      
    public String guardarCliente(Cliente cliente){
        Cliente respuesta = buscarCliente(cliente.getCorreo());
        if(respuesta==null){
            ListaClientes.add(cliente);
            serializadoraClientes.escribirObjeto(ListaClientes);
            return "Guardado Correctamente";
        }
        return "Lo siento, ya hay una persona registrada con este correo";
    } 
    
    public Cliente buscarCliente(String correo){
        for(int i=0; i<ListaClientes.size();i++){
            if(ListaClientes.get(i).getCorreo().equals(correo)){
                return ListaClientes.get(i);
            }
        }
        return null;
    }

    public ArrayList<Cliente> getClientes() {
        return ListaClientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.ListaClientes = clientes;
    }

    public ArrayList<AdministradorFlota> getAdministradoresFlota() {
        return listaAdministradoresFlota;
    }

    public AdministradorTerminal getAdministradorTerminal() {
        return ListaAdministradorTerminal;
    }

    public void setAdministradorTerminal(AdministradorTerminal administradorTerminal) {
        this.ListaAdministradorTerminal = administradorTerminal;
    }
    
}
