/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package json;

import org.json.*;

/**
 *
 * @author FP
 */
public class lecturaJSON {
    public static void main(String[] args) {
        //Leer desde un archivo JSON
        try {
            String contenido = new String (java.nio.file.Files.readAllBytes(java.nio.file.Paths.get("proyecto.json")));
            JSONObject jsonLeido = new JSONObject (contenido);
            //Recuperar datos del proyecto
            String nombreProyecto = jsonLeido.getString("nombre");
            JSONArray jsonParticipantesLeidos = jsonLeido.getJSONArray("participantes");
            //Crear un proyecto con los datos leidos
            Proyecto proyectoLeido = new Proyecto(nombreProyecto);
            //Agregar participantes al proyecto
            for (int i = 0; i < jsonParticipantesLeidos.length(); i++) {
                JSONObject jsonParticipante = jsonParticipantesLeidos.getJSONObject(i);
                String nombreParticipante = jsonParticipante.getString("nombre");
                int edadParticipante = jsonParticipante.getInt("edad");
                UsuarioAvanzado participanteLeido = new UsuarioAvanzado(nombreParticipante, edadParticipante);
                //Agrego al ArrayList
                proyectoLeido.agregarParticipante(participanteLeido);
            }
            //Realizar operaciones con el proyecto leido
            System.out.println("Proyecto: " + proyectoLeido.getNombre());
            System.out.println("Participantes: ");
            //Muestro el ArrayList
            for (UsuarioAvanzado participante : proyectoLeido.getParticipantes()) {
                System.out.println("- " + participante.getNombre() + ", Edad: " + participante.getNombre());
            }
        } catch(java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
