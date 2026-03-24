# 134. Gas Station

Problem Link:
https://leetcode.com/problems/gas-station/

---

## Problem

There are `n` gas stations in a circle. Each station has gas and a cost to travel to the next station.

Return the starting station index if you can travel around the circuit once, otherwise return -1.

---

## Approach (Greedy)

1. Calculate total gas and total cost.
2. If total gas < total cost, return -1.
3. Traverse the array:
   - Maintain `currentGas`
   - Add `gas[i] - cost[i]`
4. If `currentGas` becomes negative:
   - Reset start to `i + 1`
   - Reset `currentGas = 0`
5. Return the starting index.

---

## Time Complexity

O(n) – We traverse the array once.

---

## Space Complexity

O(1) – No extra space is used.