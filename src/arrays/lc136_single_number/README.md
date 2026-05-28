# LC136 - Single Number

## Problem

Given a non-empty array of integers `nums`, every element appears twice except for one. Find that single one.

Problem Link: https://leetcode.com/problems/single-number/

## Approach Used

### Bit Manipulation (XOR)

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

Use XOR operation on all elements.

Properties of XOR:

- `a ^ a = 0`
- `a ^ 0 = a`

All duplicate numbers cancel each other out, leaving only the single number.

## Notes

This is the optimal solution because it uses linear time and constant extra space.