# LC48 - Rotate Image

## Problem

You are given an `n x n` 2D matrix representing an image. Rotate the image by 90 degrees clockwise.

The rotation must be performed in-place, which means the matrix must be modified directly without using another matrix.

Problem Link: https://leetcode.com/problems/rotate-image/

## Approach Used

### Transpose + Reverse

**Time Complexity:** O(n²)

**Space Complexity:** O(1)

## Algorithm

The matrix can be rotated 90 degrees clockwise using two steps.

### Step 1: Transpose the Matrix

Swap:

```text
matrix[i][j]
```

with:

```text
matrix[j][i]
```

This converts rows into columns.

Example:

```text
1 2 3
4 5 6
7 8 9
```

After Transpose:

```text
1 4 7
2 5 8
3 6 9
```

### Step 2: Reverse Every Row

Reverse each row of the transposed matrix.

```text
1 4 7  →  7 4 1
2 5 8  →  8 5 2
3 6 9  →  9 6 3
```

Final matrix:

```text
7 4 1
8 5 2
9 6 3
```

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
[
 [7,4,1],
 [8,5,2],
 [9,6,3]
]
```

---

## Another Example

Input:

```text
[
 [5,1,9,11],
 [2,4,8,10],
 [13,3,6,7],
 [15,14,12,16]
]
```

Output:

```text
[
 [15,13,2,5],
 [14,3,4,1],
 [12,6,8,9],
 [16,7,10,11]
]
```

---

## Complexity

| Approach | Time Complexity | Space Complexity |
|----------|-----------------|------------------|
| Transpose + Reverse | O(n²) | O(1) |

---

## Notes

The rotation is performed in-place using two operations:

```text
Transpose
    ↓
Reverse Every Row
    ↓
90° Clockwise Rotation
```

No extra matrix is created, so the solution uses constant auxiliary space.

This is the standard optimal approach for LC48.