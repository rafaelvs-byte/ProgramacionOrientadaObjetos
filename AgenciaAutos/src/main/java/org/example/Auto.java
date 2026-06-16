package org.example;

// Reglas para nombrar una clase
// 1.- Una clase debe comenzar con mayúscula
// 2.- Debe ser un sustantivo o un concepto
// 3.- Debe estar en singular
// 4.- Mi clase obligatoriamente debe tener el mismo nombre de mi archivo
// 5.- Formato para nombrar una clase se llama pascal case


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Auto {

    // Reglas para nombrar variables y funciones
    // 1.- Comienza con minúsculas
    // 2.- El forrmato se llama camel lower case
    // 3.- Prohibido usar guión bajo
    // 4.- Primer caracter debe ser una letra
    // 5.- Solo caracteres alfanúmericos
    String color;
    String marca;
    int numeroPuertas;
    double motor;
    private double precio;
    private LocalDate fechaIngreso;


    private static final String[] COLORES_VALIDOS = {"negro","azul","rojo","verde","plateado","amrillo","violeta","café"};
    private static final String[] MARCAS_VALIDAS = {"Audi","Tesla","Ford","Toyota", "Mercedes"};
    // Creación de constructores
    public Auto() {}

    public Auto(String color, String marca, int numeroPuertas, double motor, double precio,LocalDate fechaIngreso){

        setColor(color);
        setMarca(marca);
        setMotor(motor);
        setNumeroPuertas(numeroPuertas);
        setPrecio(precio);
        setFechaIngreso(fechaIngreso);

    }
    //creacion de setters propositos de los setters
    //1.Insertar los datos a los atributos
    //2.Validar los daros entrantes

    public void setColor(String color){
        if(esColorValido(color)) {
            this.color = color;
        }
        else {
            System.out.println("Color no válido");
        }
    }

    public void setMarca(String marca) {
        if (esMarcasValidas(marca)){
            this.marca = marca;
        }
        else{
            System.out.println("Marca no valida");
        }
    }
    public void setNumeroPuertas(int numeroPuertas){
        if(numeroPuertas>0 && numeroPuertas<6)
            this.numeroPuertas= numeroPuertas;
        else{
            System.out.println("Error en el número de purtas");
        }
    }

    public void setMotor(double motor){
        if (motor>1 && motor<9)
            this.motor= motor;
        else{
            System.out.println("Error en el número de motor");

        }
    }

    public void setPrecio(double precio){
        if(precio > 50000){
            this.precio=precio;
        }
        else{
            System.out.println("Precio no valido");
        }
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {

        if (fechaIngreso.isAfter(LocalDate.parse("2020-01-01"))) {
            this.fechaIngreso = fechaIngreso;
        } else {
            System.out.println("La fecha debe ser posterior al 2020-01-01");
        }
    }
    // Creación de getters, para extracción de datos
    //Propositos delos getters
    //1.Extraer el dato del atributo
    //2.Dar el formato de salida

    public String getColor(){
        if(this.color!=null){
            String colorFormato=this.color.toLowerCase();
            return colorFormato;
        }
        return "Color no asignado";
    }

    public String getMarca(){
        if(this.marca != null){
            String marcaCoche=this.marca.toLowerCase();
            return marcaCoche;
        }
        return "Marca no asignada";
    }

    public int getNumeroPuertas(){
        return this.numeroPuertas;
    }

    public double getMotor(){
        return this.motor;
    }
    public double getPrecio(){
        String precioFormato=String.format("%.2f",this.precio);
        return Double.parseDouble(precioFormato);
    }

    public String getFechaIngreso(){
        if(this.fechaIngreso!=null) {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String fechaFormato = this.fechaIngreso.format(formato);
            return fechaFormato;
        }
        return "Fecha no asignada";
    }

    @Override
    public String toString() {
        return "Marca: "+getMarca()+"\n" +
                "Color: "+getColor()+"\n" +
                "Numero puertas: "+getNumeroPuertas()+"\n" +
                "MOtor: "+getMotor()+"\n" +
                "Precio"+getPrecio()+"\n" +
                "Fecha ingreso: "+getFechaIngreso();
    }

    // 5.- Elegir nombre que sea verbo

    public void acelerar(){
        System.out.println("El auto está acelerando");
    }
    public void frenar(){
        System.out.println("El auto está frenando");
    }

    private boolean esColorValido(String color){
        for(String colorValido : COLORES_VALIDOS){
            if(colorValido.equalsIgnoreCase(color)){
                return true;
            }
        }
        return false;
    }
    private boolean esMarcasValidas(String marca){
        for(String marcavalida : MARCAS_VALIDAS){
            if(marcavalida.equalsIgnoreCase(marca)){
                return true;
            }
        }
        return false;
    }

}

