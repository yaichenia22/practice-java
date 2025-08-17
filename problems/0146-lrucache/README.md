# 0146. LRU Cache

Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

Implement the `LRUCache` class:

- `LRUCache(int capacity)`: Initialize the LRU cache with positive size `capacity`.
- `int get(int key)`: Return the value of the key if the key exists, otherwise return `-1`. Accessing a key marks it as most recently used.
- `void put(int key, int value)`: Update the value of the key if it exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.

All operations must run in O(1) average time.

## Constraints

- `1 <= capacity <= 3000`
- `0 <= key, value <= 10^4`
- Up to `10^5` total operations
- Time: O(1) for `get` and `put` using HashMap + doubly linked list (or `LinkedHashMap`)
- Space: O(capacity)

## Examples

```
Input:
["LRUCache","put","put","get","put","get","put","get","get","get"]
[[2],[1,1],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]]

Output:
[null,null,null,1,null,-1,null,-1,3,4]
```

Explanation:
- Cache capacity = 2
- put(1,1), put(2,2), get(1) -> 1 (1 becomes most-recent)
- put(3,3) evicts 2; get(2) -> -1
- put(4,4) evicts 1; get(1) -> -1; get(3) -> 3; get(4) -> 4

## Edge Cases

- Capacity 1: frequent evictions when inserting different keys
- Update existing key: `put(k, newVal)` updates value and moves key to most-recent
- Missing key: `get(missing)` returns `-1`
- Repeated `get` on same key keeps it most-recent but does not change set size

## API

Implement the following class:

```
package leetcode.p0146;

public class LRUCache {
    public LRUCache(int capacity) {}
    public int get(int key) { return -1; }
    public void put(int key, int value) {}
}
```

