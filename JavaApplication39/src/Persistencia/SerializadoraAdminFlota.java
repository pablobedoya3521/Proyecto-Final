/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.AdministradorFlota;
import Util.Lista;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author juan
 */
public class SerializadoraAdminFlota {
    public void escribirObjeto(Lista<AdministradorFlota> administradoresFlota){
        try{
            FileOutputStream file = new FileOutputStream("administradoresFlota.dat");//archivo  donde se guardara el objeto
            ObjectOutputStream escritor = new ObjectOutputStream(file);// objeto que permite escribir el objeto en el archivo
            escritor.writeObject(administradoresFlota);// escribo el objeto en el archivo
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

 public Lista<AdministradorFlota> leerObjeto() {
       try {
           FileInputStream file = new FileInputStream("administradoresFlota.dat");
           ObjectInputStream lector = new ObjectInputStream(file);
           return ( Lista<AdministradorFlota>) lector.readObject();
       }
        catch (IOException | ClassNotFoundException ex) {
           ex.printStackTrace();
           return new Lista<>(); // Manejo de otras excepciones
       }
   }
}