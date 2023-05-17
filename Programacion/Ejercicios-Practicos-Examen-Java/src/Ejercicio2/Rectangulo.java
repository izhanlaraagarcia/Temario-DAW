package Ejercicio2;

public class Rectangulo {
    // Crea un clase Rectándulo con los atributos alto y ancho. Calcula su área y su
    // perímetro mostrándolos en consola tras crear una instancia.
    public double base;
    public double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return (base + altura) * 2;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo [base=" + base + ", altura=" + altura + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;

        } else {
            return false;
        }
    }
}