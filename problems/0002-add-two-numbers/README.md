# 0002. Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

The result must also be in reverse order.

## Constraints

- Each linked list has between 1 and 100 nodes.
- `0 <= Node.val <= 9`
- Lists represent numbers in reverse order.
- There are no leading zeros unless the number is 0.
- Time: O(max(m, n)) where m and n are the list lengths.
- Space: O(1) extra space (output list not counted).

## Examples

- Input: `l1 = [2,4,3]`, `l2 = [5,6,4]` → Output: `[7,0,8]` (342 + 465 = 807)
- Input: `l1 = [0]`, `l2 = [0]` → Output: `[0]`
- Input: `l1 = [9,9,9,9,9,9,9]`, `l2 = [9,9,9,9]` → Output: `[8,9,9,9,0,0,0,1]`

## Edge Cases

- Different lengths: `l1 = [1,8]`, `l2 = [0]` → `[1,8]`
- Carry at the end: `l1 = [5]`, `l2 = [5]` → `[0,1]`
- One list effectively empty: treat `null` as `[]` (robustness) → returns the other list

## API

Implement the following method and supporting node class:

```
package leetcode.p0002;

public class AddTwoNumbers {
    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2);
}
```

