# LC50 - Pow(x, n)

## Problem

Implement `pow(x, n)`, which calculates `x` raised to the power `n`.

Problem Link: https://leetcode.com/problems/powx-n/

## Approach Used

### Binary Exponentiation

**Time Complexity:** O(log n)

**Space Complexity:** O(1)

## Algorithm

1. Convert `n` into a long variable to handle overflow cases.
2. If `n` is negative:
    - Replace `x` with `1 / x`
    - Convert `n` to positive.
3. Initialize:

```text
ans = 1
```

4. While the exponent is greater than 0:

- If the current exponent is odd:

```text
ans *= x
```

- Square the base:

```text
x *= x
```

- Divide exponent by 2:

```text
n /= 2
```

5. Return `ans`.

## Example

Input:

```text
x = 2.00000
n = 10
```

Output:

```text
1024.00000
```

Explanation:

```text
2¹⁰ = 1024
```

## Notes

Instead of multiplying `x` exactly `n` times, Binary Exponentiation repeatedly squares the base and processes the exponent bit by bit.

This reduces the time complexity from:

```text
O(n) → O(log n)
```

and is the optimal solution for this problem.