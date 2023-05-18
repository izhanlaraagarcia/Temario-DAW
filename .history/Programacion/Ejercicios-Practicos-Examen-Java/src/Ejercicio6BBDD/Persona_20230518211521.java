package Ejercicio6BBDD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Persona {
    private ConectarBBDD conexion;
    public String nombre;
    public String apellidos;
    private String correo;

    public Persona() {
        conexion = new ConectarBBDD();

    }

    public void insertarPersona(String nombre, String apellidos, String correo){
        try{
            PreparedStatement pstm = (PreparedStatement) con.getConnection().prepareStatement("insert into " + "persona(Nombre, appPaterno, appMaterno, mail) " +" values(?,?,?,?)");        ç
        }

    Persona(String nombre, String apellidos, String correo) + values(?,?,?,?));
    
}
