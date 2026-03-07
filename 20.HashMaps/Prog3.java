import java.util.HashMap;
import java.util.Map;
//Iterate HashMap (Using for-each)
public class Prog3 {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Java");
        map.put(2,"C++");
        map.put(3,"Python");

        for(Map.Entry<Integer,String> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}