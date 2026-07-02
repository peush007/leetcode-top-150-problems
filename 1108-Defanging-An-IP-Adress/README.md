# 1108. Defanging an IP Address

Problem Link:
https://leetcode.com/problems/defanging-an-ip-address/

---

## Problem

Given a valid IPv4 address, return a defanged version of that IP address.

A defanged IP address replaces every period (`.`) with `"[.]"`.

---

## Approach

Java provides the `replace()` method for replacing all occurrences of a character or substring.

1. Replace every `"."` with `"[.]"`.
2. Return the modified string.

This approach is simple, readable, and efficient.

---

## Time Complexity

O(n) – The string is traversed once to replace all occurrences of `.`.

---

## Space Complexity

O(n) – A new string is created to store the modified result.