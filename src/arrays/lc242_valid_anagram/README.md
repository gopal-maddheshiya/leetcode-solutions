# LC242 - Valid Anagram

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

An anagram is a word or phrase formed by rearranging the letters of another word or phrase, using all the original letters exactly once.

Problem Link: https://leetcode.com/problems/valid-anagram/

## Approach Used

### Frequency Array

**Time Complexity:** O(n)

**Space Complexity:** O(1)

Where `n` is the length of the strings.

## Algorithm

1. Check whether the lengths of `s` and `t` are equal.
2. If their lengths are different, return `false`.
3. Create a frequency array of size `26`.
4. Traverse string `s` and increment the frequency of each character.
5. Traverse string `t` and decrement the frequency of each character.
6. If any frequency becomes negative, return `false`.
7. If all character frequencies match, return `true`.

The character index is calculated using:

```text
s.charAt(i) - 'a'
```

For example:

```text
'a' - 'a' = 0
'b' - 'a' = 1
'c' - 'a' = 2
```

---

## Example

Input:

```text
s = "anagram"
t = "nagaram"
```

Output:

```text
true
```

Explanation:

Both strings contain the same characters with the same frequencies.

---

## Another Example

Input:

```text
s = "rat"
t = "car"
```

Output:

```text
false
```

Explanation:

The character frequencies are different.

---

## Complexity

| Approach | Time Complexity | Space Complexity |
|----------|-----------------|------------------|
| Frequency Array | O(n) | O(1) |

The frequency array always contains only `26` elements, so the extra space remains constant.

---

## Notes

The solution uses a frequency array of fixed size `26`.

```text
s characters
     ↓
Increase frequency
     ↓
t characters
     ↓
Decrease frequency
     ↓
Matching frequencies
     ↓
true
```

This approach avoids sorting and solves the problem in linear time with constant extra space.