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

        ArrayList<Empleado>listaEmpleados = db.getAllEmpleados(null);

        // Los recorremos y lo mostramos por consola
        if(listaEmpleados.size() != 0){
            Iterator<Empleado> it = listaEmpleados.iterator();
            while(it.hasNext()){
                System.out.println(it.next().toString());
            }
        } else{
            System.out.println("No hay registros en la tabla");
        }

        // Insertamos los registros en la BBDD
        System.out.println("=============================");
        System.out.println("2. Insertamos los registros en la BBDD");
        System.out.println("=============================");

        resultado = db.insertarEmpleado(empleado1);
        resultado = db.insertarEmpleado(empleado2);
        resultado = db.insertarEmpleado(empleado3);

        if(resultado == 0){
            System.out.println("No se han insertado los registros");
        }else{
            System.out.println("Se han añadido los registros: " + empleado1.getId() + "\n" + empleado2.getId() + "\n" + empleado3.getId() +"\n Correctamente en la BBDD");
        }

        // Mostramos todos los registros
        System.out.println("=============================");
        System.out.println("3. Mostramos todos los registros");
        System.out.println("=============================");

        
    }
}
