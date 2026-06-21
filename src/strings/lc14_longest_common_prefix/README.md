# LC14 - Longest Common Prefix

## Problem

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string `""`.

Problem Link: https://leetcode.com/problems/longest-common-prefix/

## Approaches Used

### 1. Sorting

**Time Complexity:** O(n log n × m)

**Space Complexity:** O(1)

## Algorithm

1. Sort the array lexicographically.
2. Compare the first and last strings in the sorted array.
3. Find the common prefix between these two strings.
4. Return the common prefix.

### Why It Works

After sorting:

* The first and last strings will be the most different.
* Any common prefix shared by all strings must also be shared by these two strings.

Example:

```text
["flower","flow","flight"]

After Sorting:

["flight","flow","flower"]
```

Compare:

```text
flight
flower
```

Common Prefix:

```text
fl
```

---

### 2. Horizontal Scanning

**Time Complexity:** O(n × m)

**Space Complexity:** O(1)

## Algorithm

1. Assume the first string is the current prefix.
2. Compare it with each remaining string.
3. While the current string does not start with the prefix:

    * Remove the last character from the prefix.
4. Continue until all strings are processed.
5. Return the final prefix.

Example:

```text
Prefix = "flower"

Compare with "flow"
Prefix = "flow"

Compare with "flight"
Prefix = "fl"
```

Answer:

```text
fl
```

---

## Example

Input:

```text
["flower","flow","flight"]
```

Output:

```text
"fl"
```

---

Input:

```text
["dog","racecar","car"]
```

Output:

```text
""
```

Explanation:

```text
There is no common prefix among the strings.
```

---

## Complexity Comparison

| Approach            | Time Complexity | Space Complexity |
| ------------------- | --------------- | ---------------- |
| Sorting             | O(n log n × m)  | O(1)             |
| Horizontal Scanning | O(n × m)        | O(1)             |

---

## Notes

Optimization Journey:

```text
Sorting
    ↓
Horizontal Scanning
```

The Horizontal Scanning approach avoids sorting and is generally more efficient.

Both approaches are commonly discussed in coding interviews for the Longest Common Prefix problem.
