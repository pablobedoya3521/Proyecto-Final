/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Bus;
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
public class SerializadoraBus {
    public void escribirObjeto(ArrayList<Bus> buses){
        try{
            FileOutputStream file = new FileOutputStream("buses.dat");//archivo  donde se guardara el objeto
            ObjectOutputStream escritor = new ObjectOutputStream(file);// objeto que permite escribir el objeto en el archivo
            escritor.writeObject(buses);// escribo el objeto en el archivo
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

 public ArrayList<Bus> leerObjeto() {
       try {
           FileInputStream file = new FileInputStream("buses.dat");
           ObjectInputStream lector = new ObjectInputStream(file);
           return (ArrayList<Bus>) lector.readObject();
       }
        catch (IOException | ClassNotFoundException ex) {
           ex.printStackTrace();
           return new ArrayList<>(); // Manejo de otras excepciones
       }
   }
}
