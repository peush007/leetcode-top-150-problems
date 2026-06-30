# 135. Candy

Problem Link:
https://leetcode.com/problems/candy/

---

## Problem

There are `n` children standing in a line, each with a rating.

Distribute candies according to the following rules:

- Every child must receive at least one candy.
- A child with a higher rating than an adjacent child must receive more candies.

Return the minimum number of candies needed.

---

## Approach (Greedy - Two Pass)

We initialize every child with one candy.

### Left to Right Pass
- Traverse from left to right.
- If the current child's rating is greater than the previous child's rating, assign one more candy than the previous child.

### Right to Left Pass
- Traverse from right to left.
- If the current child's rating is greater than the next child's rating, update the candy count to be the maximum of its current value and one more than the next child.

Finally, sum all the candies to obtain the minimum total required.

---

## Time Complexity

O(n) – Two linear traversals of the array.

---

## Space Complexity

O(n) – An additional array is used to store the candy count.