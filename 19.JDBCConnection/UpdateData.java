import java.sql.*;
import java.util.*;

public class UpdateData {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/test"; 
        String user = "root";
        String password = "DURGA";
        int studentId,newMarks;
        System.out.println("Enter Student ID");
       studentId = in.nextInt();
       System.out.println("Enter New Marks");
        newMarks =in.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con = DriverManager.getConnection(url, user, password)) {
                String updateQuery = "UPDATE students SET marks = ? WHERE id = ?";

                try (PreparedStatement pstmt = con.prepareStatement(updateQuery)) {
                    pstmt.setInt(1, newMarks);
                    pstmt.setInt(2, studentId);

                    int rowsUpdated = pstmt.executeUpdate();
                    if (rowsUpdated > 0) {
                        System.out.println("Marks updated successfully for student ID " + studentId);
                    } else {
                        System.out.println("No student found with ID " + studentId);
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
