package org.example;

public class Podcast extends Contenido {
    private String nombrePresentador;

    public Podcast() {
    }

    public Podcast(String titulo, String genero, int duracion, String nombrePresentador) {
        super(titulo, genero, duracion);
        setNombrePresentador(nombrePresentador);
    }

    public String getNombrePresentador() {
        return nombrePresentador;
    }

    public void setNombrePresentador(String nombrePresentador) {
        this.nombrePresentador = nombrePresentador;
    }

    @Override
    public String toString() {
        return super.toString() + "Nombre del presentador: " + getNombrePresentador() + "\n";
    }

    @Override
    public String obtenerTipoContenido() {
        return "Podcast";
    }

    @Override
    public int obtenerTiempoTotal() {
        return getDuracion();
    }

    @Override
    public int numeroDeEpisodios() {
        return 0; // Los podcasts en tu lógica actual devuelven 0
    }

    @Override
    public String obtenerDatosGenerales() {
        return "Titulo: " + getTitulo() + ", Genero: " + getGenero() + ", Duracion: " + getDuracion() + " min.";
    }

    @Override
    public String obtenerDatosParticulares() {
        // Corrección: Retorna el atributo específico de la subclase
        return "Presentador: " + getNombrePresentador();
    }
}