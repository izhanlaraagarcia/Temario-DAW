package SegundaConvocatoriaEjercicios.UF2.EjerciciopropuestoFuncionesyprocedimientos4;

import java.util.Scanner;

public class ContadorLonguitud {
    static int count = 0;
    char x;

    public static void Contador() {
        Scanner scContador = new Scanner(System.in);
        System.out.println("===============");
        System.out.println("Has elegido la funcion contador de String");

        System.out.println("Introduce el String a contar cuantas letras tiene:");
        String op = scContador.nextLine();
        System.out.println(" ");

        for (int i = 0; i < op.length(); i++) {
            count++;
        }
        System.out.println("El total de los caracteres es: " + count);

    }
}
