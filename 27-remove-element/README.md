# 27. Remove Element

Problem Link:
https://leetcode.com/problems/remove-element/

---

## Problem

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in-place and return the number of elements that are not equal to `val`.

The order of elements may change and the operation must be done using **O(1)** extra space.

---

## Approach (Two Pointer Technique)

We iterate through the array and keep track of valid elements using a pointer.

1. Initialize a variable `count = 0` to store the position of the next valid element.
2. Traverse the array from index `0` to `n-1`.
3. If `nums[i]` is not equal to `val`, place it at index `count`.
4. Increment `count`.
5. Continue until the entire array is processed.

After traversal, the first `count` elements in the array contain the elements that are not equal to `val`.  
Return `count`.

---

## Time Complexity

O(n) – We traverse the array once.

---

## Space Complexity

O(1) – No extra space is used since the modification is done in-place.