# 58. Length of Last Word

Problem Link:
https://leetcode.com/problems/length-of-last-word/

---

## Problem

Given a string `s` consisting of words and spaces, return the length of the last word.

---

## Approach (Reverse Traversal)

1. Start from the end of the string.
2. Skip all trailing spaces.
3. Count characters until a space is found.
4. Return the count.

---

## Time Complexity

O(n) – In worst case we traverse the string once.

---

## Space Complexity

O(1) – No extra space is used.