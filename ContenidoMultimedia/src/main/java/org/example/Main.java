package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
    static Contenido multimedia;
    static ArrayList<Contenido> multimedias=new ArrayList<Contenido>();
    static void nuevaPelicula(){
        multimedia = new Pelicula("Titanic","Drama",120,"Guillermo");
        multimedias.add(multimedia);
    }
    static void nuevaSerie(){
        multimedia = new Serie("Stranger Things","Acción",40,7);
        multimedias.add(multimedia);
    }
    static void nuevoPodcast(){
        multimedia = new Podcast("La cotorriza", "Comedia", 128,"Memo");
        multimedias.add(multimedia);
    }
    static void imprimirmultimedia() {
        for (Contenido m1 : multimedias) {
            System.out.println(m1);
        }
    }
    static void main() throws IOException {
        BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
        int op=0;
        while (op != 6) {
            System.out.println("1. Registrar Pelicula");
            System.out.println("2. Registrar Serie");
            System.out.println("3. Registrar Podcast");
            System.out.println("4. Mostrar todo el contenido registrado");
            System.out.println("5. Reproducir todo el contenido");
            System.out.println("6. Salir");
            op = Integer.parseInt(leer.readLine());
            switch (op){
                case 1:
                    System.out.println("Nueva pelicula");
                    nuevaPelicula();
                    break;
                case 2:
                    System.out.println("Nueva serie");
                    nuevaSerie();
                    break;
                case 3:
                    System.out.println("Nuevo podcast");
                    nuevoPodcast();
                    break;
                case 4:
                    System.out.println("Mostrar todo el contenido registrado");
                    imprimirmultimedia();
                    break;
                case 5:
                    System.out.println("Reproducir contenido multimedia");
                    for (Contenido m1 : multimedias){
                        m1.reproducir();
                    }
                    break;
                case 6:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Inserte número valido");
                    break;
            }
        }
    }
}

