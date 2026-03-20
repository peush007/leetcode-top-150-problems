# 45. Jump Game II

Problem Link:
https://leetcode.com/problems/jump-game-ii/

---

## Problem

Given an array `nums`, where each element represents the maximum jump length at that position, return the minimum number of jumps required to reach the last index.

---

## Approach (Greedy)

We track the range that can be reached with the current jump.

1. Maintain three variables:
   - `jumps` → number of jumps taken
   - `currentEnd` → end of the current jump range
   - `farthest` → farthest position we can reach
2. Traverse the array until the second last element.
3. Update `farthest = max(farthest, i + nums[i])`.
4. When we reach `currentEnd`, it means we must take a jump.
5. Increase `jumps` and update `currentEnd = farthest`.

This ensures we take the minimum number of jumps.

---

## Time Complexity

O(n) – We traverse the array once.

---

## Space Complexity

O(1) – Only variables are used.