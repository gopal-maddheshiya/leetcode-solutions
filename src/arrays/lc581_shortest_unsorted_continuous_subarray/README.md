# LC581 - Shortest Unsorted Continuous Subarray

## Problem

Given an integer array `nums`, return the length of the shortest continuous subarray such that sorting only this subarray makes the whole array sorted.

Problem Link: https://leetcode.com/problems/shortest-unsorted-continuous-subarray/

## Approach Used

### Optimal

**Time Complexity:** O(n)

**Space Complexity:** O(1)

## Algorithm

1. Find the first index from the left where the array stops being sorted.
2. Find the first index from the right where the array stops being sorted.
3. Find the minimum and maximum elements within this unsorted window.
4. Expand the left boundary while elements greater than the window minimum exist.
5. Expand the right boundary while elements smaller than the window maximum exist.
6. The length of the final window is the answer.

## Example

Input:

```text
[2,6,4,8,10,9,15]
```

Output:

```text
5
```

Explanation:

```text
Unsorted Subarray = [6,4,8,10,9]
```

Sorting only this part makes the entire array sorted.

## Notes

This solution avoids sorting the entire array.

Instead of O(n log n), it finds the unsorted window directly in O(n) time and O(1) extra space.