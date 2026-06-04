# LC53 - Maximum Subarray

## Problem

Given an integer array `nums`, find the contiguous subarray with the largest sum and return its sum.

Problem Link: https://leetcode.com/problems/maximum-subarray/

## Approaches Used

### 1. Brute Force

**Time Complexity:** O(n³)

**Space Complexity:** O(1)

Generate all possible subarrays using three nested loops and calculate the sum of each subarray.

Keep track of the maximum subarray sum encountered.

---

### 2. Prefix Sum

**Time Complexity:** O(n²)

**Space Complexity:** O(n)

Create a prefix sum array where:

```text
prefix[i] = sum of elements from index 0 to i
```

Using the prefix array, any subarray sum can be calculated in O(1):

```text
Subarray Sum(start, end)

= prefix[end]                       if start == 0

= prefix[end] - prefix[start - 1]   otherwise
```

This removes the innermost loop used in the brute force solution and improves the time complexity from O(n³) to O(n²).

---

### 3. Kadane's Algorithm (Optimal)

**Time Complexity:** O(n)

**Space Complexity:** O(1)

Maintain:

- `currSum` → Maximum subarray sum ending at the current index.
- `maxSum` → Maximum subarray sum found so far.

For every element:

```text
currSum = max(nums[i], currSum + nums[i])
maxSum = max(maxSum, currSum)
```

At each index:

- Either extend the current subarray.
- Or start a new subarray from the current element.

Choose whichever gives the larger sum.

This is the optimal solution for the problem.

---

## Example

Input:

```text
[-2, 1, -3, 4, -1, 2, 1, -5, 4]
```

Output:

```text
6
```

Explanation:

```text
[4, -1, 2, 1]
```

has the maximum sum:

```text
4 + (-1) + 2 + 1 = 6
```

---

## Complexity Comparison

| Approach | Time Complexity | Space Complexity |
|-----------|----------------|------------------|
| Brute Force | O(n³) | O(1) |
| Prefix Sum | O(n²) | O(n) |
| Kadane's Algorithm | O(n) | O(1) |

---

## Notes

Optimization Journey:

```text
Brute Force
    ↓
Prefix Sum
    ↓
Kadane's Algorithm
```

Kadane's Algorithm is the most efficient solution for this problem and is commonly asked in coding interviews.