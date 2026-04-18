package Claces;
public class Empleado {

    // Atributos protected para que Gerente pueda reutilizarlos
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double calcularSalario() {
        return salario;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario base: Q" + salario);
    }
}
