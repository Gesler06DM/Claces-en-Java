package Claces;

public class Cuenta {

    // Se usa protected para que la clase hija pueda acceder al saldo
    protected double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Deposito realizado: Q" + monto);
    }

    public void retirar(double monto) {
        saldo -= monto;
        System.out.println("Retiro realizado: Q" + monto);
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: Q" + saldo);
    }
}
