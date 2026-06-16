package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== REGISTRO DE EMPLEADOS ===");

        Empleado empleado1 = new Empleado("Ana Gómez", 25000.0, 1, "Sistemas");
        empleado1.mostrarInformacion();

        empleado1.aumentarSueldo(12.5);
        empleado1.mostrarInformacion();

        Empleado empleado2 = new Empleado("Carlos Pérez", 18000.0, 4, "Marketing");

        empleado2.setAreaAsignada("Ventas");
        empleado2.mostrarInformacion();

        empleado2.disminuirSueldo(5.0);
        empleado2.mostrarInformacion();
    }
}