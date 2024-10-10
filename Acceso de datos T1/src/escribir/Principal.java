/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escribir;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File fichero = new File("C:\\Users\\FP\\Desktop\\plantilla.txt");
        Scanner teclado = new Scanner(System.in);
        FileReader lectura = new FileReader(fichero);
        FileWriter escritura = new FileWriter("C:\\Users\\FP\\Desktop\\carta.txt");
        BufferedReader texto = new BufferedReader(lectura);
        String linea;
        System.out.println("Cual es tu nombre?");
        String nombre = teclado.next();
        System.out.println("Cual es tu apellido?");
        String apellido = teclado.next();
        System.out.println("Cual es tu jefe?");
        String jefe = teclado.next();
        System.out.println("Cual es tu departamente?");
        String departamento = teclado.next();
        while ((linea = texto.readLine()) != null) {
            linea = linea.replace("$nombre", nombre);
            linea = linea.replace("$apellido", apellido);
            linea = linea.replace("$jefe", jefe);
            linea = linea.replace("$departamento", departamento);
            escritura.write(linea);
            escritura.write("\n");
        }
        escritura.close();
        lectura.close();
        texto.close();
    }
}
