import java.util.HashMap;
//Check Key Exists
public class Prog4 {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Apple");
        map.put(2,"Mango");
        map.put(3,"Orange");
        int key=12;
        if(map.containsKey(key))
        {
            System.out.println("Key Exists " + map.get(key));
        }
        else
        {
            System.out.println("Key Does't Exists");
        }

    }
}