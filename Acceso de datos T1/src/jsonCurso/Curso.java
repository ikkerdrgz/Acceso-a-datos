/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jsonCurso;

import java.util.ArrayList;

/**
 *
 * @author FP
 */
public class Curso {
    private String nombre;
    private ArrayList<UsuarioAvanzado> modulos;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.modulos = new ArrayList<UsuarioAvanzado>();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public ArrayList<UsuarioAvanzado> getModulos() {
        return modulos;
    }
    
    public void setModulos(ArrayList<UsuarioAvanzado> modulos) {
        this.modulos = modulos;
    }

    public boolean agregarModulo(UsuarioAvanzado e) {
        return modulos.add(e);
    }
}
