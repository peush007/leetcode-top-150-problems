# 189. Rotate Array

Problem Link:
https://leetcode.com/problems/rotate-array/

---

## Problem

Given an integer array `nums`, rotate the array to the right by `k` steps.

---

## Approach (Array Reversal)

Instead of shifting elements one by one, we can use the reverse technique.

Steps:

1. Reverse the entire array.
2. Reverse the first `k` elements.
3. Reverse the remaining `n-k` elements.

This results in the array rotated by `k` steps.

---

## Time Complexity

O(n) – Each element is visited a constant number of times.

---

## Space Complexity

O(1) – The rotation is done in-place.