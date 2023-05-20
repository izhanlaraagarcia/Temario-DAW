package EjercicioBBDD.Data;

/**
 * Clase con variables Esteticas que definen las consultas SQL a realizar.
 * La forma de invocarlas (vista en la UF4) es como se invoca a una variable de
 * clase.
 * 
 * Por ejemplo:
 * SQLClassEjercicio.SQL_INSERT
 * 
 * @author Izhan Lara Garcia
 *
 */

public class SQLClassEjercicio {
	public static String SQL_INSERT = "insert into empleados (id, nombre, apellidos, salario) values (?,?,?,?)";
	public static String SQL_GETALL = "select * from empleados";
	public static String SQL_DELETE = "delete from empleados where id=?";
}
