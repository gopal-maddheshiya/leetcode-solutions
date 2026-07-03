# LC43 - Multiply Strings

## Problem

Given two non-negative integers `num1` and `num2` represented as strings, return the product of the two numbers as a string.

**Note:** You must not use any built-in BigInteger library or convert the inputs directly to integers.

Problem Link: https://leetcode.com/problems/multiply-strings/

## Approaches Used

### 1. Brute Force

**Time Complexity:** O(max(m, n))

**Space Complexity:** O(1)

## Algorithm

1. Convert both strings into `long`.
2. Multiply the two numbers.
3. Convert the result back into a string.
4. Return the answer.

**Limitation:**

This approach only works when both numbers fit within the range of Java's `long` data type. It does **not** satisfy the constraints of the problem.

---

### 2. Better (BigInteger)

**Time Complexity:** O(m × n)

**Space Complexity:** O(m + n)

## Algorithm

1. Convert both strings into `BigInteger`.
2. Multiply them using the built-in `multiply()` method.
3. Convert the result back into a string.
4. Return the answer.

**Limitation:**

Although this handles very large numbers, LeetCode explicitly disallows using the `BigInteger` library.

---

### 3. Optimal (Grade School Multiplication)

**Time Complexity:** O(m × n)

**Space Complexity:** O(m + n)

## Algorithm

1. Create an integer array of size `m + n`.
2. Traverse both strings from right to left.
3. Multiply each pair of digits.
4. Store the product at the appropriate positions while handling carry.
5. Skip leading zeros.
6. Convert the result array into a string.

This simulates the multiplication process taught in elementary school and works for numbers of any length.

---

## Example

Input:

```text
num1 = "123"
num2 = "456"
```

Output:

```text
"56088"
```

Explanation:

```text
123 × 456 = 56088
```

---

Input:

```text
num1 = "2"
num2 = "3"
```

Output:

```text
"6"
```

---

## Complexity Comparison

| Approach                              | Time Complexity | Space Complexity |
| ------------------------------------- | --------------- | ---------------- |
| Brute Force (long)                    | O(max(m, n))    | O(1)             |
| Better (BigInteger)                   | O(m × n)        | O(m + n)         |
| Optimal (Grade School Multiplication) | O(m × n)        | O(m + n)         |

---

## Notes

Optimization Journey:

```text
long Conversion
      ↓
BigInteger
      ↓
Grade School Multiplication
```

* **Brute Force** is simple but fails for very large numbers because of `long` overflow.
* **Better** handles arbitrarily large numbers using `BigInteger`, but it is not allowed by the problem constraints.
* **Optimal** simulates manual multiplication digit by digit, handles numbers of any size, and satisfies all LeetCode requirements. It is the expected interview solution.
