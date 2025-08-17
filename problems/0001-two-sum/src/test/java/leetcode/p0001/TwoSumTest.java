package leetcode.p0001;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {
    @Test
    void example() {
        var s = new TwoSum();
        assertArrayEquals(new int[]{0,1}, s.twoSum(new int[]{2,7,11,15}, 9));
    }

    @Test
    void handlesDuplicates() {
        var s = new TwoSum();
        assertArrayEquals(new int[]{1,2}, s.twoSum(new int[]{3,3,4}, 7));
    }

    @Test
    void returnsMinusOneWhenNoSolution() {
        var s = new TwoSum();
        assertArrayEquals(new int[]{-1,-1}, s.twoSum(new int[]{1,2,3}, 100));
    }
}
