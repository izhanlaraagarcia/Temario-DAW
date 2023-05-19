package EjercicioBBDD;
--  Cabecera de las funciones a implementar en la clase de utilidades de BBDD 
 
/** 
 *  Borra  el  registro  de  la  tabla  asociado  al  objeto  emp  pasado  como 
parámetro 
 * @param emp objeto Empleado que se elimina de la BBDD 
 * @return true si el borrado fue correcto, false sino. 
 */ 
public boolean deleteEmpleado(Empleado emp);  
 
/** 
 * A partir de un objeto empleado, inserta todos sus datos en la tabla 
empleados. 
 * @param emp Objeto de tipo empleado 
 * @return 0 si no se ha insertado valor alguno. En caso contrario, el 
número de filas insertadas. 
 */ 
public int insertarEmpleado(Empleado emp); 
 
 
/** 
 * Cierra todos los recursos relativos a la BBDD 
 * @return true si la operación fue correcta, false sino. 
 */ 
public boolean closeResources(); 
 
 
/** 
 * Se conecta a la BBDD empresadb creada en postgreSQL. 
 * @return true si la conexión fue satisfactoria, false sino. 
 */ 
public boolean connectToDB(); 
 
 
/** 
 * Obtiene todos los registros de la tabla empleados 
 *  @return  un  ArrayList  de  objetos  de  tipo  Empleado  mapeados  a  los 
registros de la tabla. 
 
 
 
 */ 
public ArrayList<Empleado> getAllEmpleados();