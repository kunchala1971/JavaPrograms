import java.util.*;

public class MostFrequentWord {
    public static void main(String[] args) {

        String text = "java python java react java python";

        String words[] = text.split(" ");

        HashMap<String,Integer> map = new HashMap<>();

        for(String word : words)
        {
            map.put(word,map.getOrDefault(word,0)+1);
        }

        String maxWord="";
        int maxCount=0;

        for(Map.Entry<String,Integer> e : map.entrySet())
        {
            if(e.getValue()>maxCount)
            {
                maxCount=e.getValue();
                maxWord=e.getKey();
            }
        }

        System.out.println("Most Frequent Word: "+maxWord);
    }
}