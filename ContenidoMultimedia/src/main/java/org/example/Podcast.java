package org.example;

public class Podcast extends Contenido{
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
        return super.toString() +
                "Nombre del presentador: "+getNombrePresentador();
    }
}
