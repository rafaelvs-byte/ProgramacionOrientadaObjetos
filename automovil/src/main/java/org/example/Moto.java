package org.example;

public class Moto extends Vehiculo{
    private boolean casco=true;

    public Moto() {
    }

    public Moto(double motor, String marca, int asiento, int ruedas, boolean casco) {
        super(motor, marca, asiento, ruedas);
        setCasco(casco);
    }
    public String caballitos(){
        return "Puedes hacer caballitos";
    }
    public boolean getCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        if(casco=true) {
            System.out.println("Usted tiene caso");
        }else{
            System.out.println("Ponte caso");
        }
    }
    @Override
    public String toString() {
        return "Motor: " + getMotor() + "\n" +
                "Marca: " + getMarca() + "\n" +
                "Numero de asientos: " + getAsiento() + "\n" +
                "Numero de ruedas: " + getRuedas();
    }
}
