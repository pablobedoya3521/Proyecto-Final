/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;


import Modelo.Cliente;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author juan
 */
public class SerializadoraClientes {
    
    
    public void escribirObjeto(ArrayList<Cliente> clientes){
        try{
            FileOutputStream file = new FileOutputStream("Clientes.dat");//archivo  donde se guardara el objeto
            ObjectOutputStream escritor = new ObjectOutputStream(file);// objeto que permite escribir el objeto en el archivo
            escritor.writeObject(clientes);// escribo el objeto en el archivo
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

 public ArrayList<Cliente> leerObjeto() {
       try {
           FileInputStream file = new FileInputStream("Clientes.dat");
           ObjectInputStream lector = new ObjectInputStream(file);
           return ( ArrayList<Cliente>) lector.readObject();
       }
        catch (IOException | ClassNotFoundException ex) {
           ex.printStackTrace();
           return new ArrayList<>(); // Manejo de otras excepciones
       }
   }
}
