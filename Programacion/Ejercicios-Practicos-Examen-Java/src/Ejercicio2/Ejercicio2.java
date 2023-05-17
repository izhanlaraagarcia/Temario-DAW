package Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Calcularemos el area y el perimetro del rectangulo
        Rectangulo rectangulo1 = new Rectangulo(30, 10);
        Rectangulo rectangulo2 = new Rectangulo(30, 20);
        Rectangulo rectangulo3 = new Rectangulo(4.5, 6);

        // Ahora calcularemos y mostraremos por pantalla el resultada de calcular el
        // area y el perimetro de los 3 rectangulos

        // Rectangulo 1
        System.out.println("El area del rectangulo 1 es: " + rectangulo1.calcularArea());
        System.out.println("El perimetro del rectangulo 1 es: " + rectangulo1.calcularPerimetro());
        System.out.println("-------------------------------");

        // Rectangulo 2
        System.out.println("El area del rectangulo 2 es: " + rectangulo2.calcularArea());
        System.out.println("El perimetro del rectangulo 2 es: " + rectangulo2.calcularPerimetro());
        System.out.println("-------------------------------");

        // Rectangulo 3
        System.out.println("El area del rectangulo 3 es: " + rectangulo3.calcularArea());
        System.out.println("El perimetro del rectangulo 3 es: " + rectangulo3.calcularPerimetro());
        System.out.println("-------------------------------");
    }
}
