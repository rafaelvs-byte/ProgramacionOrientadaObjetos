package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
    static Animal mascota;
    static ArrayList<Animal> mascotas=new ArrayList<Animal>();
    static void nuevoPerro(){
        mascota = new Perro("Firulais", "Pepito", "Chihuahua", "moquillo");
        mascotas.add(mascota);
    }
    static void nuevoGato(){
        mascota = new Gato("El gato con botas", "John", "Naranja");
        mascotas.add(mascota);
    }
    static void imprimirMascotas(){
        for(Animal m1 : mascotas){
            System.out.println(m1);
        }
    }
    static void main() throws IOException {
        BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
        int op=0;
        while (op != 4) {
            System.out.println("1.Capturar un perro");
            System.out.println("2. Capturar un gato");
            System.out.println("3. imprimir");
            System.out.println("4. Salir");
            System.out.println("¿Qué opción elijes?");
            op = Integer.parseInt(leer.readLine());
            switch (op){
                case 1:
                    System.out.println("NUevo perro");
                    nuevoPerro();
                    break;
                case 2:
                    System.out.println("NUevo gato");
                    nuevoGato();
                    break;
                case 3:
                    System.out.println("Imprimir");
                    imprimirMascotas();
                    break;
                case 4:
                    System.out.println("Regresa pronto");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
    }
}

