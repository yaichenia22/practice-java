# 0020. Valid Parentheses

Determine if the input string `s` containing just the characters `(`, `)`, `{`, `}`, `[` and `]` is valid.

A string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order (properly nested).
- Every close bracket has a corresponding previous open bracket.

## Constraints

- `1 <= s.length <= 10^4`
- `s[i]` is one of: `()[]{}` only
- Time: O(n)
- Space: O(n) in the worst case for the stack

## Examples

- Input: `"()"` → Output: `true`
- Input: `"()[]{}"` → Output: `true`
- Input: `"(]"` → Output: `false`
- Input: `"([)]"` → Output: `false`
- Input: `"{[]}"` → Output: `true`

## Edge Cases

- Single closing bracket first: `")"` → `false`
- Starts valid but ends with extra open: `"(("` → `false`
- Mixed nested correctness: `"([])"` → `true`, `"([)]"` → `false`
- Repeated same type: `"(((((((((())))))))))"` → `true`

## API

Implement the following method:

```
package leetcode.p0020;

public class ValidParentheses {
    public boolean isValid(String s);
}
```

