import java.util.HashMap;
//Check Key Exists
public class Prog4 {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Apple");
        map.put(2,"Mango");
        map.put(3,"Orange");

        if(map.containsKey(2))
        {
            System.out.println("Key Exists");
        }

    }
}