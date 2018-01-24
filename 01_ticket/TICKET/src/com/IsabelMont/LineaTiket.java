package com.IsabelMont;

public class LineaTiket {

    private int cantidad;
    private String producto;
    private double precio;

    public LineaTiket(int cantidad, String producto, double precio) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public double resultado (){

        double totalLinea = cantidad * precio;

        return totalLinea;
    }
    private Ticket ticket;


}
