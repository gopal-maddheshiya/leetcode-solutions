# LC560 - Subarray Sum Equals K

## Problem

Given an integer array `nums` and an integer `k`, return the total number of continuous subarrays whose sum equals `k`.

Problem Link: https://leetcode.com/problems/subarray-sum-equals-k/

## Approaches Used

### 1. Brute Force

**Time Complexity:** O(n³)

**Space Complexity:** O(1)

Generate all possible subarrays.

* Choose a starting index.
* Choose an ending index.
* Calculate the sum of the subarray using another loop.
* If the sum equals `k`, increment the count.

This approach checks every possible subarray and recalculates sums repeatedly.

---

### 2. Better Approach (Prefix Sum)

**Time Complexity:** O(n²)

**Space Complexity:** O(1)

For each starting index:

* Maintain a running sum while extending the subarray.
* Add the current element to the running sum.
* If the running sum equals `k`, increment the count.

This eliminates the innermost loop used in the brute force approach.

Example:

```text
nums = [1,1,1]
k = 2

Start at index 0:
sum = 1
sum = 2  ✓

Start at index 1:
sum = 1
sum = 2  ✓

Answer = 2
```

---

## Example

Input:

```text
nums = [1,1,1]
k = 2
```

Output:

```text
2
```

---

Input:

```text
nums = [1,2,3]
k = 3
```

Output:

```text
2
```

Explanation:

```text
[1,2]
[3]
```

---

## Complexity Comparison

| Approach        | Time Complexity | Space Complexity |
| --------------- | --------------- | ---------------- |
| Brute Force     | O(n³)           | O(1)             |
| Better Approach | O(n²)           | O(1)             |

---

## Notes

Optimization Journey:

```text
Brute Force
      ↓
Running Sum / Prefix Sum
```

A further optimization using Prefix Sum + HashMap can achieve:

```text
Time Complexity : O(n)
Space Complexity: O(n)
```

which is the optimal solution for LC560.
