package EjercicioBBDD;

import java.sql.SQLException;
import java.util.*;

public class ProgramaPrincipal {
    public static void main(String[] args) throws SQLException {
        int resultado;
        GestionarBBDD db = new GestionarBBDD();

        // Nos conectamos a la bbdd
        db.connectToDB();
        // crea varios objetos de tipo empleado
        Empleado empleado1 = new Empleado(1, "Juan", "Perez", 30000);
        Empleado empleado2 = new Empleado(2, "Lara", "Tercero", 23000);
        Empleado empleado3 = new Empleado(3, "Tomas", "Lopez", 20000);

        // Mostraremos todos los registros de la tabla
        System.out.println("=============================");
        System.out.println("1. Registros de la tabla");
        System.out.println("=============================");

        ArrayList<Empleado> listaEmpleados = db.getAllEmpleados();

        // Los recorremos y los mostramos por consola
        if (listaEmpleados.size() != 0) {
            for (Empleado empleado : listaEmpleados) {
                System.out.println(empleado.toString());
            }
        } else {
            System.out.println("No hay registros en la tabla");
        }
        System.out.println(" ");

        // Insertamos los registros en la BBDD
        System.out.println("=============================");
        System.out.println("2. Insertamos los registros en la BBDD");
        System.out.println("=============================");

        resultado = db.insertarEmpleado(empleado1);
        resultado += db.insertarEmpleado(empleado2);
        resultado += db.insertarEmpleado(empleado3);

        if (resultado == 0) {
            System.out.println("No se han insertado los registros");
        } else {
            System.out.println("Se han añadido los registros: " + resultado + " correctamente en la BBDD");
        }
        System.out.println(" ");

        // Mostramos todos los registros
        System.out.println("=============================");
        System.out.println("3. Mostramos todos los registros");
        System.out.println("=============================");

        listaEmpleados = db.getAllEmpleados();
        if (listaEmpleados.size() != 0) {
            for (Empleado empleado : listaEmpleados) {
                System.out.println(empleado.toString());
            }
        } else {
            System.out.println("No hay registros en la tabla");
        }
        System.out.println(" ");

        // Borrar registros de la tabla
        System.out.println("=============================");
        System.out.println("4. Borrar registros de la tabla");
        System.out.println("=============================");

        boolean borrar = db.deleteEmpleado(empleado3);

        if (borrar) {
            System.out.println("Registro eliminado");
        } else {
            System.out.println("No se encontró el registro");
        }
        System.out.println(" ");
        
        // Mostramos todos los registros
        System.out.println("=============================");
        System.out.println("5. Mostramos todos los registros post borrados");
        System.out.println("=============================");

        listaEmpleados = db.getAllEmpleados();
        if (listaEmpleados.size() != 0) {
            for (Empleado empleado : listaEmpleados) {
                System.out.println(empleado.toString());
            }
        } else {
            System.out.println("No hay registros en la tabla");
        }
    }
}
