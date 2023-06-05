package SegundaConvocatoriaEjercicios.UF2.EjerciciopropuestoFuncionesyprocedimientos5;

import java.util.Scanner;

public class ContarVocales {
    /*
     * 3.- Contar vocales
     * La función/procedimiento recibirá una cadena y retornará el número de vocales
     * (a,e,i,o,u) que contiene la cadena.
     */

    public static void ContadorV() {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Has entrado en la funcion 3, indica la cadena de la que quieres contar las vocales:");
        String cadena = sc.nextLine();
        int lon = cadena.length();
        char c;
        for (int i = 0; i > lon; i++) {
            c = cadena.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
            System.out.println("El numero de vocales es: " + count);

        }
    }
}
