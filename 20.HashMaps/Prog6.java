import java.util.HashMap;
import java.util.Map;
//Real-Time Example
public class Prog6 {
    public static void main(String[] args) {

        HashMap<Integer,Integer> marks = new HashMap<>();

        marks.put(1,85);
        marks.put(2,92);
        marks.put(3,85);
        marks.put(2,100);

        for(Map.Entry<Integer,Integer> s : marks.entrySet())
        {
            System.out.println("Name: "+s.getKey()+" Marks: "+s.getValue());
        }

    }
}