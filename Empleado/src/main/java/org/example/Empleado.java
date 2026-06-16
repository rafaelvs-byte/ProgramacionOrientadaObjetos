package org.example;

public class Empleado {
    private String nombre;
    private double sueldo;
    private int numeroRetardos;
    private String areaAsignada;

    private static final String[] AREAS_VALIDAS = {"Sistemas", "Recursos Humanos", "Contabilidad", "Ventas", "Producción"};

    public Empleado() {}

    public Empleado(String nombre, double sueldo, int numeroRetardos, String areaAsignada) {
        setNombre(nombre);
        setSueldo(sueldo);
        setNumeroRetardos(numeroRetardos);
        setAreaAsignada(areaAsignada);
    }


    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío.");
            this.nombre = "Sin nombre";
        }
    }

    public void setSueldo(double sueldo) {
        if (sueldo >= 0) {
            this.sueldo = sueldo;
        } else {
            System.out.println("Error: El sueldo no puede ser negativo.");
            this.sueldo = 0.0;
        }
    }

    public void setNumeroRetardos(int numeroRetardos) {
        if (numeroRetardos >= 0) {
            this.numeroRetardos = numeroRetardos;
        } else {
            System.out.println("Error: El número de retardos no puede ser negativo.");
            this.numeroRetardos = 0;
        }
    }

    public void setAreaAsignada(String areaAsignada) {
        if (esAreaValida(areaAsignada)) {
            this.areaAsignada = areaAsignada;
        } else {
            System.out.println("Error: El área '" + areaAsignada + "' no es válida en esta empresa.");
            this.areaAsignada = "No asignada";
        }
    }


    public String getNombre() {
        return this.nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public int getNumeroRetardos() {
        return this.numeroRetardos;
    }

    public String getAreaAsignada() {
        return this.areaAsignada;
    }


    public void aumentarSueldo(double porcentaje) {
        if (porcentaje > 0) {
            double aumento = this.sueldo * (porcentaje / 100);
            this.sueldo += aumento;
            System.out.println("Sueldo de " + this.nombre + " aumentado en un " + porcentaje + "%.");
        }
        else {
            System.out.println("Error: El porcentaje de aumento debe ser mayor a 0.");
        }
    }

    public void disminuirSueldo(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            double descuento = this.sueldo * (porcentaje / 100);
            this.sueldo -= descuento;
            System.out.println("Sueldo de " + this.nombre + " disminuido en un " + porcentaje + "%.");
        }
        else {
            System.out.println("Error: Porcentaje de disminución no válido.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Área: " + this.areaAsignada);
        System.out.println("Retardos: " + this.numeroRetardos);
        System.out.printf("Sueldo Actual: $%.2f\n", this.sueldo);
    }

    private boolean esAreaValida(String area) {
        if (area == null) return false;
        for (String areaValida : AREAS_VALIDAS) {
            if (areaValida.equalsIgnoreCase(area)) {
                return true;
            }
        }
        return false;
    }
}
