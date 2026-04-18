package Claces;

public class Moto extends Vehiculo {

    protected int cilindrada;

    public Moto(String marca, int velocidad, int cilindrada) {
        super(marca, velocidad);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}