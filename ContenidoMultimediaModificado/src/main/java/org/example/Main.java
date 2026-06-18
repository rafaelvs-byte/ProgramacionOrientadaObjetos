package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static Contenido multimedia;
    static ArrayList<Contenido> multimedias = new ArrayList<Contenido>();

    static void nuevaPelicula() {
        multimedia = new Pelicula("Titanic", "Drama", 120, "Guillermo del Toro");
        multimedias.add(multimedia);
    }

    static void nuevaSerie() {
        multimedia = new Serie("Stranger Things", "Acción", 40, 7);
        multimedias.add(multimedia);
    }

    static void nuevoPodcast() {
        multimedia = new Podcast("La cotorriza", "Comedia", 128, "Memo");
        multimedias.add(multimedia);
    }

    static void imprimirmultimedia() {
        for (Contenido m1 : multimedias) {
            System.out.println(m1);
        }
    }

    // Corrección en la firma del método main
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int op = 0;
        while (op != 11) {
            System.out.println("\n--- MENÚ MULTIMEDIA ---");
            System.out.println("1. Registrar Pelicula");
            System.out.println("2. Registrar Serie");
            System.out.println("3. Registrar Podcast");
            System.out.println("4. Mostrar todo el contenido registrado (toString)");
            System.out.println("5. Reproducir todo el contenido");
            System.out.println("6. Mostrar únicamente el TIPO de contenido");
            System.out.println("7. Mostrar el TIEMPO TOTAL de cada contenido");
            System.out.println("8. Mostrar NÚMERO DE EPISODIOS (Solo Series)");
            System.out.println("9. Mostrar DATOS GENERALES (Clase Padre)");
            System.out.println("10. Mostrar DATOS PARTICULARES (Clases Hijas)");
            System.out.println("11. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                op = Integer.parseInt(leer.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
                continue;
            }

            switch (op) {
                case 1:
                    nuevaPelicula();
                    System.out.println("Película registrada.");
                    break;
                case 2:
                    nuevaSerie();
                    System.out.println("Serie registrada.");
                    break;
                case 3:
                    nuevoPodcast();
                    System.out.println("Podcast registrado.");
                    break;
                case 4:
                    System.out.println("\n--- Todo el contenido registrado ---");
                    imprimirmultimedia();
                    break;
                case 5:
                    System.out.println("\n--- Reproduciendo contenido ---");
                    for (Contenido m1 : multimedias) {
                        m1.reproducir();
                    }
                    break;
                case 6:
                    System.out.println("\n--- Tipos de Contenido ---");
                    for (Contenido m1 : multimedias) {
                        System.out.println('"' + m1.getTitulo() + '"' + " es un/a: " + m1.obtenerTipoContenido());
                    }
                    break;
                case 7:
                    System.out.println("\n--- Tiempo Total ---");
                    for (Contenido m1 : multimedias) {
                        System.out.println('"' + m1.getTitulo() + '"' + " tiene un tiempo total de: " + m1.obtenerTiempoTotal() + " minutos.");
                    }
                    break;
                case 8:
                    System.out.println("\n--- Número de Episodios ---");
                    for (Contenido m1 : multimedias) {
                        System.out.println('"' + m1.getTitulo() + '"' + " - Episodios: " + m1.numeroDeEpisodios());
                    }
                    break;
                case 9:
                    System.out.println("\n--- Datos Generales ---");
                    for (Contenido m1 : multimedias) {
                        System.out.println(m1.obtenerDatosGenerales());
                    }
                    break;
                case 10:
                    System.out.println("\n--- Datos Particulares ---");
                    for (Contenido m1 : multimedias) {
                        System.out.println('"' + m1.getTitulo() + '"' + " -> " + m1.obtenerDatosParticulares());
                    }
                    break;
                case 11:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Inserte un número válido");
                    break;
            }
        }
    }
}
