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

public class SerializadoraCaseta implements Serializable{
    
    public void escribirObjeto(Caseta[][] casetas) {
        try {
             FileOutputStream file = new FileOutputStream("Casetas.dat");
             ObjectOutputStream escritor = new ObjectOutputStream(file);
             System.out.println("Escribiendo casetas en el archivo...");
             escritor.writeObject(casetas);
             System.out.println("Casetas escritas correctamente."); 
        } catch(IOException ex) {
             ex.printStackTrace();
        }
    }

    public Caseta[][] leerObjeto() {
        Caseta[][] casetas; 
        int contador = 1;  
        try (FileInputStream file = new FileInputStream("Casetas.dat");
             ObjectInputStream lector = new ObjectInputStream(file)) {
            casetas = (Caseta[][]) lector.readObject();
            System.out.println("Casetas leídas del archivo.");
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            casetas = new Caseta[4][];
            casetas[0] = new Caseta[5];
            casetas[1] = new Caseta[2];
            casetas[2] = new Caseta[2];
            casetas[3] = new Caseta[2];

            for (int i = 0; i < casetas.length; i++) {
                for (int j = 0; j < casetas[i].length; j++) {
                    casetas[i][j] = new Caseta(contador++);  
                }
            }
        }
        return casetas;
    }
}