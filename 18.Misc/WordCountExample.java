import java.util.*;

public class WordCountExample {
    public static void main(String[] args) {

        String text = "java is easy and java is powerful";

        String words[] = text.split(" ");

        HashMap<String,Integer> map = new HashMap<>();

        for(String word : words)
        {
            if(map.containsKey(word))
            {
                map.put(word, map.get(word)+1);
            }
            else
            {
                map.put(word,1);
            }
        }

        System.out.println(map);
    }
}