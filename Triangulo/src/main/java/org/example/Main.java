package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== TRIÁNGULO 1 (Constructor Vacío) ===");
        Triangulo triangulo1 = new Triangulo();
        triangulo1.setAltura(5.00);
        triangulo1.setBase(4.00);
        triangulo1.setAumento(5);

        System.out.println("Datos iniciales T1:");
        System.out.println(triangulo1);

        System.out.println("Modificando T1:");
        triangulo1.aumentara(5);
        triangulo1.disminuira(2);
        triangulo1.aumentarb(3);
        triangulo1.disminuirb(1);

        System.out.println("Datos finales T1:");
        System.out.println(triangulo1);


        System.out.println("\n=== TRIÁNGULO 2 (Constructor Lleno) ===");
        Triangulo triangulo2 = new Triangulo(10.00, 8.00, 5);

        System.out.println("Datos iniciales T2:");
        System.out.println(triangulo2);

        System.out.println("Modificando T2:");
        triangulo2.aumentara(4);
        triangulo2.disminuira(3);
        triangulo2.aumentarb(6);
        triangulo2.disminuirb(2);

        System.out.println("Datos finales T2:");
        System.out.println(triangulo2);
    }
}