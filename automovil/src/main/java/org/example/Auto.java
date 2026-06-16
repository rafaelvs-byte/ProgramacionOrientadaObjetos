package org.example;

public class Auto extends Vehiculo{
    private int numeroPuertas;
    public Auto() {
    }

    public Auto(double motor, String marca, int asiento, int ruedas, int numeroPuertas) {
        super(motor, marca, asiento, ruedas);
        setNumeroPuertas(numeroPuertas);
    }

    public String abrirPuertas(){
        return "Las puertas de su auto pueden abrirse";
    }
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        if(numeroPuertas>0 && numeroPuertas<6)
            this.numeroPuertas= numeroPuertas;
        else{
            System.out.println("Error en el número de purtas");
        }
    }

    @Override
    public String toString() {
        return "Motor: " + getMotor() + "\n" +
                "Marca: " + getMarca() + "\n" +
                "Numero de asientos: " + getAsiento() + "\n" +
                "NUmero de ruedas: " + getRuedas() + "\n" +
                "Numero puertas: "+getNumeroPuertas();
    }
}
