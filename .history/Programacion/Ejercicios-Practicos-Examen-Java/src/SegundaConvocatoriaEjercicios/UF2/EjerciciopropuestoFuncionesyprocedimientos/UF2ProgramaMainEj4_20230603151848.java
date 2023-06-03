package SegundaConvocatoriaEjercicios.UF2.EjerciciopropuestoFuncionesyprocedimientos;

import java.util.*;

public class UF2ProgramaMainEj4 {
    /*
     * Crea un programa en Java en el que modularices lo máximo la resolución de los
     * diferentes problemas que se plantean:
     * 
     * El programa mostrará el siguiente menú:
     * 1.- Mayúsculas
     * 2.- Longitud de una cadena
     * 3.- Número aleatorio
     * 4.- Salir
     * 
     * Comportamiento del programa:
     * El programa mostrará inicialmente este menú.
     * Si el usuario selecciona la opción 1, se pedirá al usuario una cadena. El
     * programa retornará el número de caracteres de dicha cadena
     * Si el usuario selecciona la opción 2, se imprimirá la longitud de una cadena
     * que el usuario introducirá por teclado.
     * La opción 3, mostrará un número aleatorio entre 0.0 y 1.0.
     * Si pulsa la opción 4, el programa finaliza.
     * El menú deberá mostrarse siempre y cuando no se haya pulsado la opción 4.
     * 
     * No se permitirá utilizar System.out.println en la implementación de los
     * métodos de las operaciones arriba indicadas.
     */
    public static void main(String[] args) {
        boolean exit = true;
        Scanner sc = new Scanner(System.in);
        // Vamos a crear el menu para que el usuario pueda elegir la opcion que necesite
        System.out.println("===============");
        System.out.println("1. Mayusculas");
        System.out.println("2. Longitud de una cadena");
        System.out.println("3. Numero aleatorio");
        System.out.println("4. Salir");
        System.out.println("===============");

        /*
         * Pediremos la opcione que quiere escoger el usuario
         * 
         * @param funcion elegida
         * 
         * @return funcion elegida
         */
        String op = sc.nextLine();

        while ("exit) {
            // opcion de mayusculas
            if (op.equals("1")) {
                Mayusculas mayusculas = new Mayusculas();
                mayusculas.convertirAMayusculas();
            }
        }

    }
}
