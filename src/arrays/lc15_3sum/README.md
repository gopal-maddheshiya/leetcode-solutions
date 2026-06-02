# LC15 - 3Sum

## Problem

Given an integer array `nums`, return all unique triplets `[nums[i], nums[j], nums[k]]` such that:

nums[i] + nums[j] + nums[k] == 0

The solution set must not contain duplicate triplets.

Problem Link: https://leetcode.com/problems/3sum/

## Approaches Used

### 1. Brute Force

**Time Complexity:** O(n³)

**Space Complexity:** O(1)

Check every possible triplet using three nested loops and store only unique triplets.

---

### 2. Hashing

**Time Complexity:** O(n²)

**Space Complexity:** O(n)

Fix one element and use a HashSet to find the third element required to make the sum zero.

---

### 3. Two Pointers (Optimal)

**Time Complexity:** O(n²)

**Space Complexity:** O(1) (excluding output)

Sort the array.

For each element:

- Fix one element.
- Use two pointers (`left` and `right`) to find the remaining two numbers.
- Skip duplicate elements to avoid duplicate triplets.

This is the most commonly accepted optimal solution.

---

## Notes

The main challenge is avoiding duplicate triplets.

The two-pointer approach is preferred because it achieves O(n²) time complexity with constant extra space.