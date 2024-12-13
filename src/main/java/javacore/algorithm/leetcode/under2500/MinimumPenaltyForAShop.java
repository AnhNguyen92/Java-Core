package javacore.algorithm.leetcode.under2500;

/**
 * 2483. Minimum Penalty for a Shop
 */
public class MinimumPenaltyForAShop {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int preN = 0;
        int sufY = 0;
        char[] arr = customers.toCharArray();
        for (char c : arr) {
            if (c == 'Y')   sufY++;
        }
        int ans = preN + sufY;
        int penalty = n;
        for (int i = 0; i < n; i++) {
            if (penalty > preN + sufY) {
                penalty = preN + sufY;
                ans = i;
            }
            if (arr[i] == 'N')  preN++;
            else                sufY--;
        }
        if (penalty > preN)
            ans = n;

        return ans;
    }
}
