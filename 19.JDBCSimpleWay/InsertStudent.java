import java.sql.*;
import java.util.Scanner;
//javac -cp .;mysql-connector-j-8.1.0.jar InsertStudent.java
//java -cp .;mysql-connector-j-8.1.0.jar InsertStudent
public class InsertStudent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Marks:");
        int marks = sc.nextInt();

        String sql = "INSERT INTO students(name,marks) VALUES(?,?)";

        try(Connection con = JdbcTemplate.getConnection();
            PreparedStatement ps = con.prepareStatement(sql))
        {

            ps.setString(1,name);
            ps.setInt(2,marks);

            int rows = ps.executeUpdate();

            if(rows>0)
                System.out.println("Student inserted successfully");

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}