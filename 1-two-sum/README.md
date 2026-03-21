# 1. Two Sum

Problem Link:
https://leetcode.com/problems/two-sum/

---

## Problem

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to the target.

---

## Approach (HashMap)

We use a HashMap to store elements and their indices.

1. Traverse the array.
2. For each element, calculate `needed = target - nums[i]`.
3. Check if `needed` exists in the map.
4. If it exists, return the indices.
5. Otherwise, store the current element in the map.

---

## Time Complexity

O(n) – We traverse the array once.

---

## Space Complexity

O(n) – HashMap stores elements.