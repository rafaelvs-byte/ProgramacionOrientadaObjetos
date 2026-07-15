package org.example.modelo;

import java.util.Locale;

public class Alumno extends PersonaUT implements Ensenable, Evaluable {
    private int numExpediente;
    private int edad;
    private String carrera;
    private int cuatrimestre;
    private boolean registroCorrecto=false;

    private static final String[] CARRERAS_VALIDAS = {"TI","QUI","MEC","MKT"};
    public Alumno(){super();}

    public Alumno(int numExpediente, String nombre, int edad, String carrera, int cuatrimestre, String curp) {
        super(nombre,curp);
        setNumExpediente(numExpediente);
        setEdad(edad);
        setCarrera(carrera);
        setCuatrimestre(cuatrimestre);
    }

    public int getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(int numExpediente) {
        this.numExpediente = numExpediente;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>15 && edad< 110){
            this.edad=edad;
        }
        else {
            System.out.println("La edad debe de ser de 15 a 110");
        }
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        if(validarCarreras(carrera)){
            this.carrera=carrera;
        }
        else{
            System.out.println("Carrera no valida");
        }
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        if(cuatrimestre>0 && cuatrimestre<12){
            this.cuatrimestre=cuatrimestre;
        }
        else{
            System.out.println("El cuatrimestre debe ser entre 1 y 12");
        }
    }

    @Override
    public String mostrarTipoPersona() {return "-------Alumno---------";}

    @Override
    public String aprender() {
        return (getNombre() + " está estudiando y aprendiendo.");
    }

    @Override
    public String recibirEvaluacion() {
        return (getNombre() + " está recibiendo un examen para ser evaluado.");
    }


    @Override
    public String toString() {
        return  mostrarTipoPersona() + "\n" +
                "numExpediente=" + numExpediente + '\n' +
                "edad="         + edad +'\n' +
                "carrera="      + carrera + '\n' +
                "cuatrimestre=" + cuatrimestre +'\n'+
                "curp="         + getCurp() + '\n' +
                "--------------------------------------";
    }

    public boolean validarCarreras(String carrera){
        boolean carreraValida=false;
        for(String validar : CARRERAS_VALIDAS){
            if(carrera.equalsIgnoreCase(validar)){
                return true;
            }
        }

        return carreraValida;
    }

}
