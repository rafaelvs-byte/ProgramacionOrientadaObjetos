package org.example;

public class Triangulo {
    private double altura;
    private double base;
    private int aumento;

    public Triangulo(){}

    public Triangulo(double altura, double base, int aumento){
        setAltura(altura);
        setBase(base);
        setAumento(aumento);
    }

    public void setAltura(double altura){
        if(altura >= 0 ) {
            this.altura = altura;
        } else {
            System.out.println("Número no válido");
        }
    }

    public void setBase(double base) {
        if (base >= 0) {
            this.base = base;
        } else {
            System.out.println("Número no válido");
        }
    }

    public void setAumento(int aumento){
        this.aumento = aumento;
    }

    public double getAltura(){
        String alturaFormato = String.format("%.3f", this.altura);
        return Double.parseDouble(alturaFormato);
    }

    public double getBase(){
        String baseFormato = String.format("%.3f", this.base);
        return Double.parseDouble(baseFormato);
    }

    public int getAumento(){
        return this.aumento;
    }

    public void aumentara(int n){
        this.altura += n;
        System.out.printf("La altura ha aumentado a: %.3f\n", this.altura);
    }

    public void disminuira(int n){
        if (this.altura - n >= 0) {
            this.altura -= n;
            System.out.printf("La altura ha disminuido a: %.3f\n", this.altura);
        } else {
            System.out.println("Error: La altura no puede ser menor a 0");
        }
    }

    public void aumentarb(int n){
        this.base += n;
        System.out.printf("La base ha aumentado a: %.3f\n", this.base);
    }

    public void disminuirb(int n){
        if (this.base - n >= 0) {
            this.base -= n;
            System.out.printf("La base ha disminuido a: %.3f\n", this.base);
        } else {
            System.out.println("Error: La base no puede ser menor a 0");
        }
    }

    public double calcularArea() {
        double area = (this.base * this.altura) / 2;
        String areaFormato = String.format("%.3f", area);
        return Double.parseDouble(areaFormato);
    }

    @Override
    public String toString() {
        return "------------------------------------\n" +
                "Base: " + getBase() + "\n" +
                "Altura: " + getAltura() + "\n" +
                "Área Total: " + calcularArea();
    }
}