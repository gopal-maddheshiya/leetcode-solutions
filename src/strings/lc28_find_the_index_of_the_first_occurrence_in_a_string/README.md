# LC28 - Find the Index of the First Occurrence in a String

## Problem

Given two strings `haystack` and `needle`, return the index of the first occurrence of `needle` in `haystack`. If `needle` is not part of `haystack`, return `-1`.

Problem Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

## Approaches Used

### 1. Brute Force

**Time Complexity:** O((n - m + 1) × m)

**Space Complexity:** O(1)

## Algorithm

1. Traverse every possible starting position in `haystack`.
2. Compare each character of `needle` with the corresponding characters in `haystack`.
3. If all characters match, return the current index.
4. If no match is found after checking every position, return `-1`.

This approach directly checks every possible substring.

---

### 2. KMP Algorithm (Optimal)

**Time Complexity:** O(n + m)

**Space Complexity:** O(m)

## Algorithm

### Step 1: Construct the LPS Array

Build the **Longest Prefix Suffix (LPS)** array for the pattern.

The LPS array stores the length of the longest proper prefix that is also a suffix for every prefix of the pattern.

Example:

```text
Pattern : ABABCABAB

LPS:
0 0 1 2 0 1 2 3 4
```

---

### Step 2: Pattern Matching

Use two pointers:

* `i` → haystack
* `j` → needle

Rules:

* If characters match, move both pointers.
* If the entire pattern matches, return the starting index.
* On mismatch:

    * If `j != 0`, move `j` using the LPS array.
    * Otherwise move `i`.

This avoids rechecking characters that are already known to match.

---

## Example

Input:

```text
haystack = "sadbutsad"
needle = "sad"
```

Output:

```text
0
```

---

Input:

```text
haystack = "leetcode"
needle = "leeto"
```

Output:

```text
-1
```

---

## Complexity Comparison

| Approach      | Time Complexity    | Space Complexity |
| ------------- | ------------------ | ---------------- |
| Brute Force   | O((n - m + 1) × m) | O(1)             |
| KMP Algorithm | O(n + m)           | O(m)             |

---

## Notes

Optimization Journey:

```text
Brute Force
      ↓
KMP Algorithm
```

The KMP algorithm preprocesses the pattern using the LPS array, allowing it to skip unnecessary comparisons. This makes it one of the most efficient string matching algorithms and the expected interview solution for LC28.
