import java.sql.*;

public class GetData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test"; 
        String user = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(url, user, password)) {
                String query = "SELECT id, name, marks FROM students";
                try (Statement stmt = con.createStatement();
                     ResultSet rs = stmt.executeQuery(query)) {
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String name = rs.getString("name");
                        int marks = rs.getInt("marks");

                        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Error.");
            e.printStackTrace();
        }
    }
}
