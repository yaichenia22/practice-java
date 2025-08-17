package leetcode.p0020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {

    @Test
    void example_simplePair() {
        var s = new ValidParentheses();
        assertTrue(s.isValid("()"));
    }

    @Test
    void example_mixedPairs() {
        var s = new ValidParentheses();
        assertTrue(s.isValid("()[]{}"));
    }

    @Test
    void example_wrongType() {
        var s = new ValidParentheses();
        assertFalse(s.isValid("(]"));
    }

    @Test
    void example_wrongOrder() {
        var s = new ValidParentheses();
        assertFalse(s.isValid("([)]"));
    }

    @Test
    void example_nestedCorrect() {
        var s = new ValidParentheses();
        assertTrue(s.isValid("{[]}"));
    }

    // Edge cases
    @Test
    void edge_startsWithClosing() {
        var s = new ValidParentheses();
        assertFalse(s.isValid(")"));
    }

    @Test
    void edge_extraOpenAtEnd() {
        var s = new ValidParentheses();
        assertFalse(s.isValid("(("));
    }
}

