# 268. Missing Number

Problem Link:
https://leetcode.com/problems/missing-number/

---

## Problem

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the only number that is missing from the array.

---

## Approach

1. Sort the array.
2. Traverse the array and compare each element with its index.
3. If `nums[i] != i`, then `i` is the missing number.
4. If all elements match their indices, return `nums.length`.

Example:

```text
Input: [3,0,1]

Sorted: [0,1,3]

Index 2 ≠ Value 3

Missing Number = 2
```

---

## Time Complexity

O(n log n)

Sorting dominates the runtime.

---

## Space Complexity

O(1)

Ignoring the space used by the sorting algorithm.