package org.example;
public class Main {
    static void main(){
        Flor flor;
        flor = new Flor();
        flor.altura=0.2;
        flor.nombreFlor="Orquidea";
        flor.colorFlor="Morada";
        System.out.println(flor.altura);
        System.out.println(flor.nombreFlor);
        System.out.println(flor.colorFlor);
        Flor flor2;
        flor2 = new Flor(0.15,"Rosa","Rojo");{
            System.out.println(flor2.altura);
            System.out.println(flor2.nombreFlor);
            System.out.println(flor2.colorFlor);
        }
    }
}

