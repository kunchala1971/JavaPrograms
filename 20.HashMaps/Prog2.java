import java.util.HashMap;
//Get Value From HashMap
public class Prog2 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Ravi");
        map.put(102, "Sita");
        map.put(103, "John");

        String name = map.get(102);

        System.out.println("Student Name: " + name);
    }
}