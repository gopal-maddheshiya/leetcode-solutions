# LC4 - Median of Two Sorted Arrays

## Problem

Given two sorted arrays `nums1` and `nums2` of size `m` and `n`, return the median of the two sorted arrays.

The overall run time complexity should be **O(log (m + n))**.

Problem Link: https://leetcode.com/problems/median-of-two-sorted-arrays/

## Approaches Used

### 1. Brute Force (Merge Arrays)

**Time Complexity:** O(m + n)

**Space Complexity:** O(m + n)

## Algorithm

1. Merge both sorted arrays into a new array.
2. Find the middle element(s).
3. If the total length is odd:

    * Return the middle element.
4. If the total length is even:

    * Return the average of the two middle elements.

Example:

```text
nums1 = [1,3]
nums2 = [2]

Merged Array:
[1,2,3]

Median = 2
```

---

### 2. Better Approach (Two Pointers)

**Time Complexity:** O(m + n)

**Space Complexity:** O(1)

## Algorithm

1. Traverse both arrays using two pointers.
2. Simulate the merge process without creating a new array.
3. Keep track of the required median positions.
4. Return the median once the required elements are reached.

This eliminates the extra array used in the brute force approach.

---

### 3. Optimal Approach (Binary Search Partition)

**Time Complexity:** O(log(min(m, n)))

**Space Complexity:** O(1)

## Algorithm

1. Always perform Binary Search on the smaller array.
2. Partition both arrays such that:

```text
Left Half Size = Right Half Size
```

3. Let:

```text
l1 = largest element on left side of nums1
l2 = largest element on left side of nums2

r1 = smallest element on right side of nums1
r2 = smallest element on right side of nums2
```

4. Valid partition condition:

```text
l1 <= r2
and
l2 <= r1
```

5. If the condition is satisfied:

    * Odd length → median = max(l1, l2)
    * Even length → median = (max(l1,l2) + min(r1,r2)) / 2

6. Otherwise adjust the partition using Binary Search.

---

## Example

Input:

```text
nums1 = [1,3]
nums2 = [2]
```

Output:

```text
2.0
```

---

Input:

```text
nums1 = [1,2]
nums2 = [3,4]
```

Output:

```text
2.5
```

Explanation:

```text
Merged Array:

[1,2,3,4]

Median = (2 + 3) / 2
       = 2.5
```

---

## Complexity Comparison

| Approach                          | Time Complexity  | Space Complexity |
| --------------------------------- | ---------------- | ---------------- |
| Brute Force (Merge Array)         | O(m + n)         | O(m + n)         |
| Better (Two Pointers)             | O(m + n)         | O(1)             |
| Optimal (Binary Search Partition) | O(log(min(m,n))) | O(1)             |

---

## Notes

Optimization Journey:

```text
Merge Arrays
      ↓
Two Pointer Merge
      ↓
Binary Search Partition
```

The Binary Search Partition approach is the expected interview solution and satisfies the required logarithmic time complexity.
