package Claces;

public class claseMain {

    public static void main(String[] args) {

        // EJERCICIO 1 
        System.out.println("---- Persona, Docente, Estudiante ----");

        Docente docente1 = new Docente("Carlos", 40, "Matemática");
        Estudiante estudiante1 = new Estudiante("Ana", 20, "2026001");

        docente1.mostrar();
        System.out.println();
        estudiante1.mostrar();


        // EJERCICIO 2 
        System.out.println("\n---- Cuenta y CuentaCorriente ----");

        CuentaCorriente cuenta1 = new CuentaCorriente(500, 200);

        cuenta1.mostrarSaldo();
        cuenta1.retirar(600); 
        cuenta1.mostrarSaldo();
        cuenta1.retirar(200); 
        cuenta1.mostrarSaldo();


        // EJERCICIO 3
        System.out.println("\n---- Producto y ProductoPerecedero ----");

        ProductoPreccedero producto1 = new ProductoPreccedero("Leche", 12.50, "25/04/2026");

        producto1.mostrar();
        producto1.estaVencido();


        // EJERCICIO 4 
        System.out.println("\n---- Transporte y Bus ----");
        Bus bus1 = new Bus(45, "Jutiapa - Guatemala");

        bus1.descripcion();
        
       // EJERCICIO 5 
        System.out.println("---- Empleado y Gerente ----");
        Empleado emp = new Empleado("Juan", 3000);
        Gerente ger = new Gerente("Carlos", 5000, 1500);
        emp.mostrar();

        System.out.println("Salario calculado: Q" + emp.calcularSalario());
        System.out.println();
        ger.mostrar();

        //  EJERCICIO 6 
        System.out.println("\n---- Animal y Perro ----");
        Animal animal = new Animal();
        Perro perro = new Perro();

        animal.hacerSonido();
        perro.hacerSonido();

        // EJERICIO 7
        System.out.println("Vehiculo y Moto");

            System.out.println("Vehiculo y Moto");

            Moto moto1 = new Moto("Yamaha", 120, 150);
            moto1.mostrarInfo();
        }
    }
    
