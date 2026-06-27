# 263. Ugly Number

Problem Link:
https://leetcode.com/problems/ugly-number/

---

## Problem

An ugly number is a positive integer whose prime factors are limited to `2`, `3`, and `5`.

Given an integer `n`, return `true` if it is an ugly number. Otherwise, return `false`.

---

## Approach (Prime Factor Division)

An ugly number can only have the prime factors `2`, `3`, and `5`.

1. If `n` is less than or equal to `0`, return `false`.
2. Continuously divide `n` by `2` while it is divisible.
3. Otherwise, divide by `3` if possible.
4. Otherwise, divide by `5` if possible.
5. If none of these divisions are possible before reaching `1`, return `false`.
6. If `n` becomes `1`, return `true`.

---

## Time Complexity

O(log n) – The value of `n` decreases after each division.

---

## Space Complexity

O(1) – No extra space is used.