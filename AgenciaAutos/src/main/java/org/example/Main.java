package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Main {
    static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    static String saludo;
    static void ejemplo(){
        System.out.println("Estas eb ejemplo");
    }
    static void main() throws IOException {
        // Creacion del objeto
        ejemplo();
        saludo="Hola";
        String marca,color,fecha;
        int numeroPuertas;
        double motor, precio;
        System.out.println("Marca: ");
        marca = leer.readLine();
        System.out.println("Color: ");
        color = leer.readLine();
        System.out.println("Fecha (yyyy-mm-dd): ");
        fecha = leer.readLine();
        System.out.println("Puertas: ");
        numeroPuertas = Integer.parseInt(leer.readLine());
        System.out.println("Motor");
        motor = Double.parseDouble(leer.readLine());
        System.out.println("Precio");
        precio= Double.parseDouble(leer.readLine());
        Auto auto;
        auto = new Auto();
        System.out.println("Color: ");
        auto.setColor(leer.readLine());
        System.out.println("Marca: ");
        auto.setMarca(leer.readLine());
        System.out.println("Puertas: ");
        auto.setNumeroPuertas(Integer.parseInt(leer.readLine()));
        System.out.println("Motor: ");
        auto.setMotor(Double.parseDouble(leer.readLine()));
        System.out.println("Precio: ");
        auto.setPrecio(Double.parseDouble(leer.readLine()));
        System.out.println("Fecha (YYYY,MM,DD");
        auto.setFechaIngreso((LocalDate.parse(leer.readLine())));

        System.out.println(auto);
        auto.acelerar();
        auto.frenar();

        System.out.println("*************************************");

        Auto auto2;
        auto2 = new Auto(color, marca, numeroPuertas, motor,precio, LocalDate.parse(fecha));
        System.out.println(auto2);
        auto2.acelerar();
        auto2.frenar();
    }
}