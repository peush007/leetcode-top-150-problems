# 149. Max Points on a Line

Problem Link:
https://leetcode.com/problems/max-points-on-a-line/

---

## Problem

Given an array of points, return the maximum number of points that lie on the same straight line.

---

## Approach (Slope + HashMap)

1. For each point, calculate slope with every other point.
2. Use GCD to normalize slope (dy/dx).
3. Store slope count in a HashMap.
4. Track maximum points for each slope.
5. Return the overall maximum.

---

## Time Complexity

O(n²) – Compare every pair of points.

---

## Space Complexity

O(n) – HashMap for slopes.