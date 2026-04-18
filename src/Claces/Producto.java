package Claces;

public class Producto {

    // Atributos protected para que la clase hija los pueda usar por herencia
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: Q" + precio);
    }
}
