/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jsonCurso;

import json.Proyecto;
import org.json.*;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        UsuarioAvanzado modulo1 = new UsuarioAvanzado("1","Acceso a datos","6","8.45");
        UsuarioAvanzado modulo2 = new UsuarioAvanzado("2","Programación de servicios y procesos","6","9.0");
        
        Curso curso = new Curso("DAM");
        curso.agregarModulo(modulo1);
        curso.agregarModulo(modulo2);
        
        JSONObject jsonProyecto = new JSONObject();
        jsonProyecto.put("curso",curso.getNombre());
        
        JSONArray jsonModulos = new JSONArray();
        for (UsuarioAvanzado modulo : curso.getModulos()) {
            JSONObject jsonModulo = new JSONObject();
            jsonModulo.put("id", modulo.getId());
            jsonModulo.put("nombre", modulo.getNombre());
            jsonModulo.put("horas", modulo.getHoras());
            jsonModulo.put("nota", modulo.getNota());
            jsonModulos.put(jsonModulo);
        }
        jsonProyecto.put("participantes", jsonModulos);
        
        try {
            java.nio.file.Files.write(java.nio.file.Paths.get("curso.json"), jsonProyecto.toString().getBytes());
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
