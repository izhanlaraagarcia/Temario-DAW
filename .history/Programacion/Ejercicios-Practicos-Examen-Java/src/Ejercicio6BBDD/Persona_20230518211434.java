package Ejercicio6BBDD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Persona {
    private ConectarBBDD conexion;
    public String nombre;
    public String apellidos;
    private String correo;

    public Persona(){
        conexion = new ConectarBBDD();


    }

    public void insertarPersona(String nombre, String apellidos, String correo){
        PreparedStatement pstm = (PreparedStatement)conexion.getConnection().prepareStatement("inserte info: " +

    Persona(String nombre, String apellidos, String correo) + values(?,?,?,?));
    
}
