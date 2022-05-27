package javacore.algorithm.leetcode.under1700;

/*
 * LeetCode 1672
 */
public class RichestCustomerWealth {
	public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            max = Math.max(max, sum(accounts[i]));
        }
        return max;
    }
    
    private int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
