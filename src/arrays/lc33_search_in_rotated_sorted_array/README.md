# LC33 - Search in Rotated Sorted Array

## Problem

There is an integer array `nums` sorted in ascending order and then rotated at an unknown pivot.

Given the array `nums` and an integer `target`, return the index of `target` if it exists in the array, otherwise return `-1`.

Problem Link: https://leetcode.com/problems/search-in-rotated-sorted-array/

## Approaches Used

### 1. Linear Search

**Time Complexity:** O(n)

**Space Complexity:** O(1)

Traverse the array from left to right.

* If the target is found, return its index.
* Otherwise return `-1`.

This approach does not utilize the sorted nature of the array.

---

### 2. Modified Binary Search (Optimal)

**Time Complexity:** O(log n)

**Space Complexity:** O(1)

## Algorithm

At every step:

1. Find the middle element.
2. Check if the target is equal to the middle element.
3. Determine which half is sorted.
4. Check whether the target lies inside the sorted half.
5. Discard the other half.
6. Repeat until the target is found or the search space becomes empty.

### Key Observation

For every iteration, at least one half of the array is always sorted.

If:

```text
nums[start] <= nums[mid]
```

then the left half is sorted.

Otherwise:

```text
nums[mid] <= nums[end]
```

the right half is sorted.

This property allows Binary Search to work even after rotation.

---

## Example

Input:

```text
nums = [4,5,6,7,0,1,2]
target = 0
```

Output:

```text
4
```

---

Input:

```text
nums = [4,5,6,7,0,1,2]
target = 3
```

Output:

```text
-1
```

---

## Complexity Comparison

| Approach               | Time Complexity | Space Complexity |
| ---------------------- | --------------- | ---------------- |
| Linear Search          | O(n)            | O(1)             |
| Modified Binary Search | O(log n)        | O(1)             |

---

## Notes

Optimization Journey:

```text
Linear Search
      ↓
Modified Binary Search
```

The optimal solution takes advantage of the fact that one half of the rotated array remains sorted in every iteration.
