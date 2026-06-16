package org.example;

public class Persona {
    double estatura;
    String nombre;
    String colorCamisa;
    String colorPantalon;
    String colorZapatos;
    int edad;
    public Persona(){}
    public Persona(String nombre, String colorCamisa, String colorPantalon, String colorZapatos,double estatura, int edad){
        this.nombre=nombre;
        this.colorCamisa=colorCamisa;
        this.colorPantalon=colorPantalon;
        this.colorZapatos=colorZapatos;
        this.edad=edad;
    }
}
