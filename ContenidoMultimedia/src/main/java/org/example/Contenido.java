package org.example;

public class Contenido {
    private String titulo;
    private String genero;
    private int duracion;

    public Contenido() {
    }

    public Contenido(String titulo, String genero, int duracion) {
        setTitulo(titulo);
        setGenero(genero);
        setDuracion(duracion);
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

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if(duracion>0) {
            this.duracion = duracion;
        }
        else{
            System.out.println("Introduzca una duración valida");
        }
    }
    public void reproducir(){
        System.out.println('"' + getTitulo() + '"' + " se está reproduciendo...");    }

    @Override
    public String toString() {
        return "Titulo: " + getTitulo() + "\n" +
                "Genero: " + getGenero() + "\n" +
                "Duracion en minutos: " + getDuracion() + "\n";

    }
}