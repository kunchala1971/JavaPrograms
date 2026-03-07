import java.sql.*;
import java.util.Scanner;
//javac -cp .;mysql-connector-j-8.1.0.jar UpdateStudent.java
//java -cp .;mysql-connector-j-8.1.0.jar UpdateStudent
public class UpdateStudent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student ID:");
        int id = sc.nextInt();

        System.out.println("Enter New Marks:");
        int marks = sc.nextInt();

        String sql = "UPDATE students SET marks=? WHERE id=?";

        try(Connection con = JdbcTemplate.getConnection();
            PreparedStatement ps = con.prepareStatement(sql))
        {

            ps.setInt(1, marks);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if(rows > 0)
                System.out.println("Record Updated");
            else
                System.out.println("Student Not Found");

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}