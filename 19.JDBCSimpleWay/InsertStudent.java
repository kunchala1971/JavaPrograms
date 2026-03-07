import java.sql.*;
import java.util.Scanner;
//javac -cp .;mysql-connector-j-8.1.0.jar InsertStudent.java
//java -cp .;mysql-connector-j-8.1.0.jar InsertStudent
public class InsertStudent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "DURGA";

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Marks:");
        int marks = sc.nextInt();

        String sql = "INSERT INTO students(name,marks) VALUES(?,?)";

        try(Connection con = DriverManager.getConnection(url,user,password);
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