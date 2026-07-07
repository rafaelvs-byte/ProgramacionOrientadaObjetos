package org.example.modelo;

public class Profesor {
    private int numEmpleado;
    private String nombre;
    private int edad;
    private String puesto;
    private String cedulaProfesional;

    public Profesor() {}

    public int getNumEmpleado() { return numEmpleado; }
    public void setNumEmpleado(int numEmpleado) { this.numEmpleado = numEmpleado; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }

    public String getCedulaProfesional() { return cedulaProfesional; }
    public void setCedulaProfesional(String cedulaProfesional) { this.cedulaProfesional = cedulaProfesional; }
}