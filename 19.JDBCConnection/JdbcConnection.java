import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//compile
//javac -cp .;mysql-connector-j-8.1.0.jar JdbcConnection.java
//run
//java -cp .;mysql-connector-j-8.1.0.jar JdbcConnection
public class JdbcConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String user = "root";
        String password = "DURGA";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           try (Connection con = DriverManager.getConnection(url, user, password)) 
           {
                System.out.println("Connection Created");
           }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to create the database connection.");
            e.printStackTrace();
        }
    }
}
