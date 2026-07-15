package org.example.modelo;

import java.util.Locale;

public class Profesor extends PersonaUT implements Ensenador, Evaluador{
    private int numEmpleado;
    private int edad;
    private String puesto;
    private String cedulaProfesional;

    private static final String[] PUESTOS_VALIDOS = {"GERENTE", "DOCENTE", "DIRECTOR"};

    public Profesor() {super();}

    public Profesor(int numEmpleado, String nombre, int edad, String puesto, String cedulaProfesional,String curp ) {
        super(nombre,curp);
        setNumEmpleado(numEmpleado);
        setEdad(edad);
        setPuesto(puesto);
        setCedulaProfesional(cedulaProfesional);
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 18 && edad < 110) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe de ser de 18 a 110");
        }
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        if (validarPuestos(puesto)) {
            this.puesto = puesto.toUpperCase(Locale.ROOT);
        } else {
            System.out.println("Puesto no valido");
        }
    }

    public String getCedulaProfesional() {
        return cedulaProfesional;
    }

    public void setCedulaProfesional(String cedulaProfesional) {
        if (cedulaProfesional.isBlank() || cedulaProfesional.isEmpty()) {
            System.out.println("Error la cédula profesional es requerida ");
        } else {
            this.cedulaProfesional = cedulaProfesional;
        }
    }

    @Override
    public String mostrarTipoPersona() {return "-------Profesor---------";}

    @Override
    public String ensenar() {
        return (getNombre() + " está enseañando a los alumnos.");
    }

    @Override
    public String evaluar() {
        return (getNombre() + " está preparando su evaluacion a los estudiantes");}

    @Override
    public String toString() {
        return mostrarTipoPersona() + "\n" +
                "numEmpleado="       + numEmpleado + '\n' +
                "edad="              + edad + '\n' +
                "puesto="            + puesto + '\n' +
                "cedulaProfesional=" + cedulaProfesional + '\n' +
                "curp="         + getCurp() + '\n' +
                "--------------------------------------";
    }

    public boolean validarPuestos(String puesto) {
        boolean puestoValido = false;
        for (String validar : PUESTOS_VALIDOS) {
            if (puesto.equalsIgnoreCase(validar)) {
                return true;
            }
        }
        return puestoValido;
    }
}