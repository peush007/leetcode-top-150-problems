# 13. Roman to Integer

Problem Link:
https://leetcode.com/problems/roman-to-integer/

---

## Problem

Convert a Roman numeral into an integer.

Roman numerals include:
I = 1  
V = 5  
X = 10  
L = 50  
C = 100  
D = 500  
M = 1000  

Special subtraction cases:
IV = 4  
IX = 9  
XL = 40  
XC = 90  
CD = 400  
CM = 900  

---

## Approach

We scan the string from left to right.

1. Compare the current character with the next character.
2. If a smaller value appears before a larger value, it represents subtraction.
3. In that case we subtract the current value.
4. Otherwise we add the value.
5. Finally add the value of the last character.

---

## Time Complexity

O(n) – We traverse the string once.

---

## Space Complexity

O(1) – No extra space is used.