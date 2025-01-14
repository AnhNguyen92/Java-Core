package javacore.algorithm.leetcode.under2200;

/**
 * 2110. Number of Smooth Descent Periods of a Stock
 */
public class NumberOfSmoothDescentPeriodsOfAStock {
    public long getDescentPeriods(int[] prices) {
        int count = 1;
        long ans = 1L;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i-1] - 1 == prices[i])
                count++;
            else
                count = 1;
            ans += count;
        }
        return ans;
    }
}
