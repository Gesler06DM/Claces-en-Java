package Claces;

public class Estudiante extends Persona {

    // Herencia aplicada:
    // Estudiante también hereda de Persona
    // Se reutilizan los atributos nombre y edad

    private String carnet;

    public Estudiante(String nombre, int edad, String carnet) {
        super(nombre, edad); // llama al constructor de Persona
        this.carnet = carnet;
    }

    @Override
    public void mostrar() {
        // Método sobrescrito:
        // Se sobrescribió mostrar() para agregar el carnet del estudiante
        super.mostrar();
        System.out.println("Carnet: " + carnet);
    }
}