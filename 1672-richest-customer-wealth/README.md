# 1672. Richest Customer Wealth

Problem Link:
https://leetcode.com/problems/richest-customer-wealth/

---

## Problem

You are given an `m x n` integer matrix `accounts` where:

- Each row represents a customer.
- Each column represents the amount of money in one bank account.

Return the wealth of the richest customer.

The wealth of a customer is the sum of all money in their bank accounts.

---

## Approach

We iterate through each customer and calculate their total wealth by summing all the values in that row.

1. Initialize `maxWealth` to store the maximum wealth found.
2. Traverse each row of the matrix.
3. Calculate the sum of all accounts for the current customer.
4. Update `maxWealth` if the current customer's wealth is greater.
5. Return `maxWealth`.

---

## Time Complexity

O(m × n) – Every element in the matrix is visited once.

---

## Space Complexity

O(1) – Only a few variables are used.