package Ejercicio6BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConectarBBDD {
    Connection conect = null;
    public ConectarBBDD(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/BBDD", "root", "1234");
            if(conect != null){
                System.out.println("Conecxion establecida");
            } else{
                System.out.println("Conecxion denegada");
            }
        } catch (SQLException e){
            System.out.println(e);
            
        }catch(ClassNotFoundException e){
            System.out.println(e);
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
