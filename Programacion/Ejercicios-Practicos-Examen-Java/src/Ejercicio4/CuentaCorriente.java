package Ejercicio4;

public class CuentaCorriente {
    public String nombreTitular;
    private String numeroCuenta;
    private double dinero;
    private double dineroAñadidos;
    public Propietario propietario;

    // Constructor de la clase
    public CuentaCorriente(String numeroCuenta, double dinero, Propietario propietario) {
        this.numeroCuenta = numeroCuenta;
        this.dinero = dinero;
        this.propietario = propietario;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getDinero() {
        return dinero;
    }

    public double getDineroAñadidos() {
        return dineroAñadidos;
    }

    // Metodo para sacar dinero del banco
    public void sacarDinero(int i) {
        if (dinero >= dineroAñadidos)
            dinero -= dineroAñadidos;
        else
            System.out.println("No hay suficiente dinero en la cuenta");
    }

    // Metodo para depositar dinero en el banco
    public void depositarDinero(int i) {
        dinero += dineroAñadidos;
    }

    public Propietario getPropietario() {
        return propietario;
    }
}
