package org.example;
public class Main {
    static void main(){
        Persona persona;
        persona = new Persona();
        persona.edad=18;
        persona.nombre="Armando";
        persona.colorZapatos="Rojos";
        persona.colorPantalon="Mezclilla";
        persona.colorCamisa="Amarilla";
        persona.estatura=1.70;
        System.out.println(persona.edad);
        System.out.println(persona.nombre);
        System.out.println(persona.colorZapatos);
        System.out.println(persona.colorPantalon);
        System.out.println(persona.colorCamisa);
        System.out.println(persona.estatura);
        Persona persona2;
        persona2= new Persona("Omar", "Verde", "blanco", "Azul", 1.65, 19);{
            System.out.println(persona2.nombre);
            System.out.println(persona2.colorCamisa);
            System.out.println(persona2.colorPantalon);
            System.out.println(persona2.colorZapatos);
            System.out.println(persona2.estatura);
            System.out.println(persona2.edad);
        }
    }
}
