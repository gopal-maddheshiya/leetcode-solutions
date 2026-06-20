# LC54 - Spiral Matrix

## Problem

Given an `m x n` matrix, return all elements of the matrix in spiral order.

Problem Link: https://leetcode.com/problems/spiral-matrix/

## Approach Used

### Optimal (Boundary Traversal)

**Time Complexity:** O(m × n)

**Space Complexity:** O(1) (excluding output list)

## Algorithm

Maintain four boundaries:

```text
top
bottom
left
right
```

Traverse the matrix layer by layer:

1. Traverse left → right along the top row.
2. Traverse top → bottom along the right column.
3. Traverse right → left along the bottom row.
4. Traverse bottom → top along the left column.

After completing one layer:

```text
top++
bottom--
left++
right--
```

Continue until all elements are visited.

---

## Example

Input:

```text
[
 [1,2,3],
 [4,5,6],
 [7,8,9]
]
```

Output:

```text
[1,2,3,6,9,8,7,4,5]
```

---

## Dry Run

```text
Matrix:

1 2 3
4 5 6
7 8 9
```

Traversal:

```text
Top Row    : 1 2 3
Right Col  : 6 9
Bottom Row : 8 7
Left Col   : 4
Center     : 5
```

Result:

```text
[1,2,3,6,9,8,7,4,5]
```

---

## Complexity

| Approach           | Time Complexity | Space Complexity |
| ------------------ | --------------- | ---------------- |
| Boundary Traversal | O(m × n)        | O(1)             |

---

## Notes

The key idea is to shrink the matrix boundaries after traversing each outer layer.

```text
Top Row
    ↓
Right Column
    ↓
Bottom Row
    ↓
Left Column
```

Repeat until all elements are visited.

This is the standard and optimal solution for LC54.
