import java.util.HashMap;
//Get Value From HashMap
public class Prog2 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Ravi");
        map.put(2, "Sita");
        map.put(3, "John");
        map.put(4, "John");

        System.out.println("Students: " + map);
        String name = map.get(1);

        System.out.println("Student Name: " + name);
    }
}