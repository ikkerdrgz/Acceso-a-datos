/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leerLineas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File fichero = new File ("C:\\Users\\FP\\Desktop\\fichero.txt");
        FileReader lectura = new FileReader (fichero);
        BufferedReader texto = new BufferedReader (lectura);
        String linea;
        int parrafos = 0;
        int palabras = 0;
        int caracteres = 0;
        int contLineas = 0;
        while ((linea = texto.readLine()) != null) {
            parrafos++;
            caracteres = caracteres + linea.length();
            for (int i = 0; i < linea.length(); i++) {
                if (linea.charAt(i) == ' ') {
                    palabras++;
                }
            }
            if (caracteres == 95) {
                contLineas = (caracteres / 95);
            } else {
                contLineas = (caracteres / 95 + 1);
            }
        }
        System.out.println("Parrafos: " + parrafos);
        System.out.println("Palabras: " + palabras);
        System.out.println("Caracteres con espacios: " + caracteres);
        System.out.println("Caracteres sin espacios: " + (caracteres-palabras));
        System.out.println("Lineas: " + contLineas);
        lectura.close();
    } 
}
