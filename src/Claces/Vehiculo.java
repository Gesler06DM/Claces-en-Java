package Claces;

public class Vehiculo {

    protected String marca;
    protected int velocidad;

    public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    // ✔ corregido el nombre del método
    public void mostrarInfo() {
        System.out.println("Marca del Vehiculo " + marca);
        System.out.println("Velocidad Vehiculo " + velocidad);
    }
}
