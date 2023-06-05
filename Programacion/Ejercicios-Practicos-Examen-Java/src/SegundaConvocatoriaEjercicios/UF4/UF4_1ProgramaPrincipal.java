package SegundaConvocatoriaEjercicios.UF4;

/**
 * Clase principal que contiene el programa principal para realizar pruebas con la gestión de aviones.
 */
public class UF4_1ProgramaPrincipal {
    /*
     * Ejercicio propuesto 1: Reparaciones de aviones
     * Enunciado:
     * Se desea modelar la reparación de aviones de una empresa que realiza
     * mantenimiento mécanico de aviones. Para ello desea incorporar a su programa
     * informático, como primera parte de esta ampliación, la gestión de aviones.
     * De cada avión sobre el que realizan reparaciones se dispone de la siguiente
     * información:
     * - Código de avión. Es una cadena de caracteres. Por ejemplo: Airbus A350.
     * - El número de asientos disponibles en el avión.
     * - Los kilómetros de autonomía.
     * - La fecha de última revisión.
     * - El nombre y apellidos del responsable de la reparación.
     * 
     * 
     * Crea un pequeño programa para realizar las pruebas correspondientes creando
     * dos aviones y mostrando toda su información en la consola.
     */

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * 
     * @param args los argumentos de la línea de comandos (no se utilizan en este programa)
     */
    public static void main(String[] args) {
        Avion avion1 = new Avion("Avion 1", 40, 2000, "12-02-2023", "Pepe lorenzo");
        Avion avion2 = new Avion("Avion 2", 40, 2000, "12-02-2023", "Pepe lorenzo");

        System.out.println("Esta es la informacion del avion 1: \n " + avion1);
        System.out.println("===========");
        System.out.println("Esta es la informacion del avion 2: \n" + avion2);
    }
}
