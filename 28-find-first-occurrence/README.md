# 28. Find the Index of the First Occurrence in a String

Problem Link:
https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

---

## Problem

Given two strings `haystack` and `needle`, return the index of the first occurrence of `needle` in `haystack`. If not found, return -1.

---

## Approach (Brute Force)

We check every possible starting index in `haystack`.

1. Loop from index `0` to `n - m`.
2. For each index, compare characters of `needle`.
3. If all characters match, return the index.
4. If no match is found, return -1.

---

## Time Complexity

O(n * m) – In the worst case, we compare each character.

---

## Space Complexity

O(1) – No extra space is used.