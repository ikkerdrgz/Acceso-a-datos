/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fortnite;

import java.io.File;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        
        File f = new File ("WINDOWS\\fortnite.xml");
        
        System.out.println("Nombre " + f.getName());
        System.out.println("Ruta absoluta " + f.getAbsolutePath());
        System.out.println("Directorio padre " + f.getParent());
        System.out.println("Directorio padre " + f.getPath());
        
        if (f.isDirectory() == true) {
            System.out.println("Es un directorio");
        } else {
            System.out.println("No es un directorio");
        }
        if (f.exists() == true) {
            System.out.println("El fichero existe");
        } else {
            System.out.println("El fichero no existe");
        }
    }
    
}
