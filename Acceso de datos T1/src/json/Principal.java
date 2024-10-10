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
public class Principal {
    public static void main(String[] args) {
        UsuarioAvanzado usuario1 = new UsuarioAvanzado("Jude Bellingham",21);
        UsuarioAvanzado usuario2 = new UsuarioAvanzado("Kylian Mbappé",25);
        
        Proyecto proyecto = new Proyecto("Copa de Europa 24/25");
        proyecto.agregarParticipante(usuario1);
        proyecto.agregarParticipante(usuario2);
        
        JSONObject jsonProyecto = new JSONObject();
        jsonProyecto.put("nombre", proyecto.getNombre());
        
        JSONArray jsonParticipantes = new JSONArray();
        for (UsuarioAvanzado participante : proyecto.getParticipantes()) {
            JSONObject jsonParticipante = new JSONObject();
            jsonParticipante.put("nombre", participante.getNombre());
            jsonParticipante.put("edad", participante.getEdad());
            jsonParticipantes.put(jsonParticipante);
        }
        jsonProyecto.put("participantes", jsonParticipantes);
        
        try {
            java.nio.file.Files.write(java.nio.file.Paths.get("proyecto.json"), jsonProyecto.toString().getBytes());
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
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