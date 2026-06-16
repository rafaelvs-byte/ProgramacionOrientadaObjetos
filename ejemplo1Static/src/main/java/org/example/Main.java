package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        /*
        Alumno a1 = new Alumno();
        a1.nombre = "Mickey Mouse";
        System.out.println(a1.nombre);
        System.out.println(Alumno.escuela);

        Alumno a2 = new Alumno();
        a2.nombre = "Pato Donald";
        System.out.println(a2.nombre);
        System.out.println(Alumno.escuela);
        System.out.println("-----------------------------");
        Alumno.escuela="UAQ";
        System.out.println(a1.nombre);
        System.out.println(a2.nombre);
        System.out.println(Alumno.escuela);
        */

        Profesor prof1 = new Profesor();
        prof1.nombre="Dora";
        Profesor.contador += 1;
        Profesor prof2 = new Profesor();
        prof2.nombre="Rene";
        Profesor.contador++;
        System.out.println(prof1.nombre);
        System.out.println(prof2.nombre);
        System.out.println(Profesor.contador);
    }
}
