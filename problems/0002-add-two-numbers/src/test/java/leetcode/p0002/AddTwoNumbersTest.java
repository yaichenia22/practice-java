package leetcode.p0002;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddTwoNumbersTest {

    private AddTwoNumbers.ListNode list(int... vals) {
        AddTwoNumbers.ListNode dummy = new AddTwoNumbers.ListNode(0);
        AddTwoNumbers.ListNode tail = dummy;
        for (int v : vals) {
            tail.next = new AddTwoNumbers.ListNode(v);
            tail = tail.next;
        }
        return dummy.next;
    }

    private int[] toArray(AddTwoNumbers.ListNode head) {
        java.util.List<Integer> out = new java.util.ArrayList<>();
        AddTwoNumbers.ListNode p = head;
        while (p != null) { out.add(p.val); p = p.next; }
        return out.stream().mapToInt(i -> i).toArray();
    }

    @Test
    void example_basic() {
        var s = new AddTwoNumbers();
        var res = s.addTwoNumbers(list(2,4,3), list(5,6,4));
        assertArrayEquals(new int[]{7,0,8}, toArray(res));
    }

    @Test
    void example_zeroPlusZero() {
        var s = new AddTwoNumbers();
        var res = s.addTwoNumbers(list(0), list(0));
        assertArrayEquals(new int[]{0}, toArray(res));
    }

    @Test
    void edge_differentLengths() {
        var s = new AddTwoNumbers();
        var res = s.addTwoNumbers(list(1,8), list(0));
        assertArrayEquals(new int[]{1,8}, toArray(res));
    }

    @Test
    void edge_carryAtEnd() {
        var s = new AddTwoNumbers();
        var res = s.addTwoNumbers(list(5), list(5));
        assertArrayEquals(new int[]{0,1}, toArray(res));
    }

    @Test
    void edge_largeCarryPropagation() {
        var s = new AddTwoNumbers();
        var res = s.addTwoNumbers(list(9,9,9,9,9,9,9), list(9,9,9,9));
        assertArrayEquals(new int[]{8,9,9,9,0,0,0,1}, toArray(res));
    }

    @Test
    void edge_nullRobustness() {
        var s = new AddTwoNumbers();
        var res1 = s.addTwoNumbers(null, list(1,2));
        var res2 = s.addTwoNumbers(list(3,4), null);
        assertArrayEquals(new int[]{1,2}, toArray(res1));
        assertArrayEquals(new int[]{3,4}, toArray(res2));
    }
}

