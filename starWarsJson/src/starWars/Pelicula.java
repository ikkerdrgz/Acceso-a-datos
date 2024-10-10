/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starWars;

/**
 *
 * @author FP
 */
public class Pelicula {
    private String tittle;
    private String episode_id;
    private String opening_crawl;
    private String director;
    
    public Pelicula(String tittle, String episode_id, String opening_crawl, String director) {
        this.tittle = tittle;
        this.episode_id = episode_id;
        this.opening_crawl = opening_crawl;
        this.director = director;
    }
    
    public String getTittle() {
        return tittle;
    }
    
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    
    public String getEpisode_id() {
        return episode_id;
    }
    
    public void setEpisode_id(String episode_id) {
        this.episode_id = episode_id;
    }
    
    public String getOpening_crawl() {
        return opening_crawl;
    }
    
    public void setOpening_crawl(String opening_crawl) {
        this.opening_crawl = opening_crawl;
    }
    
    public String getDirector() {
        return director;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }
}
