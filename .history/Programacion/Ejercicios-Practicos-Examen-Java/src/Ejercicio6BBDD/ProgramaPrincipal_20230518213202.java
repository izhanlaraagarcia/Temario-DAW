package Ejercicio6BBDD;

import java.sql.*;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Statement statement = null;

        try {
            statement = ConectarBBDD.createStatement();
            String sql = "CREATE TABLE usuarios (id INT PRIMARY KEY, nombre VARCHAR(50))";
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.err.println("Error al crear la tabla: " + e.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar el statement: " + e.getMessage());
                }
            }
        }

    }
}
