import java.util.*;

public class SortHashMap {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(3,"Java");
        map.put(1,"Python");
        map.put(2,"React");

        TreeMap<Integer,String> sorted = new TreeMap<>(map);

        System.out.println("Sorted Map:");

        for(Map.Entry<Integer,String> e : sorted.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}