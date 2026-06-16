package org.example;

public class Serie extends Contenido {
    private int numeroTemporadas;

    public Serie() {
    }

    public Serie(String titulo, String genero, int duracion, int numeroTemporadas) {
        super(titulo, genero, duracion);
        setNumeroTemporadas(numeroTemporadas);
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }
    @Override
    public String toString() {
        return super.toString() +
                "Director: "+getNumeroTemporadas()+"\n";
    }
}
