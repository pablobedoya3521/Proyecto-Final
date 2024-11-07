/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.ExcepcionCorreoEnUso;
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
    private ArrayList<AdministradorFlota> ListaAdministradoresFlota;
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
       this.ListaAdministradoresFlota=serializadoraAdminFlota.leerObjeto();
       this.ListaAdministradorTerminal=serializadoraAdminiTerminal.leerObjeto();
    }
    
    public void guardarCliente(Cliente cliente) throws ExcepcionCorreoEnUso{
        Cliente respuesta = buscarCliente(cliente.getCorreo());
        if(respuesta!=null){
            throw new ExcepcionCorreoEnUso();
        }
        ListaClientes.add(cliente);
        serializadoraClientes.escribirObjeto(ListaClientes);
    } 
    
    public Cliente buscarCliente(String correo){
        for(int i=0; i<ListaClientes.size();i++){
            if(ListaClientes.get(i).getCorreo().equals(correo)){
                return ListaClientes.get(i);
            }
        }
        return null;
    }
    
    public void guardarAdministradorFlota(AdministradorFlota administradorFlota) throws ExcepcionCorreoEnUso{
        AdministradorFlota respuesta = buscarAdministradorFlota(administradorFlota.getCorreo());
        if(respuesta!=null){
            throw new ExcepcionCorreoEnUso();
        }
        ListaAdministradoresFlota.add(administradorFlota);
        serializadoraAdminFlota.escribirObjeto(ListaAdministradoresFlota);
    } 
    
    public AdministradorFlota buscarAdministradorFlota(String correo){
        for(int i=0; i<ListaAdministradoresFlota.size();i++){
            if(ListaAdministradoresFlota.get(i).getCorreo().equals(correo)){
                return ListaAdministradoresFlota.get(i);
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
        return ListaAdministradoresFlota;
    }

    public void setAdministradoresFlota(ArrayList<AdministradorFlota> administradoresFlota) {
        this.ListaAdministradoresFlota = administradoresFlota;
    }

    public AdministradorTerminal getAdministradorTerminal() {
        return ListaAdministradorTerminal;
    }

    public void setAdministradorTerminal(AdministradorTerminal administradorTerminal) {
        this.ListaAdministradorTerminal = administradorTerminal;
    }
    
}
