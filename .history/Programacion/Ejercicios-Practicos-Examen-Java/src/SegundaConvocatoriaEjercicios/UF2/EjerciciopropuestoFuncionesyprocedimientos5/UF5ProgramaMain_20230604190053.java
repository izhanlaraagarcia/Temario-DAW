package SegundaConvocatoriaEjercicios.UF2.EjerciciopropuestoFuncionesyprocedimientos5;

import java.util.Scanner;

public class UF5ProgramaMain {
    /*
     * Procedimientos y funciones
     * Crea un programa en Java implementando funciones o procedimientos siguiendo
     * los siguientes requisitos:
     * 
     * 1.- Reverso
     * La función/procedimiento recibirá una cadena y retornará la cadena en orden
     * inverso
     * 
     * 2.- Revés
     * La función/procedimiento recibirá dos cadenas y retornará una cadena
     * concatenando ambas en orden inverso. Esto es, el segundo parámetro se
     * mostrará al principio, separadas por un guión.
     * Por ejemplo: Se recibe: "hola" y "adios". Retornará "adios-hola"
     * 3.- Contar vocales
     * La función/procedimiento recibirá una cadena y retornará el número de vocales
     * (a,e,i,o,u) que contiene la cadena.
     * 
     * 4.- Repite
     * La función/procedimiento recibirá dos parámetros, un String y un entero. La
     * función retornará la concatenación del primer parámetro tantas veces como se
     * indique en el número entero.
     * 
     * 5.- Es positivo
     * Dado un número entero pasado como parámetro, la función/procedimiento
     * devolverá true si es positivo el número, false en caso contrario.
     * 
     * 6.- Exit
     * 
     * Comportamiento del programa:
     * Crea un programa principal que ejecute por orden las cuatro
     * funciónes/procedimientos, pidiendo al usuario la información necesaria para
     * ejecutarlo correctamente.
     * Define adecuadamente las funciones o procedimientos, nombres, parámetros y
     * tipos de retorno.
     * 
     * No se permitirá utilizar System.out.println en la implementación de los
     * métodos de las operaciones arriba indicadas.
     * 
     */
    public static void main(String[] args) {
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        while (!exit) {
            // Mostrar el menú
            System.out.println("===============");
            System.out.println("1. Reverso");
            System.out.println("2. Revés");
            System.out.println("3. Contar vocales");
            System.out.println("4. Repite");
            System.out.println("5: Positivo");
            System.out.println("6: Salir");
            System.out.println("===============");
            // Leer la opción elegida por el usuario
            String op = sc.nextLine();
            // Procesar la opción elegida
            if (op.equals("1")) {
                Reverso.Reverso1();
            } else if (op.equals("2")) {
            } else if (op.equals("3")) {
            } else if (op.equals("4")) {
            } else if (op.equals("5")) {
            } else if (op.equals("6")) {
                System.out.println("Hasta la proxima");
                exit = true;
            } else {
                System.out.println("Opción inválida. Inténtalo de nuevo.");

            }

            // Cerrar el escáner después de usarlo
            
        }
        sc.close();
    }
}
