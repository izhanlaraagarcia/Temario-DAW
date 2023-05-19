package EjercicioBBDD;

import java.sql.*;
import java.util.*;

import EjercicioBBDD.Data.SQLClassEjercicio;

public class GestionarBBDD {
    final String URL = "jdbc:mysql://localhost:5432/scipt_ejercicio6";
    private Connection conecxion = null;
    private ResultSet rs = null;
    ArrayList<Empleado> listaEmpleados = new ArrayList<>();


    /**
     * Borra el registro de la tabla asociado al objeto emp pasado como
     * parámetro
     * 
     * @param emp objeto Empleado que se elimina de la BBDD
     * @return true si el borrado fue correcto, false sino.
     */
    public Boolean deleteEmpleado(Empleado empleado1) {
        PreparedStatement ps = null;
        int numFilas;
        try {
            if (conecxion != null) {
                ps = this.conecxion.prepareStatement(SQLClassEjercicio.SQL_DELETE);
                ps.setInt(1, empleado1.getId());
                numFilas = ps.executeUpdate();
            } else {
                this.connectToDB();
                ps = this.conecxion.prepareStatement(SQLClassEjercicio.SQL_INSERT);
                ps.setInt(1, empleado1.getId());
                numFilas = ps.executeUpdate();
                if (numFilas == 0) {
                    return false;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * A partir de un objeto empleado, inserta todos sus datos en la tabla
     * empleados.
     * 
     * @param emp Objeto de tipo empleado
     * @return 0 si no se ha insertado valor alguno. En caso contrario, el
     *         número de filas insertadas.
     * @throws SQLException
     */
    public int insertarEmpleado(Empleado empleado1) throws SQLException{
        PreparedStatement ps = null;
        int numFilas;
        try{
            if(conecxion != null){
                ps = this.conecxion.prepareStatement(SQLClassEjercicio.SQL_INSERT);
                ps.setInt(1, empleado1.getId());
                ps.setString(2, empleado1.getNombre());
                ps.setString(3, empleado1.getApellidos());
                ps.setInt(4, empleado1.getSalario());
                numFilas = ps.executeUpdate();
            } else{
                this.connectToDB();
                ps = this.conecxion.prepareStatement(SQLClassEjercicio.SQL_INSERT);
                ps.setInt(1, empleado1.getId());
                ps.setString(2, empleado1.getNombre());
                ps.setString(3, empleado1.getApellidos());
                ps.setInt(4, empleado1.getSalario());
                numFilas = ps.executeUpdate();
            } 
        } catch (SQLException e){
            System.out.println(e.getMessage());
            return 0;
        }
        finally{
            try{
                ps.close();
            } catch (SQLDataException e){
                e.printStackTrace();
            }
        }
        return numFilas;
    }

    /**
     * Cierra todos los recursos relativos a la BBDD
     * 
     * @return true si la operación fue correcta, false sino.
     */
    public boolean closeResources() {
        try {
            this.conecxion.close();
            this.rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }

    /**
     * Se conecta a la BBDD empresadb creada en postgreSQL.
     * 
     * @return true si la conexión fue satisfactoria, false sino.
     * @throws ClassNotFoundException
     */
    public boolean connectToDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    
        final String URL = "jdbc:mysql://localhost:5432/scipt_ejercicio6";
        final String USER = "root";
        final String PWD = "1234";
    
        try {
            this.conecxion = DriverManager.getConnection(URL, USER, PWD);
            System.out.println("Conexion establecida");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    
        return true;
    }

    /**
     * Obtiene todos los registros de la tabla empleados
     * @param statement 
     * 
     * @return un ArrayList de objetos de tipo Empleado mapeados a los
     *         registros de la tabla.
     * 
     * 
     * 
     */
    public ArrayList<Empleado> getAllEmpleados() {
        try {
            final String URL = "jdbc:mysql://localhost:5432/scipt_ejercicio6";
            final String SQL = "SELECT * FROM empleados";
            Statement statement = conexion.createStatement();
            rs = statement.executeQuery(SQL);
    
            while (rs.next()) {
                int idUsuario = rs.getInt("idUsuario");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                int salario = rs.getInt("salario");
    
                Empleado empleado = new Empleado(idUsuario, nombre, apellidos, salario);
                listaEmpleados.add(empleado);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener los empleados: " + e.getMessage());
        } finally {
            // Cerrar los recursos (ResultSet, Statement, Connection)
        }
    
        return listaEmpleados;
    }
    
    
}