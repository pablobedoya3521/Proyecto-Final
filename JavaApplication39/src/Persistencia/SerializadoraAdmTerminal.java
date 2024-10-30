/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.AdministradorTerminal;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author sebastian
 */
public class SerializadoraAdmTerminal {
    public void escribirObjeto(AdministradorTerminal administradorTerminal){
        try{
            FileOutputStream file = new FileOutputStream("administradorTerminal.dat");//archivo  donde se guardara el objeto
            ObjectOutputStream escritor = new ObjectOutputStream(file);// objeto que permite escribir el objeto en el archivo
            escritor.writeObject(administradorTerminal);// escribo el objeto en el archivo
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

 public AdministradorTerminal leerObjeto() {
       try {
           FileInputStream file = new FileInputStream("administradorTerminal.dat");
           ObjectInputStream lector = new ObjectInputStream(file);
           return (AdministradorTerminal) lector.readObject();
       }
        catch (IOException | ClassNotFoundException ex) {
           ex.printStackTrace();
           return new AdministradorTerminal(); // Manejo de otras excepciones
       }
   }
}
