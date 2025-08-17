package leetcode.p0146;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

    private static final int NOT_EXIST_VALUE = -1;

    private final LinkedHashMap<Integer, Integer> cache;
    private final int capacity;

    public LRUCache(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("Capacity must be greater than 0");
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity);
    }

    public int get(int key) {
        Integer v = cache.remove(key);
        if (v != null) {
            cache.put(key, v);
            return v;
        }
        return NOT_EXIST_VALUE;
    }

    public void put(int key, int value) {
        cache.remove(key);
        if (cache.size() >= capacity) {
            Iterator<Map.Entry<Integer, Integer>> it = cache.entrySet().iterator();
            if (it.hasNext()) {
                it.next();
                it.remove();
            }
        }
        cache.put(key, value);
    }
}
