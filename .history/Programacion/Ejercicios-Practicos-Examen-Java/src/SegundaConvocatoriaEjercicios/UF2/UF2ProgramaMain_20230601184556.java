package SegundaConvocatoriaEjercicios.UF2;


public class UF2ProgramaMain {
    /*
     * - Definición de procedimientos
     * - Invocación (llamadas) a procedimientos desde el programa principal.
     * - Invocación (llamadas) a procedimientos desde otros procedimientos
     */
    public static void main(String[] args) {
        Titulo("Este es el titulo");
    }

    /*
     * Creamos la funcion para llamar a todas las funciones
     */
    public static void Titulo(String titulo){
        Separador();
        EscribirCMD(titulo);

    }



    /* 
    * Procedimiento que nos imprima por CMD el valor cadana 
    * @param cadena
    */ 
    public static void EscribirCMD(String cadena) {
        System.out.println(cadena);
    }
    /*
     * Creamos la funcion para la separacion de la frase
     */
    public static void Separador() {
        System.out.println("===============");        
    }
}
