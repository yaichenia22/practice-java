package leetcode.p0146;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LRUCacheTest {

    @Test
    void example_sequence() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(1, cache.get(1));      // {2=2, 1=1}
        cache.put(3, 3);                    // evicts key 2 -> {1=1, 3=3}
        assertEquals(-1, cache.get(2));
        cache.put(4, 4);                    // evicts key 1 -> {3=3, 4=4}
        assertEquals(-1, cache.get(1));
        assertEquals(3, cache.get(3));
        assertEquals(4, cache.get(4));
    }

    @Test
    void edge_capacityOne_evictions() {
        LRUCache cache = new LRUCache(1);
        cache.put(1, 1);
        assertEquals(1, cache.get(1));
        cache.put(2, 2); // evict 1
        assertEquals(-1, cache.get(1));
        assertEquals(2, cache.get(2));
    }

    @Test
    void edge_updateExistingMovesToMostRecent() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(1, 10); // update value and move to MRU
        cache.put(3, 3);  // should evict key 2 (LRU)
        assertEquals(10, cache.get(1));
        assertEquals(-1, cache.get(2));
        assertEquals(3, cache.get(3));
    }

    @Test
    void edge_missingKeyReturnsMinusOne() {
        LRUCache cache = new LRUCache(2);
        assertEquals(-1, cache.get(42));
        cache.put(1, 1);
        assertEquals(-1, cache.get(2));
    }

    @Test
    void repeatedGetKeepsOrder() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(1, cache.get(1)); // now 2 is LRU
        assertEquals(1, cache.get(1)); // still 2 is LRU
        cache.put(3, 3); // evicts 2
        assertEquals(-1, cache.get(2));
        assertEquals(1, cache.get(1));
        assertEquals(3, cache.get(3));
    }
}

