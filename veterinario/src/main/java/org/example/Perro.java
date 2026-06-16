package org.example;

public class Perro extends Animal{
    private String enfermedad;

    public Perro() {
    }

    public Perro(String nombre, String duenyo, String raza, String enfermedad) {
        super(nombre, duenyo, raza);
        setEnfermedad(enfermedad);

    }

    @Override
    public String toString() {
        return super.toString()+
                "Enfermedad: "+getEnfermedad();

    }

    public String ladrar(){
        return "guau guau";
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }
}
