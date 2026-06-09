# LC240 - Search a 2D Matrix II

## Problem

Write an efficient algorithm that searches for a target value in an `m x n` integer matrix.

Properties:

- Integers in each row are sorted in ascending order from left to right.
- Integers in each column are sorted in ascending order from top to bottom.

Problem Link: https://leetcode.com/problems/search-a-2d-matrix-ii/

## Approaches Used

### 1. Brute Force

**Time Complexity:** O(m × n)

**Space Complexity:** O(1)

Traverse every element in the matrix.

- Check each value one by one.
- Return `true` if the target is found.
- Otherwise return `false`.

This approach does not utilize the sorted nature of the matrix.

---

### 2. Staircase Search (Optimal)

**Time Complexity:** O(m + n)

**Space Complexity:** O(1)

Start from the top-right corner.

For the current element:

- If it equals the target → return `true`
- If it is greater than the target → move left
- If it is smaller than the target → move down

At each step, one row or one column is eliminated from consideration.

This efficiently uses both row-wise and column-wise sorting.

---

## Example

Input:

```text
matrix =
[
 [1, 4, 7, 11, 15],
 [2, 5, 8, 12, 19],
 [3, 6, 9, 16, 22],
 [10,13,14,17,24],
 [18,21,23,26,30]
]

target = 5
```

Output:

```text
true
```

---

## Complexity Comparison

| Approach | Time Complexity | Space Complexity |
|-----------|----------------|------------------|
| Brute Force | O(m × n) | O(1) |
| Staircase Search | O(m + n) | O(1) |

---

## Notes

Optimization Journey:

```text
Brute Force
      ↓
Staircase Search
```

The Staircase Search approach is the expected optimal solution and is commonly asked in coding interviews.