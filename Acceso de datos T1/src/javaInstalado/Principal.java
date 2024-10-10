/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaInstalado;

import java.io.File;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        File f1 = new File ("C:\\Program Files\\Java\\jdk-21");
        File f2 = new File ("C:\\Program Files\\Java\\jdk-22");
        
        if (f1.exists() == true) {
            System.out.println("Si existe y es la version 21");
        } else {
            System.out.println("No tienes la version 21");
        }
           
        if (f2.exists() == true) {
            System.out.println("Si existe y es la version 22");
        } else {
            System.out.println("No tienes la version 22");
        }
    }
}
