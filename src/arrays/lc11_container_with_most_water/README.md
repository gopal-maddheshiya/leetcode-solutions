# LC11 - Container With Most Water

## Problem

You are given an integer array `height` of length `n`.

There are `n` vertical lines drawn such that the two endpoints of the `iᵗʰ` line are `(i, 0)` and `(i, height[i])`.

Find two lines that together with the x-axis form a container that can hold the maximum amount of water.

Problem Link: https://leetcode.com/problems/container-with-most-water/

## Approaches Used

### 1. Brute Force

**Time Complexity:** O(n²)

**Space Complexity:** O(1)

Check every possible pair of lines and calculate the water stored between them.

---

### 2. Two Pointers (Optimal)

**Time Complexity:** O(n)

**Space Complexity:** O(1)

Start with two pointers at both ends of the array.

At each step:

- Calculate the current area.
- Update the maximum area.
- Move the pointer having the smaller height.

This works because moving the taller line cannot increase the area when the shorter line remains the limiting factor.

## Notes

The brute force solution checks all possible containers.

The two-pointer approach optimizes the solution to linear time while using constant extra space.