package Claces;

public class Bus extends Transporte {

    // Herencia aplicada:
    // Bus hereda de Transporte
    // Reutiliza el atributo capacidad y el método descripcion()

    private String ruta;

    public Bus(int capacidad, String ruta) {
        super(capacidad); // llama al constructor de Transporte
        this.ruta = ruta;
    }

    @Override
    public void descripcion() {
        // Método sobrescrito:
        // Se sobrescribió descripcion() para agregar la ruta del bus
        super.descripcion();
        System.out.println("Ruta: " + ruta);
    }
}