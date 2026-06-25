# LC27 - Remove Element

## Problem

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in-place and return the number of remaining elements.

The relative order of the elements may be changed.

Problem Link: https://leetcode.com/problems/remove-element/

## Approaches Used

### 1. Brute Force

**Time Complexity:** O(n)

**Space Complexity:** O(n)

## Algorithm

1. Create a temporary array.
2. Traverse the original array.
3. Copy every element that is not equal to `val` into the temporary array.
4. Copy the temporary array back into the original array.
5. Return the number of remaining elements.

---

### 2. Two Pointers (Optimal)

**Time Complexity:** O(n)

**Space Complexity:** O(1)

## Algorithm

1. Maintain an index pointer `idx`.
2. Traverse the array once.
3. If the current element is not equal to `val`, place it at index `idx`.
4. Increment `idx`.
5. Return `idx` as the new length.

This removes the unwanted elements without using any extra array.

---

## Example

Input:

```text
nums = [3,2,2,3]
val = 3
```

Output:

```text
k = 2

nums = [2,2]
```

---

Input:

```text
nums = [0,1,2,2,3,0,4,2]
val = 2
```

Output:

```text
k = 5

nums = [0,1,3,0,4]
```

---

## Complexity Comparison

| Approach     | Time Complexity | Space Complexity |
| ------------ | --------------- | ---------------- |
| Brute Force  | O(n)            | O(n)             |
| Two Pointers | O(n)            | O(1)             |

---

## Notes

Optimization Journey:

```text
Brute Force
      ↓
Two Pointers
```

The Two Pointers approach is the expected interview solution because it removes elements in-place using constant extra space.
