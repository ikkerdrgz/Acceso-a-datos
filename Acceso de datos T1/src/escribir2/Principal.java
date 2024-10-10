/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escribir2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) throws FileNotFoundException {
        String miUsuario = "root";
        String miContraseña = "p@ssword";
        String elServidor = "goldengate.tk";
        String elPuerto = "3306";
        
        Properties configuracion = new Properties();
        configuracion.setProperty("user", miUsuario);
        configuracion.setProperty("password", miContraseña);
        configuracion.setProperty("server", elServidor);
        configuracion.setProperty("port", elPuerto);
        try {
            configuracion.store(new FileOutputStream("config.pass"), "Fichero de configuracion");
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
