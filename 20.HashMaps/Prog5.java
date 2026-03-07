import java.util.HashMap;
//Remove Element
public class Prog5 {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Java");
        map.put(2,"Python");
        map.put(3,"React");

        map.remove(2);

        System.out.println(map);
    }
}