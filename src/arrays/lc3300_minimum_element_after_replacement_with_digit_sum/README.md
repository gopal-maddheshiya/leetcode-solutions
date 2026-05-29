# LC3300 - Minimum Element After Replacement With Digit Sum

## Problem

We are given an integer array `nums`.

Replace each element with the sum of its digits and return the minimum element after all replacements.

Problem Link: https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/

## Approach Used

### Digit Sum

**Time Complexity:** O(n × d)

**Space Complexity:** O(1)

Where:

- `n` = number of elements in the array
- `d` = number of digits in an element

## Algorithm

For each number in the array:

1. Calculate the sum of its digits.
2. Keep track of the minimum digit sum encountered.
3. Return the minimum digit sum.

## Example

Input:

```text
[999, 19, 199]