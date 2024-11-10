/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Caseta;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


/**
 *
 * @author juan
 */
public class SerializadoraCaseta implements Serializable{
    
    public void escribirObjeto(Caseta[][] casetas){
        try{
            FileOutputStream file = new FileOutputStream("Casetas.dat");//archivo  donde se guardara el objeto
            ObjectOutputStream escritor = new ObjectOutputStream(file);// objeto que permite escribir el objeto en el archivo
            escritor.writeObject(casetas);// escribo el objeto en el archivo
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

     public Caseta[][] leerObjeto() {
        Caseta[][] casetas;  // Declaración de la variable casetas
        int contador = 1;  // Inicializar contador, si es necesario para crear un ID único
        try (FileInputStream file = new FileInputStream("Casetas.dat");
             ObjectInputStream lector = new ObjectInputStream(file)) {
            casetas = (Caseta[][]) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            // Si hay un error en la lectura, inicializo las casetas con valores predeterminados
            casetas = new Caseta[4][];
            casetas[0] = new Caseta[5];
            casetas[1] = new Caseta[2];
            casetas[2] = new Caseta[2];
            casetas[3] = new Caseta[2];

            // Inicializar cada caseta con un contador único
            for (int i = 0; i < casetas.length; i++) {
                for (int j = 0; j < casetas[i].length; j++) {
                    casetas[i][j] = new Caseta(contador++);  // Asigna un ID único a cada caseta
                }
            }
        }
        return casetas;
    }
}
