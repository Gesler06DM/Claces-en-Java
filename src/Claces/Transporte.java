package Claces;
public class Transporte {

    // Atributo protected para que la clase Bus pueda usarlo
    protected int capacidad;

    public Transporte(int capacidad) {
        this.capacidad = capacidad;
    }

    public void descripcion() {
        System.out.println("Capacidad: " + capacidad + " pasajeros");
    }
}