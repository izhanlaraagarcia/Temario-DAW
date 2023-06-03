import java.util.Scanner;

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
        boolean exit = false;
        Scanner sc = new Scanner(System.in);

        while (!exit) {
            // Mostrar el menú
            System.out.println("===============");
            System.out.println("1. Mayusculas");
            System.out.println("2. Longitud de una cadena");
            System.out.println("3. Numero aleatorio");
            System.out.println("4. Salir");
            System.out.println("===============");

            // Leer la opción elegida por el usuario
            String op = sc.nextLine();

            // Procesar la opción elegida
            if (op.equals("1")) {
                Mayusculas mayusculas = new Mayusculas();
                mayusculas.convertirAMayusculas();
            } else if (op.equals("2")) {
                // Código para la opción "2"
            } else if (op.equals("3")) {
                // Código para la opción "3"
            } else if (op.equals("4")) {
                exit = true; // Salir del bucle
            } else {
                System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        }

        // Cerrar el escáner después de usarlo
        sc.close();
    }
}
