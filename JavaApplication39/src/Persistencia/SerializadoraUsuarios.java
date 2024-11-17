/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Usuario;
import Util.Lista;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializadoraUsuarios implements Serializable{
    private static final long serialVersionUID = 1L;
    public void escribirObjeto(Lista<Usuario> usuarios){
        try{
            FileOutputStream file = new FileOutputStream("usuarios.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(file);
            escritor.writeObject(usuarios);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    public Lista<Usuario> leerObjeto() {
      try {
          FileInputStream file = new FileInputStream("usuarios.dat");
          ObjectInputStream lector = new ObjectInputStream(file);
          return ( Lista<Usuario>) lector.readObject();
      }
           catch (IOException | ClassNotFoundException ex) {
              ex.printStackTrace();
              return new Lista<Usuario>();
          }
    }
}