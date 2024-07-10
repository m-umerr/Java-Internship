package project;
import java.sql.Connection;
import java.sql.DriverManager;

public interface DatabaseConnection {
    public default Connection connectToDb(String dbname, String username, String pass){
        Connection conn = null;
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbname,username,pass);
            if(conn!=null){
                System.out.println("Connection Established");
            }
            else{
                System.out.println("Connection Failed");
            }
        }catch (Exception e){
            System.out.println(e);
        }

        return conn;
    }
}
