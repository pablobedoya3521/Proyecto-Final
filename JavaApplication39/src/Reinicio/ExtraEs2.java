package Reinicio;

import Controlador.ControladorRegistro;
import Excepciones.ExcepcionCorreoEnUso;
import Modelo.AdministradorTerminal;

public class ExtraEs2 {
   private static ControladorRegistro controlador = new ControladorRegistro(); // Inicializar controlador

    public static void main(String[] args) {
        try {
            AdministradorTerminal admin = new AdministradorTerminal("Juan", "Bedoya", "123", "Admin", "Admin");
            guardar(admin);
        } catch (ExcepcionCorreoEnUso e) {
            System.out.println("Error: El correo ya está en uso.");
        }
    }

    private static void guardar(AdministradorTerminal admin) throws ExcepcionCorreoEnUso {
        controlador.guardar(admin); 
    }
    
}
