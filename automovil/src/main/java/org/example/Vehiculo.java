package org.example;

public class Vehiculo {
    private double motor;
    private String marca;
    private int asiento;
    private int ruedas;

    public Vehiculo() {
    }

    public Vehiculo(double motor, String marca, int asiento, int ruedas) {
        setAsiento(asiento);
        setMarca(marca);
        setMotor(motor);
        setRuedas(ruedas);
    }

    public String frenar() {
        return "El vehiculo frena";
    }
    public String acelerar(){
        return "El vehiculo acelera";

    }

    public double getMotor() {
        return this.motor;
    }

    public void setMotor(double motor) {
        if (motor>2 && motor<9)
            this.motor= motor;
        else{
            System.out.println("Error en el número de motor");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        if (asiento>0 && asiento<10)
            this.asiento= asiento;
        else{
            System.out.println("Error en el número de asientos");
        }
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        if (ruedas>1 && ruedas<5)
            this.ruedas= ruedas;
        else{
            System.out.println("Error en el número de ruedas");
        }
    }

    @Override
    public String toString() {
        return "Motor: " + getMotor() + "\n" +
                "Marca: " + getMarca() + "\n" +
                "Asientos: " + getAsiento() + "\n" +
                "Ruedas: " + getRuedas();
    }
}
