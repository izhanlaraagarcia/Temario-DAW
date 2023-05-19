package EjercicioBBDD;

import java.sql.*;
import java.util.*;

import EjercicioBBDD.Data.SQLClassEjercicio;

public class GestionarBBDD {
    private Connection conecxion = null;
    private ResultSet rs = null;
    /** 
 *  Borra  el  registro  de  la  tabla  asociado  al  objeto  emp  pasado  como 
parámetro 
 * @param emp objeto Empleado que se elimina de la BBDD 
 * @return true si el borrado fue correcto, false sino. 
 */ 
public boolean deleteEmpleado(Empleado emp){
    PreparedStatement ps = null;
    int numFilas;
    try{
        if (conecxion != null){
            ps = this.conecxion.prepareStatement(SQLClassEjercicio.SQL_DELETE);
            ps.setInt(i, emp.getId());
            numFilas = ps.executeUpdate();
        } else {
            this.connectToDB();
            ps = this.conecxion.prepareStatement(SQLClassEjercicio.SQL_INSERT);
            ps.setInt(1, emp.getId());
            numFilas = ps.executeUpdate();
            if(numFilas ==0){
                return false;
            }
        }
    } catch (SQLException e ){
        System.out.println(e.getMessage());
        return false;
    }
    finally{
        try{
            ps.close();
        } catch (SQLException e){
            e.printStackTrace(null);
        }
    }
}

    /**
     * A partir de un objeto empleado, inserta todos sus datos en la tabla
     * empleados.
     * 
     * @param emp Objeto de tipo empleado
     * @return 0 si no se ha insertado valor alguno. En caso contrario, el
     *         número de filas insertadas.
     */
    public int insertarEmpleado(Empleado emp);

    /**
     * Cierra todos los recursos relativos a la BBDD
     * 
     * @return true si la operación fue correcta, false sino.
     */
    public boolean closeResources();

    /**
     * Se conecta a la BBDD empresadb creada en postgreSQL.
     * 
     * @return true si la conexión fue satisfactoria, false sino.
     */
    public boolean connectToDB();

    /**
     * Obtiene todos los registros de la tabla empleados
     * 
     * @return un ArrayList de objetos de tipo Empleado mapeados a los
     *         registros de la tabla.
     * 
     * 
     * 
     */
    public ArrayList<Empleado> getAllEmpleados();
}