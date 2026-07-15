package org.example.modelo;

import java.util.Locale;

public abstract class PersonaUT {
    private String nombre;
    private String curp;

    public PersonaUT(){}

    public PersonaUT(String nombre, String curp){
        setNombre(nombre);
        setCurp(curp);
    }

    public String getNombre() {
        if (this.nombre == null) {
            return "";
        }
        return nombre.toUpperCase(Locale.ROOT);
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty() || nombre.isBlank()) {
            System.out.println("Error: el nombre es requerido");
        } else {
            this.nombre = nombre;
        }
    }

    public String getCurp() {
        if (this.curp == null) {
            return "";
        }
        return curp.toUpperCase();
    }

    public void setCurp(String curp) {
        if (curp == null || curp.isEmpty() || curp.isBlank()) {
            System.out.println("Error: la curp es requerida");
        } else {
            this.curp = curp;
        }
    }

    public abstract String mostrarTipoPersona();

    @Override
    public String toString(){
        return "Nombre: " + getNombre() + "\n" +
                "CURP: " + getCurp() + "\n";
    }

}