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
    private ArrayList<AdministradorFlota> ListaAdministradoresFlota;
    private AdministradorTerminal ListaAdministradorTerminal;
    //serializable
    private SerializadoraAdminTerminal serializadoraAdminiTerminal;
    private SerializadoraClientes serializadoraClientes;
    private SerializadoraAdminFlota serializadoraAdminFlota;
    
    public ControladorRegistro(){
       this.ListaClientes=serializadoraClientes.leerObjeto();
       this.ListaAdministradoresFlota=serializadoraAdminFlota.leerObjeto();
       this.ListaAdministradorTerminal=serializadoraAdminiTerminal.leerObjeto();
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
