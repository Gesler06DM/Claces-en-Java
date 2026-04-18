package Claces;
public class Gerente extends Empleado {

    // Herencia aplicada:
    // Gerente hereda de Empleado
    // Reutiliza nombre, salario y el método mostrar()

    private double bonoAdicional;

    public Gerente(String nombre, double salario, double bonoAdicional) {
        super(nombre, salario); // llama al constructor del padre
        this.bonoAdicional = bonoAdicional;
    }

    @Override
    public double calcularSalario() {
        // Método sobrescrito:
        // Se sobrescribió calcularSalario() para sumar el bono adicional al salario base
        return salario + bonoAdicional;
    }

    @Override
    public void mostrar() {
        // También se sobrescribió mostrar() para enseñar toda la información completa
        super.mostrar();
        System.out.println("Bono adicional: Q" + bonoAdicional);
        System.out.println("Salario total: Q" + calcularSalario());
    }
}