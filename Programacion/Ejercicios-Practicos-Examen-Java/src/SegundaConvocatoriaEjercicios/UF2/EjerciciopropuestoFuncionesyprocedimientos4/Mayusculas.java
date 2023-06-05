package SegundaConvocatoriaEjercicios.UF2.EjerciciopropuestoFuncionesyprocedimientos4;

import java.util.Scanner;

public class Mayusculas {
    public static void convertirAMayusculas() {
        // Definiremos la nueva entrada
        Scanner scMayusculas = new Scanner(System.in);
        System.out.println("===============");
        System.out.println("Has elegido la funcion de transformar todo un String a mayusculas");
        // Ahora le pediremos que ingrese lo que quiere pasar a mayúsculas
        System.out.println("Introduce el String que quieres pasar a mayúsculas");
        String op = scMayusculas.nextLine();
        System.out.println(" ");
        System.out.println("Este es tu String todo en mayusculas: " + op.toUpperCase());
    }
}
