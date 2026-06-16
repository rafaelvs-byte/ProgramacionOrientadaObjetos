package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int opc = 0;
        Auto nuevoAuto = null;

        while (opc != 5) {
            System.out.println("--- Menú agencia de autos ---");
            System.out.println("1. Agregar nuevo auto");
            System.out.println("2. Aumentar porcentaje al precio");
            System.out.println("3. Disminuir porcentaje al precio");
            System.out.println("4. Mostrar datos");
            System.out.println("5. Salír");
            System.out.print("Elige una opción: ");

            opc = Integer.parseInt(leer.readLine());

            if (opc == 1) {
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

                nuevoAuto = new Auto(color, marca, numeroPuertas, motor,precio, LocalDate.parse(fecha));
                System.out.println("\n--- Auto guardado ---");
            } else if (opc == 2) {
                if(nuevoAuto == null){
                    System.out.println("Primero necesitas crear un auto");
                }else{
                    System.out.println("\nIngresa el procentaje a aumentar: ");
                    double porcentaje = Double.parseDouble(leer.readLine());
                    nuevoAuto.modificarPrecio(porcentaje);
                }
            } else if (opc == 3) {
                if(nuevoAuto == null){
                    System.out.println("Primero necesitas crear un auto");
                }else{
                    System.out.println("\nIngresa el procentaje a disminuir: ");
                    double porcentaje = Double.parseDouble(leer.readLine());
                    nuevoAuto.modificarPrecio(-porcentaje);
                }
            } else if(opc == 4){
                if(nuevoAuto == null){
                    System.out.println("No hay autos registrados");
                }else{
                    System.out.println("\n--------Datos del auto----------");
                    System.out.println(nuevoAuto);
                }
            } else if(opc ==5){
            }else{
                System.out.println("Teclea una opción valida");
            }
        }
    }
}
