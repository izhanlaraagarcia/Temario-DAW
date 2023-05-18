import java.sql.*;

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
        }
    }
}
