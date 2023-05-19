package EjercicioBBDD;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        int resultado;
        GestionarBBDD db = new GestionarBBDD();

        // Nos conectamos a la bbdd
        db.getConnection();
        // crea varios objetos de tipo empleado
        Empleado empelado1 = new Empleado(1, "Juan", "Perez", 30000);
        Empleado empelado2 = new Empleado(1, "Lara", "Tercero", 23000);
        Empleado empelado3 = new Empleado(1, "Tomas", "Lopez", 20000);



        // Mostraremos todos los registros de la tabla

    }
}
