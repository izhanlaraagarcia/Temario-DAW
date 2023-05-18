package Ejercicio6BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConectarBBDD {
    Connection conect = null;
    public ConectarBBDD(){
        Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/nombre_base_datos";
        String usuario = "tu_usuario";
        String contraseña = "tu_contraseña";
        
        try {
            connection = DriverManager.getConnection(url, usuario, contraseña);
            // Aquí puedes comenzar a realizar operaciones en la base de datos
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        
    }

    public Connection getConnection(){
        return conect;
    }
    public void desconectar(){
        conect = null;
        System.out.println("Desconectado");
    }
}
