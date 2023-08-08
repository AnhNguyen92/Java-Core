package javacore.algorithm.leetcode.under2900;
/*
 * LeetCode 2806. Account Balance After Rounded Purchase
 */
public class AccountBalanceAfterRoundedPurchase {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int r = purchaseAmount % 10;
        int ans = 100 + r - purchaseAmount;
        if (r >= 5) {
            ans -= 10;
        }
        return ans;
    }
}
