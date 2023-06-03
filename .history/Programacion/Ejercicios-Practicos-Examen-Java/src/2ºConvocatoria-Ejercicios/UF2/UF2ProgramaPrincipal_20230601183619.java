
public class UF2ProgramaPrincipal {
    /*
     * - Definición de procedimientos
     * - Invocación (llamadas) a procedimientos desde el programa principal.
     * - Invocación (llamadas) a procedimientos desde otros procedimientos
     */
    public static void main(String[] args) {
        EscribirCMD("Este es el escrito por cmd");
    }
    /* 
    * Procedimiento que nos imprima por CMD el valor cadana 
    * @param cadena
    */ 
    public static void EscribirCMD(String cadena) {
        System.out.println(cadena);
    }
}
