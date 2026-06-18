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
        // Corrección: Decía "Director" en lugar de "Temporadas"
        return super.toString() + "Temporadas: " + getNumeroTemporadas() + "\n";
    }

    @Override
    public String obtenerTipoContenido() {
        return "Serie";
    }

    @Override
    public int obtenerTiempoTotal() {
        return getDuracion();
    }

    @Override
    public int numeroDeEpisodios() {
        // Aquí puedes retornar el número real si tuvieras el atributo, por ahora dejamos el 4 fijo que tenías
        return 4;
    }

    @Override
    public String obtenerDatosGenerales() {
        return "Titulo: " + getTitulo() + ", Genero: " + getGenero() + ", Duracion: " + getDuracion() + " min.";
    }

    @Override
    public String obtenerDatosParticulares() {
        // Corrección: Retorna el atributo específico de la subclase
        return "Número de temporadas: " + getNumeroTemporadas();
    }
}