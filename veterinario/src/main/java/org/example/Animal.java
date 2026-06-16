package org.example;

public class Animal {
    private String nombre;
    private String duenyo;
    private String raza;

    public Animal() {
    }

    public Animal(String nombre, String duenyo, String raza) {
        setDuenyo(duenyo);
        setNombre(nombre);
        setRaza(raza);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuenyo() {
        return duenyo;
    }

    public void setDuenyo(String duenyo) {
        this.duenyo = duenyo;
    }

    public String respirar(){
        return nombre+" Esta respirando";
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                "dueño='" + duenyo + '\'' +
                "Raza='"+raza+'\''+
                '}';
    }
}
