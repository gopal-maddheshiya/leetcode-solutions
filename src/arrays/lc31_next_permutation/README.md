# LC31 - Next Permutation

## Problem

Implement the next permutation of numbers.

The replacement must be in-place and use only constant extra memory.

Problem Link: https://leetcode.com/problems/next-permutation/

## Approach Used

### Optimal

**Time Complexity:** O(n)

**Space Complexity:** O(1)

## Algorithm

### Step 1: Find the Pivot

Traverse from right to left and find the first index `i` such that:

```text
nums[i] < nums[i + 1]
```

This index is called the pivot.

---

### Step 2: Handle the Last Permutation

If no pivot exists:

```text
pivot = -1
```

then the array is in descending order.

Example:

```text
[3,2,1]
```

Reverse the entire array:

```text
[1,2,3]
```

and return.

---

### Step 3: Find the Next Greater Element

Traverse from the right side and find the first element greater than:

```text
nums[pivot]
```

Swap both elements.

Example:

```text
[1,2,3]

pivot = 2

swap(2,3)

[1,3,2]
```

---

### Step 4: Reverse the Suffix

Reverse the portion after the pivot.

This converts the suffix into the smallest possible order.

Example:

```text
Before:
[1,3,2]

After:
[1,3,2]
```

---

## Example

Input:

```text
[1,2,3]
```

Output:

```text
[1,3,2]
```

Input:

```text
[3,2,1]
```

Output:

```text
[1,2,3]
```

---

## Complexity

| Approach | Time Complexity | Space Complexity |
|-----------|----------------|------------------|
| Optimal | O(n) | O(1) |

---

## Notes

The key observation is that the suffix after the pivot is always in non-increasing order.

By swapping the pivot with the next greater element and reversing the suffix, we obtain the next lexicographically greater permutation.

This is the expected interview solution and the optimal approach for LC31.