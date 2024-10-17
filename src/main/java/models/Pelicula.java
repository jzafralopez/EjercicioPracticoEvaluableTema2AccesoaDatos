package models;

/**
 * Clase Pelicula que contiene los atributos de una película y sus métodos getter y setter.
 * **/
public class Pelicula {
    Integer id;
    String titulo;
    String genero;
    Integer anho;

    public Pelicula(String titulo, String genero, Integer anho) {
        this.titulo = titulo;
        this.genero = genero;
        this.anho = anho;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAnho() {
        return anho;
    }

    public void setAnho(Integer anho) {
        this.anho = anho;
    }
}
