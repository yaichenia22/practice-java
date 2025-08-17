package leetcode.p0146;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private static class Node {
        int key;
        int value;
        Node prev;
        Node next;
        Node(int key, int value) { this.key = key; this.value = value; }
    }

    private final int capacity;
    private final Map<Integer, Node> map = new HashMap<>();
    private final Node head = new Node(-1, -1); // sentinel head (MRU side)
    private final Node tail = new Node(-1, -1); // sentinel tail (LRU side)

    public LRUCache(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("capacity must be positive");
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) return -1;
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if (node != null) {
            node.value = value;
            moveToHead(node);
            return;
        }
        Node n = new Node(key, value);
        map.put(key, n);
        addAfterHead(n);
        if (map.size() > capacity) {
            Node lru = popTail();
            if (lru != null) map.remove(lru.key);
        }
    }

    private void moveToHead(Node node) {
        remove(node);
        addAfterHead(node);
    }

    private void addAfterHead(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private Node popTail() {
        if (tail.prev == head) return null;
        Node lru = tail.prev;
        remove(lru);
        return lru;
    }
}

