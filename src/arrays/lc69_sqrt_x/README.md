# LC69 - Sqrt(x)

## Problem

Given a non-negative integer `x`, return the square root of `x` rounded down to the nearest integer.

Problem Link: https://leetcode.com/problems/sqrtx/

## Approaches Used

### 1. Binary Search

**Time Complexity:** O(log x)

**Space Complexity:** O(1)

Use Binary Search to find the largest integer whose square is less than or equal to `x`.

## Algorithm

1. Handle the edge cases `x = 0` and `x = 1`.
2. Set `start = 1` and `end = x`.
3. Calculate the middle element.
4. Check whether `mid` is a valid square root.
5. If `mid <= x / mid`, store `mid` as the answer and search on the right side.
6. Otherwise, search on the left side.
7. Return the largest valid value.

To avoid integer overflow, instead of:

```text
mid * mid <= x
```

use:

```text
mid <= x / mid
```

---

### 2. Newton's Method

**Time Complexity:** O(log x) approximately

**Space Complexity:** O(1)

Newton's Method uses iterative approximation to find the square root.

## Algorithm

1. Start with an initial approximation.
2. Calculate the next approximation using:

```text
next = (current + x / current) / 2
```

3. Continue updating the approximation until the value converges.
4. Return the integer square root.

---

## Example

Input:

```text
x = 8
```

Output:

```text
2
```

Explanation:

```text
2² = 4
3² = 9

4 <= 8 < 9

Therefore, floor(sqrt(8)) = 2
```

---

## Another Example

Input:

```text
x = 16
```

Output:

```text
4
```

Explanation:

```text
4² = 16
```

---

## Complexity

| Approach | Time Complexity | Space Complexity |
|----------|-----------------|------------------|
| Binary Search | O(log x) | O(1) |
| Newton's Method | O(log x) approximately | O(1) |

---

## Notes

The solution uses two approaches:

```text
Binary Search
      ↓
Newton's Method
```

Binary Search repeatedly reduces the search range to find the largest integer whose square is less than or equal to `x`.

Newton's Method uses mathematical approximation to converge quickly toward the square root.

Both approaches use O(1) extra space.