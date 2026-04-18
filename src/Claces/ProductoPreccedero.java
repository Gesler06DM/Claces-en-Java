package Claces;

public class ProductoPreccedero extends Producto {

	   // Herencia aplicada:
    // ProductoPerecedero hereda de Producto
    // Reutiliza nombre, precio y el método mostrar()

    private String fechaVencimiento;

    public ProductoPreccedero(String nombre, double precio, String fechaVencimiento) {
        super(nombre, precio); // llama al constructor de Producto
        this.fechaVencimiento = fechaVencimiento;
    }

    public void estaVencido() {
        // Caso de prueba usado:
        // Se muestra la fecha de vencimiento del producto para verificar el dato ingresado
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
        System.out.println("Revisar si el producto ya vencio segun la fecha actual.");
    }

    @Override
    public void mostrar() {
        // Método sobrescrito:
        // Se sobrescribió mostrar() para agregar la fecha de vencimiento
        super.mostrar();
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
    }
}