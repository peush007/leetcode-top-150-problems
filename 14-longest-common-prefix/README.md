# 14. Longest Common Prefix

Problem Link:
https://leetcode.com/problems/longest-common-prefix/

---

## Problem

Write a function to find the longest common prefix string among an array of strings.

If there is no common prefix, return an empty string "".

---

## Approach (Sorting)

1. Sort the array of strings.
2. Compare the first and last strings.
3. Find the common prefix between them.
4. Return the prefix.

---

## Time Complexity

O(n log n) – Due to sorting.

---

## Space Complexity

O(1) – No extra space used.