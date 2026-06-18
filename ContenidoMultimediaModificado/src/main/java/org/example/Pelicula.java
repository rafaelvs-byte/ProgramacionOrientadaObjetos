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
        return super.toString() + "Director: " + getDirector() + "\n";
    }

    @Override
    public String obtenerTipoContenido() {
        return "Pelicula";
    }

    @Override
    public int obtenerTiempoTotal() {
        return getDuracion();
    }

    @Override
    public int numeroDeEpisodios() {
        return 0;
    }

    @Override
    public String obtenerDatosGenerales() {
        return "Titulo: " + getTitulo() + ", Genero: " + getGenero() + ", Duracion: " + getDuracion() + " min.";
    }

    @Override
    public String obtenerDatosParticulares() {
        // Corrección: Tenías "new Podcast()", ahora devuelve correctamente el director de la Película
        return "Director: " + getDirector();
    }
}