# 55. Jump Game

Problem Link:
https://leetcode.com/problems/jump-game/

---

## Problem

Given an array `nums`, where each element represents the maximum jump length at that position, determine if you can reach the last index.

---

## Approach (Greedy)

We track the maximum index we can reach while traversing the array.

1. Initialize `maxReach = 0`.
2. Traverse the array from index `0`.
3. If current index `i` is greater than `maxReach`, return false.
4. Update `maxReach = max(maxReach, i + nums[i])`.
5. If `maxReach` reaches or exceeds last index, return true.

---

## Time Complexity

O(n) – We traverse the array once.

---

## Space Complexity

O(1) – No extra space is used.