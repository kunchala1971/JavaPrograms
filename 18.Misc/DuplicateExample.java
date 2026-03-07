import java.util.*;

public class DuplicateExample {
    public static void main(String[] args) {

        int arr[] = {10,20,30,20,40,10,50};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr)
        {
            if(map.containsKey(num))
            {
                map.put(num,map.get(num)+1);
            }
            else
            {
                map.put(num,1);
            }
        }

        System.out.println("Duplicate Elements:");

        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            if(e.getValue() > 1)
            {
                System.out.println(e.getKey());
            }
        }
    }
}