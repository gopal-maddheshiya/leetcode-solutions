# LC7 - Reverse Integer

## Problem

Given a signed 32-bit integer `x`, return `x` with its digits reversed.

If reversing `x` causes the value to go outside the signed 32-bit integer range:

```text
[-2³¹, 2³¹ - 1]
```

return `0`.

Problem Link: https://leetcode.com/problems/reverse-integer/

## Approaches Used

### 1. Brute Force (String Reversal)

**Time Complexity:** O(d)

**Space Complexity:** O(d)

Where `d` is the number of digits.

## Algorithm

1. Convert the integer into a string.
2. Reverse the string.
3. Convert it back to an integer.
4. Restore the sign if the original number was negative.
5. Check for integer overflow.
6. Return the reversed number.

Example:

```text
123
↓
"123"
↓
"321"
↓
321
```

---

### 2. Optimized (Digit Extraction)

**Time Complexity:** O(d)

**Space Complexity:** O(1)

## Algorithm

1. Extract the last digit using:

```text
digit = x % 10
```

2. Append it to the reversed number:

```text
reversed = reversed * 10 + digit
```

3. Remove the last digit:

```text
x /= 10
```

4. Repeat until the number becomes zero.
5. Check for overflow at the end.

Example:

```text
123

digit = 3
reversed = 3

digit = 2
reversed = 32

digit = 1
reversed = 321
```

---

### 3. Optimal (Overflow Safe)

**Time Complexity:** O(d)

**Space Complexity:** O(1)

## Algorithm

Same digit extraction process as the optimized approach.

Before adding a new digit:

```text
reversed = reversed * 10 + digit
```

check whether the operation would exceed:

```text
Integer.MAX_VALUE
```

or

```text
Integer.MIN_VALUE
```

If overflow is detected:

```text
return 0
```

Otherwise continue building the reversed number.

This avoids using a larger data type such as `long`.

---

## Example

Input:

```text
123
```

Output:

```text
321
```

---

Input:

```text
-123
```

Output:

```text
-321
```

---

Input:

```text
120
```

Output:

```text
21
```

---

Input:

```text
1534236469
```

Output:

```text
0
```

Explanation:

```text
The reversed value exceeds the 32-bit integer range.
```

---

## Complexity Comparison

| Approach         | Time Complexity | Space Complexity |
| ---------------- | --------------- | ---------------- |
| String Reversal  | O(d)            | O(d)             |
| Digit Extraction | O(d)            | O(1)             |
| Overflow Safe    | O(d)            | O(1)             |

---

## Notes

Optimization Journey:

```text
String Reversal
      ↓
Digit Extraction
      ↓
Overflow Safe Reversal
```

The Overflow Safe approach is the expected interview solution because it avoids extra space and handles integer overflow correctly.
