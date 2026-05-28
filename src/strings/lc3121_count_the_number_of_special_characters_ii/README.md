# LC3121 - Count the Number of Special Characters II

## Problem

A letter `c` is special if:

1. It appears in both lowercase and uppercase.
2. Every lowercase occurrence appears before the first uppercase occurrence.

Return the number of special letters.

Problem Link: https://leetcode.com/problems/count-the-number-of-special-characters-ii/

## Approach Used

### BruteForce / Array Tracking

**Time Complexity:** O(n)

**Space Complexity:** O(1)

Track:

- Last occurrence of lowercase letters
- First occurrence of uppercase letters

A character is special if:

last(lowercase) < first(uppercase)

## Notes

This solution uses character position tracking to validate the ordering condition.