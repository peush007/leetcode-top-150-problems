# 7. Reverse Integer

Problem Link:
https://leetcode.com/problems/reverse-integer/

---

## Problem

Given a signed 32-bit integer `x`, return its digits reversed.

If reversing the integer causes it to go outside the signed 32-bit integer range `[-2³¹, 2³¹ - 1]`, return `0`.

---

## Approach

We repeatedly extract the last digit of the number and build the reversed number.

1. Extract the last digit using the modulo operator.
2. Remove the last digit from the original number.
3. Before appending the digit, check whether the reversed number would overflow the 32-bit integer range.
4. If an overflow would occur, return `0`.
5. Otherwise, append the digit and continue until all digits are processed.

---

## Time Complexity

O(log₁₀ n) – Each digit is processed exactly once.

---

## Space Complexity

O(1) – No extra space is used.