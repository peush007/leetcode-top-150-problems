# 151. Reverse Words in a String

Problem Link:
https://leetcode.com/problems/reverse-words-in-a-string/

---

## Problem

Given a string `s`, reverse the order of the words.

The returned string should contain:
- No leading or trailing spaces
- Only one space between words

---

## Approach

1. Remove leading and trailing spaces using `trim()`.
2. Split the string into words using `split("\\s+")`.
3. Traverse the words array from the last index to the first.
4. Append each word into a `StringBuilder`.
5. Return the final reversed string.

---

## Time Complexity

O(n)

Each character is processed once.

---

## Space Complexity

O(n)

Extra space is used to store the words after splitting.