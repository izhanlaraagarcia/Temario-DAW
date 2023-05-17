package Ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Creamos tres propietarios
        Propietario propietario1 = new Propietario("Juan", "Pérez", "Calle 123", "Ciudad", 10, "Test");

        // Creamos 3 cuentas
        CuentaCorriente cuenta1 = new CuentaCorriente("23020439", 30.094, propietario1);

        // Agregaremos una cuenta nueva con el metodo agregarCuenta
        banco.agregarCuenta(cuenta1);

        // Borrar cuentas

        // Mostrar las cuentas que tiene el banco
        System.out.println("Cuentas del banco:");
        for (CuentaCorriente cuenta : banco.cuentas) {
            System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
            System.out.println(
                    "Titular: " + cuenta.getPropietario().getNombre() + " " + cuenta.getPropietario().getApellidos());
            System.out.println("Saldo: " + cuenta.getDinero());
        }

        // Sacar dinero de las cuentas

        cuenta1.sacarDinero(1000);

        // Depositar dinero en las cuentas

        cuenta1.depositarDinero(1000);

    }
}
