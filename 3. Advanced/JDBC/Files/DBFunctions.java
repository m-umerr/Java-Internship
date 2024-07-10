import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBFunctions {
    public Connection connectToDb(String dbname, String user, String pass){
        Connection conn = null;
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbname,user,pass);
            if(conn!=null){
                System.out.println("Connection Established");
            }
            else{
                System.out.println("Connection Failed");
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return conn;
    }

    public void createTable(Connection conn, String tableName){
        Statement statement;
        try{
            String query = "create table "+tableName+"(empid SERIAL, name varchar(100), email varchar(100), primary key(empid));";
            statement=conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table Created Successfully");
        }
        catch(Exception e){
        System.out.println(e);
        }
    }

    public void insertRow(Connection conn, String tableName, String name, String email){
        Statement statement;
        try {
            String query=String.format("insert into %s(name,email) values ('%s','%s');", tableName,name,email);
            statement=conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row Inserted Successfully");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void readData(Connection conn, String tableName){
        Statement statement;
        ResultSet rs = null;
        try{
            String query = String.format("select * from %s", tableName);
            statement=conn.createStatement();
            rs = statement.executeQuery(query);
            while(rs.next()){
                System.out.print(rs.getString("empid")+" ");
                System.out.print(rs.getString("name")+" ");
                System.out.println(rs.getString("email")+" ");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void updateName(Connection conn,String tableName, String oldName, String newName){
        Statement statement;
        try {
            String query = String.format("update %s set name = '%s' where name = '%s'", tableName, newName, oldName);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data Updated Successfully");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void deleteById(Connection conn, String tableName, String id){
        Statement statement;
        try {
            String query = String.format("delete from %s where empid=%s", tableName, id);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data deleted successfully");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
