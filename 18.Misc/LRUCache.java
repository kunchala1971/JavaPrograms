import java.util.*;

class LRUCache extends LinkedHashMap<Integer,Integer>
{
    private int capacity;

    LRUCache(int capacity)
    {
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest)
    {
        return size() > capacity;
    }
}

public class LRUExample {
    public static void main(String[] args) {

        LRUCache cache = new LRUCache(3);

        cache.put(1,10);
        cache.put(2,20);
        cache.put(3,30);

        cache.get(1);

        cache.put(4,40);

        System.out.println(cache);
    }
}