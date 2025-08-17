package leetcode.p0020;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class ValidParentheses {

    private static final Map<Character, Character> CHARS_MAPPING = Map.of(
        ']', '[',
        ')', '(',
        '}', '{'
    );

    private final Deque<Character> queue = new ArrayDeque<>();

    public boolean isValid(String s) {

        for (char c : s.toCharArray()) {
            if (openingBracket(c)) queue.push(c);
            else if (closingBracket(c)) {
                if (queue.isEmpty()) return false;
                if (!queue.pop().equals(CHARS_MAPPING.get(c))) return false;
            }
        }

        return queue.isEmpty();
    }

    private static boolean openingBracket(char c) {
        return CHARS_MAPPING.containsValue(c);
    }

    private static boolean closingBracket(char c) {
        return CHARS_MAPPING.containsKey(c);
    }
}
