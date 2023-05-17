package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<CuentaCorriente> cuentas;

    public Banco() {
        cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaCorriente cuenta) {
        cuentas.add(cuenta);
    }

    public void eliminarCuenta(CuentaCorriente cuenta) {
        cuentas.remove(cuenta);
    }
}