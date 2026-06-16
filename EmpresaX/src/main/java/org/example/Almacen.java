package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Almacen {
    private String producto;
    private int cantidad;
    private double costo;
    private LocalDate fechaIngreso;
    private LocalDate fechaEgreso;
    private boolean status=true;
    private static final String[] productos = {"Papas", "Coca", "Atun", "HUevos"};

    public Almacen(){

    }
    public Almacen(String producto, int cantidad, double costo, LocalDate fechaIngreso, LocalDate fechaEgreso) {
        setProducto(producto);
        setCantidad(cantidad);
        setCosto(costo);
        setFechaIngreso(fechaIngreso);
        setFechaEgreso(fechaEgreso);

    }


    public String getProducto() {
        return this.producto.toLowerCase();
    }

    public void setProducto(String producto) {
        if(esProductoValido(producto)){
            this.producto = producto;
        }
        else{
            System.out.println("Producto no valido");
            status=false;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if(cantidad > 0) {
            this.cantidad = cantidad;
        }else{
            System.out.println("La cantidad no puede ser menor a 0");
            status=false;
        }
    }

    public double getCosto() {
        String costoFormato=String.format("%.2f", this.costo);
        return Double.parseDouble(costoFormato);
    }

    public void setCosto(double costo) {
        if(costo>0){
        this.costo = costo;
        }
        else{
            System.out.println("El costo no puede ser menor a 0");
            status=false;

        }
    }


    public String getFechaIngreso() {
        if(this.fechaIngreso!=null){
            DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String fechaFormato=this.fechaIngreso.format(formato);
            return fechaFormato;
        }
        else{
            return "Fecha no valida";
        }
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        if(fechaIngreso.isAfter(LocalDate.parse("2025-12-31"))) {
            this.fechaIngreso = fechaIngreso;
        }
        else{
            System.out.println("La fecha debe ser posterior a 2025-12-31");
            status=false;
        }
    }

    public String getFechaEgreso() {
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormato=this.fechaEgreso.format(formato);
        return fechaFormato;
    }

    public void setFechaEgreso(LocalDate fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "producto='" + producto + '\'' +
                ", cantidad=" + cantidad +
                ", costo=" + costo +
                ", fechaIngreso=" + fechaIngreso +
                ", fechaEgreso=" + fechaEgreso +
                '}';
    }

    private boolean esProductoValido(String producto) {
        for (String productoEvaluar : productos) {
            if (producto.equalsIgnoreCase(productoEvaluar)) {
                return true;
            }
        }
        return false;
    }
}

