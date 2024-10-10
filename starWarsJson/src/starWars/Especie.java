/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starWars;

/**
 *
 * @author FP
 */
public class Especie {
    private String name;
    private String classification;
    private String designation;
    private String average_heightp;
    private String skin_colors;
    private String hair_colors;
    private String average_lifespan;
    private String language;
    
    public Especie(String name, String classification, String designation, String average_heightp, String skin_colors, String hair_colors, String average_lifespan, String language) {
        this.name = name;
        this.classification = classification;
        this.designation = designation;
        this.average_heightp = average_heightp;
        this.skin_colors = skin_colors;
        this.hair_colors = hair_colors;
        this.average_lifespan = average_lifespan;
        this.language = language;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getClassification() {
        return classification;
    }
    
    public void setClassification(String classification) {
        this.classification = classification;
    }
    
    public String getDesignation() {
        return designation;
    }
    
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public String getAverage_heightp() {
        return average_heightp;
    }
    
    public void setAverage_heightp(String average_heightp) {
        this.average_heightp = average_heightp;
    }
    
    public String getSkin_colors() {
        return skin_colors;
    }
    
    public void setSkin_colors(String skin_colors) {
        this.skin_colors = skin_colors;
    }
    
    public String getHair_colors() {
        return hair_colors;
    }
    
    public void setHair_colors(String hair_colors) {
        this.hair_colors = hair_colors;
    }
    
    public String getAverage_lifespan() {
        return average_lifespan;
    }
    
    public void setAverage_lifespan(String average_lifespan) {
        this.average_lifespan = average_lifespan;
    }
    
    public String getLanguage() {
        return language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }
}
