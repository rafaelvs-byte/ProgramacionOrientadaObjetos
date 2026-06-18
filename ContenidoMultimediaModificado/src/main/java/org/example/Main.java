package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static Contenido multimedia;
    static ArrayList<Contenido> multimedias = new ArrayList<Contenido>();

    // Métodos de registro
    static void nuevaPelicula() {
        multimedia = new Pelicula("Titanic", "Drama", 120, "Guillermo del Toro");
        multimedias.add(multimedia);
        System.out.println("Película registrada.");
    }

    static void nuevaSerie() {
        multimedia = new Serie("Stranger Things", "Acción", 40, 7);
        multimedias.add(multimedia);
        System.out.println("Serie registrada.");
    }

    static void nuevoPodcast() {
        multimedia = new Podcast("La cotorriza", "Comedia", 128, "Memo");
        multimedias.add(multimedia);
        System.out.println("Podcast registrado.");
    }

    static void imprimirmultimedia() {
        for (Contenido m1 : multimedias) {
            System.out.println(m1);
        }
    }

    static void reproducirTodo() {
        for (Contenido m1 : multimedias) {
            m1.reproducir();
        }
    }

    static void mostrarTipos() {
        for (Contenido m1 : multimedias) {
            System.out.println('"' + m1.getTitulo() + '"' + " es: " + m1.obtenerTipoContenido());
        }
    }

    static void mostrarTiemposTotales() {
        for (Contenido m1 : multimedias) {
            System.out.println('"' + m1.getTitulo() + '"' + " - Tiempo total: " + m1.obtenerTiempoTotal() + " min.");
        }
    }

    static void mostrarEpisodios() {
        for (Contenido m1 : multimedias) {
            System.out.println('"' + m1.getTitulo() + '"' + " - Episodios: " + m1.numeroDeEpisodios());
        }
    }

    static void mostrarDatosGenerales() {
        for (Contenido m1 : multimedias) {
            System.out.println(m1.obtenerDatosGenerales());
        }
    }

    static void mostrarDatosParticulares() {
        for (Contenido m1 : multimedias) {
            System.out.println('"' + m1.getTitulo() + '"' + m1.obtenerDatosParticulares());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int op = 0;

        while (op != 4) {
            System.out.println("      MENÚ PRINCIPAL MULTIMEDIA     ");
            System.out.println("=================================");
            System.out.println("1. Menú de Registros (Película, Serie, Podcast)");
            System.out.println("2. Menú de Reproducción y Listados Generales");
            System.out.println("3. Menú de Consultas y Métodos Específicos");
            System.out.println("4. Salir del programa");

            try {
                op = Integer.parseInt(leer.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
                continue;
            }

            if (op == 1) {
                System.out.println("\n--- SUBMENÚ: REGISTROS ---");
                System.out.println("1. Registrar Película");
                System.out.println("2. Registrar Serie");
                System.out.println("3. Registrar Podcast");
                System.out.print("Seleccione una opción: ");
                int subOp = Integer.parseInt(leer.readLine());

                if (subOp == 1) {
                    nuevaPelicula();
                } else if (subOp == 2) {
                    nuevaSerie();
                } else if (subOp == 3) {
                    nuevoPodcast();
                } else {
                    System.out.println("Opción no válida.");
                }

            } else if (op == 2) {
                System.out.println("\n--- REPRODUCCIÓN Y LISTADO ---");
                System.out.println("1. Mostrar todo el contenido registrado");
                System.out.println("2. Reproducir todo el contenido");
                System.out.print("Seleccione una opción: ");
                int subOp = Integer.parseInt(leer.readLine());

                if (subOp == 1) {
                    imprimirmultimedia();
                } else if (subOp == 2) {
                    reproducirTodo();
                } else {
                    System.out.println("Opción no válida.");
                }

            } else if (op == 3) {
                System.out.println("\n--- CONSULTAS DE MÉTODOS ---");
                System.out.println("1. Ver TIPO de contenido");
                System.out.println("2. Ver duración del contenido");
                System.out.println("3. Ver número de episodios");
                System.out.println("4. Ver datos generales");
                System.out.println("5. Ver datos particulares");
                System.out.print("Seleccione una opción: ");
                int subOp = Integer.parseInt(leer.readLine());

                if (subOp == 1) {
                    mostrarTipos();
                } else if (subOp == 2) {
                    mostrarTiemposTotales();
                } else if (subOp == 3) {
                    mostrarEpisodios();
                } else if (subOp == 4) {
                    mostrarDatosGenerales();
                } else if (subOp == 5) {
                    mostrarDatosParticulares();
                } else {
                    System.out.println("Opción no válida.");
                }

            } else if (op == 4) {
                System.out.println("¡Adiós!");
            } else {
                System.out.println("Número no valido.");
            }
        }
    }
}