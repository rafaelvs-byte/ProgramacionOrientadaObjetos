package org.example.vista;

import org.example.dao.AlumnoDAO;
import org.example.dao.ProfesorDAO;
import org.example.modelo.PersonaUT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Menugeneral {
    private static final BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

    private static void mostrarComunidadUniversitaria() {
        ArrayList<PersonaUT> comunidadUniversitaria = new ArrayList<>();

        comunidadUniversitaria.addAll(AlumnoDAO.extraerAlumnos());
        comunidadUniversitaria.addAll(ProfesorDAO.extraerProfesor());

        for (PersonaUT personaUT : comunidadUniversitaria) {
            System.out.println(personaUT);
        }
    }

    public static void menu() {
        int salir = 0;
        while (salir != 4) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Menú alumno");
            System.out.println("2. Menú profesores");
            System.out.println("3. Mostrar Comunidad Universitaria");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            try {
                salir = Integer.parseInt(leer.readLine());
                switch (salir) {
                    case 1:
                        MenuAlumno.ejecutarMenuAlumno();
                        break;
                    case 2:
                        MenuProfe.ejecutarMenuProfe();
                        break;
                    case 3:
                        mostrarComunidadUniversitaria();
                        break;
                    case 4:
                        System.out.println("Adios");
                        break;
                    default:
                        System.out.println("Teclea una opcion valida");
                        break;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();            }
                catch (IOException e) {
                System.out.println("Error de lectura: " + e.getMessage());
            }
        }
    }
}