# LC238 - Product of Array Except Self

## Problem

Given an integer array `nums`, return an array `answer` such that:

```text
answer[i] = product of all elements of nums except nums[i]
```

The solution must not use division.

Problem Link: https://leetcode.com/problems/product-of-array-except-self/

## Approaches Used

### 1. Brute Force

**Time Complexity:** O(n²)

**Space Complexity:** O(n)

For each index:

- Traverse the entire array.
- Multiply all elements except the current index.
- Store the result in the answer array.

This approach is simple but inefficient for large inputs.

---

### 2. Prefix & Suffix Product (Optimal)

**Time Complexity:** O(n)

**Space Complexity:** O(1) extra space

Build prefix products in the answer array:

```text
answer[i] = product of all elements before index i
```

Then traverse from right to left while maintaining a suffix product.

Multiply:

```text
answer[i] *= suffix
```

This gives the product of all elements except the current element.

---

## Example

Input:

```text
[1, 2, 3, 4]
```

Output:

```text
[24, 12, 8, 6]
```

Explanation:

```text
answer[0] = 2 × 3 × 4 = 24
answer[1] = 1 × 3 × 4 = 12
answer[2] = 1 × 2 × 4 = 8
answer[3] = 1 × 2 × 3 = 6
```

---

## Complexity Comparison

| Approach | Time Complexity | Space Complexity |
|-----------|----------------|------------------|
| Brute Force | O(n²) | O(n) |
| Prefix & Suffix | O(n) | O(1) extra |

---

## Notes

Optimization Journey:

```text
Brute Force
    ↓
Prefix & Suffix Product
```

The Prefix & Suffix approach is the optimal solution and is commonly asked in coding interviews.