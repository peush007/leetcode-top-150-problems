# 169. Majority Element

Problem Link:
https://leetcode.com/problems/majority-element/

---

## Problem

Given an array `nums` of size `n`, return the majority element.

The majority element is the element that appears more than `n/2` times.

---

## Approach (Boyer-Moore Voting Algorithm)

We use a voting technique to find the majority element.

1. Maintain two variables: `candidate` and `count`.
2. Traverse the array.
3. If `count` becomes `0`, update the candidate to the current element.
4. If the current element equals the candidate, increment `count`.
5. Otherwise decrement `count`.

Since the majority element appears more than `n/2` times, it will remain the final candidate.

---

## Time Complexity

O(n) – We traverse the array once.

---

## Space Complexity

O(1) – Only two variables are used.
