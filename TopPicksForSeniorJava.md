# Top Picks for Senior Java Interview Tasks

## 0146 — LRU Cache
- Core: O(1) `get`/`put` with HashMap + doubly linked list (or `LinkedHashMap`).
- Practices: Custom node structure, pointer manipulation, invariants, memory usage.
- Senior twists: Thread-safe variant (`ReentrantLock`), `LinkedHashMap` vs custom list trade-offs, generics, optional TTL eviction.
- Complexity: Time O(1) ops; Space O(capacity).

## 0023 — Merge K Sorted Lists
- Core: Use a min-heap (`PriorityQueue`) to merge N nodes across K lists.
- Practices: Comparators, heap invariants, handling nulls/different lengths.
- Senior twists: Streaming iterator interface, merging files/IO, k-way merge vs pairwise merge.
- Complexity: Time O(N log K); Space O(K).

## 0295 — Find Median from Data Stream
- Core: Two-heaps (max-heap lower, min-heap upper) with size/ordering invariants.
- Practices: Heap balancing, numerical edge cases, negative/duplicate values.
- Senior twists: Sliding window median, handling large input, stability under adversarial sequences.
- Complexity: Time O(log N) insert, O(1) median; Space O(N).

## 0076 — Minimum Window Substring
- Core: Sliding window with frequency counts and a satisfied-constraints counter.
- Practices: Index arithmetic, Unicode/ASCII assumptions, minimizing updates.
- Senior twists: Generalize to arbitrary alphabets, performance under large inputs, memory trade-offs.
- Complexity: Time O(n); Space O(1)/O(alpha) for counts.

## 0297 — Serialize and Deserialize Binary Tree
- Core: BFS or DFS (preorder) encode with null markers; robust parse/emit.
- Practices: Tree traversal, string/token parsing, null handling.
- Senior twists: Binary vs textual formats, streaming IO, versioning, whitespace/locale safety.
- Complexity: Time O(n); Space O(n).

## 0127 — Word Ladder
- Core: BFS shortest path with dictionary adjacency (pattern or on-the-fly neighbors).
- Practices: Graph modeling, pruning, visited sets, dictionary indexing.
- Senior twists: Bidirectional BFS, memory optimizations, large dictionary performance.
- Complexity: Time ~O(N * L * 26) typical; Space O(N).

## How to Use These in Interviews
- Start with the core solution, then probe trade-offs, invariants, and failure modes.
- Ask for Big-O, memory usage, and API design rationale.
- Add senior twists: concurrency, streaming/IO, scalability, and production constraints.
- Encourage tests: examples + edge cases (nulls, extremes, duplicates, empty inputs).

