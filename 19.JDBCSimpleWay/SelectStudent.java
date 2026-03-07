import java.sql.*;
//javac -cp .;mysql-connector-j-8.1.0.jar SelectStudent.java
//java -cp .;mysql-connector-j-8.1.0.jar SelectStudent
public class SelectStudent {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "DURGA";

        String sql = "SELECT * FROM students";

        try(Connection con = DriverManager.getConnection(url,user,password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql))
        {

            System.out.println("ID\tName\tMarks");

            while(rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");

                System.out.println(id+"\t"+name+"\t"+marks);
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}