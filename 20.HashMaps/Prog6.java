import java.util.HashMap;
import java.util.Map;
//Real-Time Example
public class Prog6 {
    public static void main(String[] args) {

        HashMap<String,Integer> marks = new HashMap<>();

        marks.put("Ravi",85);
        marks.put("Sita",92);
        marks.put("John",78);

        for(Map.Entry<String,Integer> s : marks.entrySet())
        {
            System.out.println("Name: "+s.getKey()+" Marks: "+s.getValue());
        }

    }
}