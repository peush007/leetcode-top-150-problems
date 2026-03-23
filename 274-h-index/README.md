# 274. H-Index

Problem Link:
https://leetcode.com/problems/h-index/

---

## Problem

Given an array `citations` where `citations[i]` is the number of citations for a paper, return the researcher's h-index.

The h-index is defined as the maximum value `h` such that the researcher has at least `h` papers with at least `h` citations.

---

## Approach (Sorting)

1. Sort the array in ascending order.
2. Traverse from the end of the array.
3. For each index `i`, calculate `paperCount = n - i`.
4. If `citations[i] >= paperCount`, update `h`.
5. Otherwise, break the loop.

---

## Time Complexity

O(n log n) – Due to sorting.

---

## Space Complexity

O(1) – No extra space (ignoring sorting).