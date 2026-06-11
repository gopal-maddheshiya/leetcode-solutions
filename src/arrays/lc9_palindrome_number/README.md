# LC9 - Palindrome Number

## Problem

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

Problem Link: https://leetcode.com/problems/palindrome-number/

## Approach Used

### String + Two Pointers

**Time Complexity:** O(n)

**Space Complexity:** O(n)

## Algorithm

1. Convert the number into a string.
2. Initialize two pointers:

    * Left pointer at the beginning.
    * Right pointer at the end.
3. Compare characters at both pointers.
4. If they are different, return `false`.
5. Otherwise move both pointers toward the center.
6. If all characters match, return `true`.

---

## Example

Input:

```text
121
```

Output:

```text
true
```

Input:

```text
-121
```

Output:

```text
false
```

Explanation:

```text
-121 != 121-
```

---

## Complexity

| Approach              | Time Complexity | Space Complexity |
| --------------------- | --------------- | ---------------- |
| String + Two Pointers | O(n)            | O(n)             |

---

## Notes

This solution converts the number into a string and checks whether the string reads the same from left to right and right to left.

A more optimized solution can be implemented without converting the number to a string.
