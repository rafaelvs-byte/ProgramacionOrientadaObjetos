package org.example;

public class Pelicula extends Contenido {
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, int duracion, String director) {
        super(titulo, genero, duracion);
        setDirector(director);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    @Override
    public String toString() {
        return super.toString() +
                "Director: "+getDirector()+"\n";
    }
}
