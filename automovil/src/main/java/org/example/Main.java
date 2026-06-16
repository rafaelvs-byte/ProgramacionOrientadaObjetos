package org.example;


public class Main {
    static void main() {
        System.out.println("-------------Auto--------------");
        Auto auto= new Auto(5.00,"Audi",5,4,4);
        System.out.println(auto);
        System.out.println(auto.acelerar());
        System.out.println(auto.frenar());
        System.out.println(auto.abrirPuertas());
        System.out.println("--------------Moto--------------");
        Moto moto= new Moto(3.00,"Italika",2,2,true);
        System.out.println(moto);
        System.out.println(moto.acelerar());
        System.out.println(moto.frenar());
        System.out.println(moto.caballitos());
    }
}
