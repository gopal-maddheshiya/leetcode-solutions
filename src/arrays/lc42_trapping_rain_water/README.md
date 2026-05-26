# LC42 - Trapping Rain Water

## Problem

>Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, compute how much water it can trap after raining.

Problem Link: https://leetcode.com/problems/trapping-rain-water/

## Approach Used

### Prefix Max + Suffix Max

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

Create two arrays:

- `leftMax[i]` → Maximum height from left up to index `i`
- `rightMax[i]` → Maximum height from right up to index `i`

For each index:

water trapped = min(leftMax[i], rightMax[i]) - height[i]

Add trapped water for all indices to get the final answer.

## Notes

This solution uses extra space for prefix and suffix arrays. A more optimized two-pointer solution also exists with O(1) extra space.