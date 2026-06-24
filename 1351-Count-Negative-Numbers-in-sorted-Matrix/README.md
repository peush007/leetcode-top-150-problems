# 1351. Count Negative Numbers in a Sorted Matrix

Problem Link:
https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

---

## Problem

Given a matrix sorted in non-increasing order both row-wise and column-wise, return the total number of negative numbers.

---

## Approach

Start from the bottom-left corner.

- If the current element is negative, then all elements to its right are also negative.
- Count all those elements and move one row up.
- Otherwise move right.

This avoids checking every element individually.

---

## Time Complexity

O(m + n)

where:
- m = number of rows
- n = number of columns

---

## Space Complexity

O(1)