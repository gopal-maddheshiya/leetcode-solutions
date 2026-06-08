# LC74 - Search a 2D Matrix

## Problem

You are given an `m x n` integer matrix with the following properties:

- Each row is sorted in non-decreasing order.
- The first integer of each row is greater than the last integer of the previous row.

Given an integer `target`, return `true` if the target exists in the matrix, otherwise return `false`.

Problem Link: https://leetcode.com/problems/search-a-2d-matrix/

## Approaches Used

### 1. Brute Force

**Time Complexity:** O(m × n)

**Space Complexity:** O(1)

Traverse every element in the matrix.

- Check each value one by one.
- Return `true` if the target is found.
- Otherwise return `false`.

This approach is simple but inefficient for large matrices.

---

### 2. Row-wise Binary Search

**Time Complexity:** O(log m + log n)

**Space Complexity:** O(1)

Use Binary Search twice:

#### Step 1: Find the correct row

Apply Binary Search on rows.

For a row `r`:

```text
matrix[r][0] <= target <= matrix[r][n-1]
```

If the target lies within the range of that row, search inside that row.

#### Step 2: Search inside the row

Apply Binary Search on the selected row.

Return:

```text
true  -> target found
false -> target not found
```

This approach is much faster than checking every element.

---

## Example

Input:

```text
matrix =
[
 [1, 3, 5, 7],
 [10, 11, 16, 20],
 [23, 30, 34, 60]
]

target = 11
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
| Row-wise Binary Search | O(log m + log n) | O(1) |

---

## Notes

Optimization Journey:

```text
Brute Force
     ↓
Row-wise Binary Search
```

The Binary Search approach takes advantage of the matrix's sorted properties and significantly improves performance.