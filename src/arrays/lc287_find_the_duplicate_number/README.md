# LC287 - Find the Duplicate Number

## Problem

Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]`, return the duplicate number.

You must solve the problem without modifying the array and using only constant extra space.

Problem Link: https://leetcode.com/problems/find-the-duplicate-number/

## Approaches Used

### 1. Brute Force

**Time Complexity:** O(n²)

**Space Complexity:** O(1)

Compare every element with all elements after it.

* For each index, check whether the same value appears again.
* As soon as a duplicate is found, return it.

This approach is simple but inefficient for large inputs.

---

### 2. Hash Set

**Time Complexity:** O(n)

**Space Complexity:** O(n)

Traverse the array while maintaining a HashSet.

For each element:

* If it already exists in the HashSet, it is the duplicate.
* Otherwise add it to the HashSet.

This improves the time complexity to linear time.

---

## Example

Input:

```text
[1,3,4,2,2]
```

Output:

```text
2
```

---

Input:

```text
[3,1,3,4,2]
```

Output:

```text
3
```

---

## Complexity Comparison

| Approach    | Time Complexity | Space Complexity |
| ----------- | --------------- | ---------------- |
| Brute Force | O(n²)           | O(1)             |
| Hash Set    | O(n)            | O(n)             |

---

## Notes

Optimization Journey:

```text
Brute Force
      ↓
Hash Set
```

The Hash Set solution improves the running time significantly, but it uses extra space.

A more optimal solution using Floyd's Cycle Detection Algorithm can achieve:

```text
Time Complexity : O(n)
Space Complexity: O(1)
```

which satisfies all problem constraints.
