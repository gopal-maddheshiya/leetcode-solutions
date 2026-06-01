# LC2144 - Minimum Cost of Buying Candies With Discount

## Problem

A shop is running a promotion:

- For every three candies purchased, you pay for the two most expensive candies.
- The cheapest candy among the three is free.

Return the minimum cost required to buy all candies.

Problem Link: https://leetcode.com/problems/minimum-cost-of-buying-candies-with-special-discount/

## Approach Used

### Sorting

**Time Complexity:** O(n log n)

**Space Complexity:** O(1)

## Algorithm

1. Sort the array in ascending order.
2. Traverse from the most expensive candy to the least expensive candy.
3. For every group of three candies:
    - Pay for the two most expensive candies.
    - Skip the third candy (free candy).
4. Return the total cost.

## Example

Input:

```text
[6, 5, 7, 9, 2, 2]