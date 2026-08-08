# LC3345 - Smallest Divisible Digit Product I

## Problem

Given two positive integers `n` and `t`, find the smallest number greater than or equal to `n` whose digit product is divisible by `t`.

The digit product of a number is the product of all its digits.

Problem Link: https://leetcode.com/problems/smallest-divisible-digit-product-i/

## Approach Used

### Enumeration

**Time Complexity:** O(d)

**Space Complexity:** O(1)

Where `d` is the number of digits in the current number.

## Algorithm

1. Start checking from `n`.
2. Calculate the product of its digits.
3. Check whether the digit product is divisible by `t`.
4. If it is divisible, return the current number.
5. Otherwise increment the number by `1` and repeat.

The digit product is calculated by repeatedly extracting the last digit:

```text
digit = n % 10
```

and removing it:

```text
n = n / 10
```

---

## Example

Input:

```text
n = 15
t = 3
```

Check `15`:

```text
1 × 5 = 5
5 % 3 != 0
```

Check `16`:

```text
1 × 6 = 6
6 % 3 == 0
```

Output:

```text
16
```

---

## Another Example

Input:

```text
n = 10
t = 2
```

Digit product:

```text
1 × 0 = 0
```

Since `0` is divisible by every positive integer:

```text
0 % 2 == 0
```

Output:

```text
10
```

---

## Complexity

| Approach    | Time Complexity | Space Complexity |
| ----------- | --------------- | ---------------- |
| Enumeration | O(d)            | O(1)             |

Because the constraints are small, checking consecutive numbers is sufficient.

Also, within any 10 consecutive numbers, there will be a number ending in `0`, whose digit product is `0`. Therefore, the search does not need to continue indefinitely.

---

## Notes

The solution uses simple enumeration:

```text
n
 ↓
Calculate digit product
 ↓
Divisible by t?
 ├── Yes → Return n
 └── No  → n++
              ↓
         Repeat
```

This is the appropriate and optimal approach for the given constraints.
