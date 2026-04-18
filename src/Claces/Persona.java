package Claces;

public class Persona {
	//Atributos protrcted para que las claces hijas puedan usarlos por erencia
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}