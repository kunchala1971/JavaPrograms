import java.util.*;

public class StudentDatabase {
    public static void main(String[] args) {

        HashMap<Integer,String> students = new HashMap<>();

        students.put(101,"Ravi");
        students.put(102,"Sita");
        students.put(103,"John");

        System.out.println("Student List:");

        for(Map.Entry<Integer,String> s : students.entrySet())
        {
            System.out.println("ID: "+s.getKey()+" Name: "+s.getValue());
        }

        System.out.println("Search Student ID 102: "+students.get(102));

    }
}