import java.sql.*;
import java.util.Scanner;
//javac -cp .;mysql-connector-j-8.1.0.jar DeleteStudent.java
//java -cp .;mysql-connector-j-8.1.0.jar DeleteStudent
public class DeleteStudent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Student ID to delete:");
        int id = sc.nextInt();

        String sql = "DELETE FROM students WHERE id=?";

        try(Connection con = JdbcTemplate.getConnection();
            PreparedStatement ps = con.prepareStatement(sql))
        {

            ps.setInt(1,id);

            int rows = ps.executeUpdate();

            if(rows>0)
                System.out.println("Student deleted successfully");
            else
                System.out.println("Student not found");

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}