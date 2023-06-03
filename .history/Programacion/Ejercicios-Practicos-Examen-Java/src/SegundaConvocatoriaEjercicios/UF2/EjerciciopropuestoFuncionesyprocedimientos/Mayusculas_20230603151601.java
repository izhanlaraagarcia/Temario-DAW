package SegundaConvocatoriaEjercicios.UF2.EjerciciopropuestoFuncionesyprocedimientos;

import java.util.Scanner;

public class Mayusculas {
    public static void convertirAMayusculas() {
        // Definiremos la nueva entrada
        Scanner scMayusculas = new Scanner(System.in);

        // Ahora le pediremos que ingrese lo que quiere pasar a mayúsculas
        System.out.println("Introduce el String que quieres pasar a mayúsculas");
        String op = scMayusculas.nextLine();

        System.out.println(op.toUpperCase());
    }
}
