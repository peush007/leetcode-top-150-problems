# 121. Best Time to Buy and Sell Stock

Problem Link:
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

---

## Problem

You are given an array `prices` where `prices[i]` is the price of a stock on day `i`.

Find the maximum profit you can achieve by buying on one day and selling on another day.

You must buy before you sell.

---

## Approach (Greedy)

We track the minimum price and calculate the maximum profit.

1. Initialize `buy_price` as the first element.
2. Traverse the array from index 1.
3. If current price is less than `buy_price`, update `buy_price`.
4. Otherwise calculate profit = `prices[i] - buy_price`.
5. Update maximum profit.

---

## Time Complexity

O(n) – We traverse the array once.

---

## Space Complexity

O(1) – No extra space is used.