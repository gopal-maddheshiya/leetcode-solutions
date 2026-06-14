# LC189 - Rotate Array

## Problem

Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

Problem Link: https://leetcode.com/problems/rotate-array/

## Approaches Used

### 1. Brute Force

**Time Complexity:** O(n × k)

**Space Complexity:** O(1)

Rotate the array one step at a time.

For each rotation:

* Store the last element.
* Shift all elements one position to the right.
* Place the stored element at index `0`.

Repeat this process `k` times.

---

### 2. Auxiliary Array

**Time Complexity:** O(n)

**Space Complexity:** O(n)

Create a temporary array.

For each element:

```text
newIndex = (i + k) % n
```

Place the element at its new position inside the temporary array.

Finally, copy all elements back to the original array.

---

### 3. Reversal Algorithm (Optimal)

**Time Complexity:** O(n)

**Space Complexity:** O(1)

Steps:

1. Reverse the first `n - k` elements.
2. Reverse the last `k` elements.
3. Reverse the entire array.

Example:

```text
nums = [1,2,3,4,5,6,7]
k = 3

Reverse first part:
[4,3,2,1,5,6,7]

Reverse second part:
[4,3,2,1,7,6,5]

Reverse whole array:
[5,6,7,1,2,3,4]
```

This achieves rotation in linear time using constant extra space.

---

## Example

Input:

```text
nums = [1,2,3,4,5,6,7]
k = 3
```

Output:

```text
[5,6,7,1,2,3,4]
```

---

## Complexity Comparison

| Approach           | Time Complexity | Space Complexity |
| ------------------ | --------------- | ---------------- |
| Brute Force        | O(n × k)        | O(1)             |
| Auxiliary Array    | O(n)            | O(n)             |
| Reversal Algorithm | O(n)            | O(1)             |

---

## Notes

Optimization Journey:

```text
Brute Force
      ↓
Auxiliary Array
      ↓
Reversal Algorithm
```

The Reversal Algorithm is the optimal solution and is commonly asked in coding interviews because it achieves O(n) time with O(1) extra space.
