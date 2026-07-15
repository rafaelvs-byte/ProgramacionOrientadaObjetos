package org.example.vista;

import org.example.dao.AlumnoDAO;
import org.example.modelo.Alumno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MenuAlumno {
    static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    static AlumnoDAO alumnoDAO = new AlumnoDAO();

    public static void inscribir() throws IOException {
        Alumno nuevoAlumno = new Alumno();

        System.out.print("Numero expediente: ");
        nuevoAlumno.setNumExpediente(Integer.parseInt(leer.readLine()));
        System.out.print("Nombre: ");
        nuevoAlumno.setNombre(leer.readLine());
        System.out.print("Edad: ");
        nuevoAlumno.setEdad(Integer.parseInt(leer.readLine()));
        System.out.print("Carrera : (TI,QUI,MEC,MKT): ");
        nuevoAlumno.setCarrera(leer.readLine());
        System.out.print("Cuatrimestre: ");
        nuevoAlumno.setCuatrimestre(Integer.parseInt(leer.readLine()));
        System.out.println("Curp Alumno: ");
        nuevoAlumno.setCurp(leer.readLine());

        alumnoDAO.nuevoAlumno(nuevoAlumno);
        System.out.println("Alumno inscrito con éxito.");
    }

    public static void mostrar() {
        ArrayList<Alumno> alumnos = alumnoDAO.extraerAlumnos();
        System.out.println("--------Lista de alumnos inscritos--------");
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            for (Alumno al : alumnos) {
                System.out.println(al);
            }
        }
    }

    public static void modificar() throws IOException {
        System.out.println("--- Modificar Alumno ---");
        Alumno alumnoModificar = new Alumno();

        System.out.print("Número de expediente del alumno a modificar: ");
        alumnoModificar.setNumExpediente(Integer.parseInt(leer.readLine()));
        System.out.print("Nuevo Nombre: ");
        alumnoModificar.setNombre(leer.readLine());
        System.out.print("Nueva Edad: ");
        alumnoModificar.setEdad(Integer.parseInt(leer.readLine()));
        System.out.print("Nueva Carrera (TI,QUI,MEC,MKT): ");
        alumnoModificar.setCarrera(leer.readLine());
        System.out.print("Nuevo Cuatrimestre: ");
        alumnoModificar.setCuatrimestre(Integer.parseInt(leer.readLine()));
        System.out.print("Nuevo CURP: ");
        alumnoModificar.setCurp(leer.readLine());

        alumnoDAO.actualizarAlumno(alumnoModificar);
        System.out.println("Alumno modificado con éxito.");
    }

    public static void borrar() throws IOException {
        System.out.println("--------Borrar alumno--------");
        Alumno alumnoBorrar = new Alumno();
        System.out.print("Número de expediente del alumno a modificar: ");
        alumnoBorrar.setNumExpediente(Integer.parseInt(leer.readLine()));
        alumnoDAO.borrarAlumno(alumnoBorrar);
    }

    public static void buscar() throws IOException {
        System.out.println("--------Buscar alumno--------");
        Alumno alumnoBuscar = new Alumno();
        System.out.print("Número de expediente del alumno a buscar: ");
        alumnoBuscar.setNumExpediente(Integer.parseInt(leer.readLine()));
        boolean encontrado = alumnoDAO.buscarAlumno(alumnoBuscar);
        if (encontrado) {
            System.out.println("\n[¡Alumno encontrado!]");
            System.out.println(alumnoBuscar);
            System.out.println(alumnoBuscar.aprender());
            System.out.println(alumnoBuscar.recibirEvaluacion());
        } else {
            System.out.println("No se encontró ningún alumno con ese número de expediente.");
        }
    }

    public static void ejecutarMenuAlumno(){
        int salir = 0;
        while (salir != 6) {
            System.out.println("\n--- MENÚ Alumno ---");
            System.out.println("1. Inscribir nuevo alumno");
            System.out.println("2. Mostrar todos los alumnos");
            System.out.println("3. Modificar un alumno");
            System.out.println("4. Borrar un alumno");
            System.out.println("5. Buscar un alumno");
            System.out.println("6. Salir");
            try {
                salir = Integer.parseInt(leer.readLine());
                switch (salir) {
                    case 1:
                        inscribir();
                        break;
                    case 2:
                        mostrar();
                        break;
                    case 3:
                        modificar();
                        break;
                    case 4:
                        borrar();
                        break;
                    case 5:
                        buscar();
                        break;
                    case 6:
                        System.out.println("Adiós");
                        break;
                    default:
                        System.out.println("Teclea una opción válida");
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