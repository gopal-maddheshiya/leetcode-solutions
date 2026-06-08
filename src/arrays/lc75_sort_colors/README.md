# LC75 - Sort Colors

## Problem

Given an array `nums` containing only `0`, `1`, and `2`, sort the array in-place without using the library sort function.

Problem Link: https://leetcode.com/problems/sort-colors/

## Approaches Used

### 1. Brute Force

**Time Complexity:** O(n log n)

**Space Complexity:** O(1)

Use Java's built-in sorting function:

```
Arrays.sort(nums);
```

This is the simplest solution but does not satisfy the follow-up requirement of solving the problem in one pass.

---

### 2. Counting Sort

**Time Complexity:** O(n)

**Space Complexity:** O(1)

Count the occurrences of:

* `0`
* `1`
* `2`

Then overwrite the array:

* Fill all `0`s
* Fill all `1`s
* Fill all `2`s

This achieves linear time complexity but requires two passes over the array.

---

### 3. Dutch National Flag Algorithm (Optimal)

**Time Complexity:** O(n)

**Space Complexity:** O(1)

Maintain three pointers:

* `low` → next position for `0`
* `mid` → current element being processed
* `high` → next position for `2`

Rules:

* If `nums[mid] == 0`

    * Swap `low` and `mid`
    * Increment both `low` and `mid`

* If `nums[mid] == 1`

    * Increment `mid`

* If `nums[mid] == 2`

    * Swap `mid` and `high`
    * Decrement `high`

This sorts the array in a single traversal.

---

## Example

Input:

```text
[2, 0, 2, 1, 1, 0]
```

Output:

```text
[0, 0, 1, 1, 2, 2]
```

---

## Complexity Comparison

| Approach            | Time Complexity | Space Complexity |
| ------------------- | --------------- | ---------------- |
| Brute Force         | O(n log n)      | O(1)             |
| Counting Sort       | O(n)            | O(1)             |
| Dutch National Flag | O(n)            | O(1)             |

---

## Notes

Optimization Journey:

```text
Arrays.sort()
      ↓
Counting Sort
      ↓
Dutch National Flag Algorithm
```

The Dutch National Flag Algorithm is the expected optimal solution and is commonly asked in coding interviews.
