package org.example.vista;

import org.example.dao.AlumnoDAO;
import org.example.dao.ProfesorDAO;
import org.example.modelo.Alumno;
import org.example.modelo.Profesor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MenuProfe {
    static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    static ProfesorDAO profesorDAO = new ProfesorDAO();

    public static void registrarProfesor() throws IOException {
        Profesor nuevoProfesor = new Profesor();

        System.out.print("Número empleado: ");
        nuevoProfesor.setNumEmpleado(Integer.parseInt(leer.readLine()));
        System.out.print("Nombre: ");
        nuevoProfesor.setNombre(leer.readLine());
        System.out.print("Edad: ");
        nuevoProfesor.setEdad(Integer.parseInt(leer.readLine()));
        System.out.print("Puesto (gerente, docente, director): ");
        nuevoProfesor.setPuesto(leer.readLine());
        System.out.print("Cédula Profesional: ");
        nuevoProfesor.setCedulaProfesional(leer.readLine());
        System.out.println("Curp Docente: ");
        nuevoProfesor.setCurp(leer.readLine());

        profesorDAO.nuevoProfesor(nuevoProfesor);
    }

    public static void mostrarProfesores() {
        ArrayList<Profesor> profesores = profesorDAO.extraerProfesor();
        System.out.println("--------Lista de profesores registrados--------");
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
        } else {
            for (Profesor pr : profesores) {
                System.out.println(pr);
            }
        }
    }

    public static void modificarProfesor() throws IOException {
        System.out.println("--- Modificar Profesor ---");
        Profesor profesorModificar = new Profesor();

        System.out.print("Número de empleado del profesor a modificar: ");
        profesorModificar.setNumEmpleado(Integer.parseInt(leer.readLine()));
        System.out.print("Nuevo Nombre: ");
        profesorModificar.setNombre(leer.readLine());
        System.out.print("Nueva Edad: ");
        profesorModificar.setEdad(Integer.parseInt(leer.readLine()));
        System.out.print("Nuevo Puesto (gerente, docente, director): ");
        profesorModificar.setPuesto(leer.readLine());
        System.out.print("Nueva Cédula Profesional: ");
        profesorModificar.setCedulaProfesional(leer.readLine());
        System.out.print("Nuevo CURP: ");
        profesorModificar.setCurp(leer.readLine());

        profesorDAO.updatePro(profesorModificar);
    }

    public static void borrarProfesor() throws IOException {
        System.out.println("--------Borrar profesor--------");
        Profesor profesorBorrar = new Profesor();
        System.out.print("Número de empleado del profesor a eliminar: ");
        profesorBorrar.setNumEmpleado(Integer.parseInt(leer.readLine()));
        profesorDAO.deletePro(profesorBorrar);
    }

    public static void buscarProfesor() throws IOException {
        System.out.println("--------Buscar profesor--------");
        Profesor profesorBuscar = new Profesor();
        System.out.print("Número de empleado del profesor a buscar: ");
        profesorBuscar.setNumEmpleado(Integer.parseInt(leer.readLine()));

        ArrayList<Profesor> resultado = profesorDAO.buscarPro(profesorBuscar);
        if (!resultado.isEmpty()) {
            System.out.println("\n[¡Profesor encontrado!]");
            System.out.println(profesorBuscar.ensenar());
            System.out.println(profesorBuscar.evaluar());
            for (Profesor pr : resultado) {
                System.out.println(pr);
            }
        } else {
            System.out.println("No se encontró ningún profesor con ese número de empleado.");
        }
    }

    public static void ejecutarMenuProfe() {
        int salir = 0;
        while (salir != 6) {
            System.out.println("\n--- MENÚ PROFESOR ---");
            System.out.println("1. Registrar nuevo profesor");
            System.out.println("2. Mostrar todos los profesores");
            System.out.println("3. Modificar un profesor");
            System.out.println("4. Borrar un profesor");
            System.out.println("5. Buscar un profesor");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");

            try {
                salir = Integer.parseInt(leer.readLine());
                switch (salir) {
                    case 1:
                        registrarProfesor();
                        break;
                    case 2:
                        mostrarProfesores();
                        break;
                    case 3:
                        modificarProfesor();
                        break;
                    case 4:
                        borrarProfesor();
                        break;
                    case 5:
                        buscarProfesor();
                        break;
                    case 6:
                        System.out.println("Adios");
                        break;
                    default:
                        System.out.println("Teclea una opcion valida");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número válido.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}