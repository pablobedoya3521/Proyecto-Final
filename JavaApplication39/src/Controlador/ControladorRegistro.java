/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.ExcepcionCorreoEnUso;
import Excepciones.ExcepcionUsuarioNoEncontrado;
import Modelo.Usuario;
import Persistencia.SerializadoraUsuarios;
import Util.Lista;
import java.io.Serializable;

public class ControladorRegistro implements Serializable{
    private static final long serialVersionUID = 1L;
    private Lista<Usuario> usuarios;
    private SerializadoraUsuarios serializadora;
    
    public ControladorRegistro(){
        this.serializadora=new SerializadoraUsuarios();
        this.usuarios=serializadora.leerObjeto();
    }
    
    public void guardar(Usuario usuario) throws ExcepcionCorreoEnUso{
       for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getCorreo().equals(usuario.getCorreo())){
                throw new ExcepcionCorreoEnUso();
            }
        }
        usuarios.add(usuario);
        serializadora.escribirObjeto(usuarios);
    }
    
    public Usuario buscar(String correo) throws ExcepcionUsuarioNoEncontrado{
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getCorreo().equals(correo)){
                return usuarios.get(i);
            }
        }
        throw new ExcepcionUsuarioNoEncontrado();
    }

    public Lista<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Lista<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}