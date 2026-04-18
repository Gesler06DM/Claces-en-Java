package Claces;
public class CuentaCorriente extends Cuenta {

    // Herencia aplicada:
    // CuentaCorriente hereda de Cuenta
    // Reutiliza el atributo saldo y los métodos de la clase padre

    private double limiteSobregiro;

    public CuentaCorriente(double saldo, double limiteSobregiro) {
        super(saldo); // llama al constructor de Cuenta
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirar(double monto) {
        // Método sobrescrito:
        // Se sobrescribió retirar() para permitir sobregiro con un límite definido
        if (saldo - monto >= -limiteSobregiro) {
            super.retirar(monto); // usa el método del padre para hacer el retiro
        } else {
            System.out.println("No se puede retirar. Se excede el limite de sobregiro.");
        }
    }
}