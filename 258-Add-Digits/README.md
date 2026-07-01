# 258. Add Digits

Problem Link:
https://leetcode.com/problems/add-digits/

---

## Problem

Given an integer `num`, repeatedly add all of its digits until the result has only one digit.

Return the final single-digit number.

---

## Approach (Iterative Digit Sum)

We repeatedly calculate the sum of the digits until the number becomes a single digit.

1. While the number has more than one digit:
   - Initialize a variable `sum` to `0`.
   - Extract each digit using the modulo operator.
   - Add the digit to `sum`.
   - Remove the last digit using integer division.
2. Replace the original number with the computed sum.
3. Continue until only one digit remains.
4. Return the final digit.

---

## Time Complexity

O(log n) per digit-sum iteration. Since each iteration reduces the number significantly, the overall running time remains efficient for 32-bit integers.

---

## Space Complexity

O(1) – Only a few variables are used.