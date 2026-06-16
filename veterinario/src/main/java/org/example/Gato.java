package org.example;

public class Gato extends Animal{
    public Gato() {
    }

    public Gato(String nombre, String duenyo, String raza) {
        super(nombre, duenyo, raza);
    }
    public String maullar(){
        return "Miau, Miau";
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+"\n" +
                "Dueño: "+getDuenyo()+"\n" +
                "Raza: "+getRaza()+"\n";

    }
}
