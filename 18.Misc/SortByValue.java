import java.util.*;

public class SortByValue {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Banana");
        map.put(2,"Apple");
        map.put(3,"Mango");

        List<Map.Entry<Integer,String>> list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        for(Map.Entry<Integer,String> e : list)
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}