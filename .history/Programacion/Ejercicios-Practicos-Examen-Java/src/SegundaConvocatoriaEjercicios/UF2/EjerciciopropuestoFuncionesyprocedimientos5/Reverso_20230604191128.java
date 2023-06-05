package SegundaConvocatoriaEjercicios.UF2.EjerciciopropuestoFuncionesyprocedimientos5;

import java.util.Scanner;

public class Reverso {
    /*
     * En esta clase de Rerso haremos dos funciones,
     * una de ella ser para la opcion 1 y la otra sera para la opcion 2:
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
     */

    // Funcion 1
    public static void Reverso1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============");
        System.out.println("Has elegido la funcion 1, introduce la cadena que quieres que se te muestra al reves: ");
        String word = sc.nextLine();
        String invertido = "";

        // Ya tendriamos la cadena que el usuario que dar la vuelta, ahora tendremos que
        // hacer la funcion donde recorramos cada caracter -1

        for (int indice = word.length() - 1; indice >= 0; indice--) {
            invertido += word.charAt(indice);
        }
        System.out.println("Esta es tu cadena inversa: " + invertido);

    }

    // Funcion 2
    public static String Reves2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============");
        System.out.println("Has elegido la funcion 2, introduce la cadena que quieres invertir y concatenar: ");
        String word = sc.nextLine();
        String word2 = sc.nextLine();

        return word2 + " - " + word;
    }
}
