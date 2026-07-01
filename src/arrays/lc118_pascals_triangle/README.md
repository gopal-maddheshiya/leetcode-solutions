# LC118 - Pascal's Triangle

## Problem

Given an integer `numRows`, return the first `numRows` of Pascal's Triangle.

In Pascal's Triangle:

* The first and last element of every row is `1`.
* Every other element is the sum of the two elements directly above it.

Problem Link: https://leetcode.com/problems/pascals-triangle/

## Approaches Used

### 1. Brute Force

**Time Complexity:** O(n³)

**Space Complexity:** O(1) (excluding the output list)

## Algorithm

Generate each element individually.

For every position `(row, col)`:

* If it is the first or last element of the row, place `1`.
* Otherwise compute the value using the combination formula:

```text
nCr
```

Since every element is computed independently, many calculations are repeated.

---

### 2. Better

**Time Complexity:** O(n²)

**Space Complexity:** O(1) (excluding the output list)

## Algorithm

Generate one row at a time.

For each row:

* Compute every element using the previous combination value:

```text
next = previous × (row - col) / col
```

Store the generated row into the answer.

This avoids repeatedly calculating combinations from scratch.

---

### 3. Optimal

**Time Complexity:** O(n²)

**Space Complexity:** O(1) (excluding the output list)

## Algorithm

Generate every row using the mathematical relationship:

```text
value = value × (row - col) / col
```

Steps:

1. Start every row with `1`.
2. Generate the remaining elements one by one using the previous value.
3. Add the completed row to the answer.
4. Repeat until all rows are generated.

No factorial or recursive computation is required.

---

## Example

Input:

```text
numRows = 5
```

Output:

```text
[
 [1],
 [1,1],
 [1,2,1],
 [1,3,3,1],
 [1,4,6,4,1]
]
```

---

## Complexity Comparison

| Approach    | Time Complexity | Space Complexity |
| ----------- | --------------- | ---------------- |
| Brute Force | O(n³)           | O(1)             |
| Better      | O(n²)           | O(1)             |
| Optimal     | O(n²)           | O(1)             |

---

## Notes

Optimization Journey:

```text
Brute Force
      ↓
Better
      ↓
Optimal
```

The Optimal approach generates each row efficiently using the previous element and avoids unnecessary repeated computations. It is the preferred solution for LC118.
