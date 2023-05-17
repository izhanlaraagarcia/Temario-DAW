package Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {

        // creamos las 3 instancias de personas
        Persona Persona1 = new Persona("Pepe", "Lopez", 22);
        Persona Persona2 = new Persona("Juan", "Dominguez", 20);
        Persona Persona3 = new Persona("Toni", "Lara", 30);

        // Mostraremos por consola la persona
        // Persona 1
        System.out.println("Persona 1: ");
        System.out.println("Nombre: " + Persona1.getNombre());
        System.out.println("Apellidos: " + Persona1.getApellidos());
        System.out.println("Edad: " + Persona1.getEdad());
        System.out.println("------------------------------------------------");

        // Persona 2
        System.out.println("Persona 2: ");
        System.out.println("Nombre: " + Persona2.getNombre());
        System.out.println("Apellidos: " + Persona2.getApellidos());
        System.out.println("Edad: " + Persona2.getEdad());
        System.out.println("------------------------------------------------");

        // Persona 3
        System.out.println("Persona 3: ");
        System.out.println("Nombre: " + Persona3.getNombre());
        System.out.println("Apellidos: " + Persona3.getApellidos());
        System.out.println("Edad: " + Persona3.getEdad());
    }
}
