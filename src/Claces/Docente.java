package Claces;


public class Docente extends Persona {

    // Herencia aplicada:
    // Docente hereda de Persona usando extends
    // Esto permite reutilizar nombre, edad y el método mostrar()

    private String especialidad;

    public Docente(String nombre, int edad, String especialidad) {
        super(nombre, edad); // uso de super para llamar al constructor de la clase padre
        this.especialidad = especialidad;
    }

    @Override
    public void mostrar() {
        // Método sobrescrito:
        // Se sobrescribió mostrar() para agregar el atributo especialidad
        super.mostrar(); // primero muestra los datos heredados de Persona
        System.out.println("Especialidad: " + especialidad);
    }
}