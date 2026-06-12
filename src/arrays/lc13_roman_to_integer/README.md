# LC13 - Roman to Integer

## Problem

Roman numerals are represented by seven different symbols:

```text
I = 1
V = 5
X = 10
L = 50
C = 100
D = 500
M = 1000
```

Convert a Roman numeral string into an integer.

Problem Link: https://leetcode.com/problems/roman-to-integer/

## Approach Used

### HashMap + Right to Left Traversal

**Time Complexity:** O(n)

**Space Complexity:** O(1)

## Algorithm

1. Store Roman numeral values in a HashMap.
2. Initialize the result with the value of the last character.
3. Traverse the string from right to left.
4. For each character:
    - If its value is smaller than the value to its right, subtract it.
    - Otherwise add it.
5. Return the final result.

## Example

Input:

```text
III
```

Output:

```text
3
```

Explanation:

```text
1 + 1 + 1 = 3
```

---

Input:

```text
IV
```

Output:

```text
4
```

Explanation:

```text
5 - 1 = 4
```

---

Input:

```text
MCMXCIV
```

Output:

```text
1994
```

Explanation:

```text
M     = 1000
CM    = 900
XC    = 90
IV    = 4

Total = 1994
```

---

## Complexity

| Approach | Time Complexity | Space Complexity |
|-----------|----------------|------------------|
| HashMap + Traversal | O(n) | O(1) |

---

## Notes

The key observation is:

```text
If current value < next value
    → Subtract
Else
    → Add
```

Examples:

```text
IV = 5 - 1 = 4
IX = 10 - 1 = 9
XL = 50 - 10 = 40
XC = 100 - 10 = 90
CD = 500 - 100 = 400
CM = 1000 - 100 = 900
```

This allows the Roman numeral to be converted in a single traversal.