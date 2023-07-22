package javacore.algorithm.leetcode.under2700;

/*
 * LeetCode 2698. Find the Punishment Number of an Integer
 */
public class FindThePunishmentNumberOfAnInteger {
	public int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (sum(i * i, i)) {
                sum += i * i;
            }
        }
        return sum;
    }

    private boolean sum(int q, int n) {
        if (q == n)
            return true;
        if (n < 0)
            return false;
        if (q < 10) {
            return q == n;
        }
        int p = 10;
        while (q / p > 0 && n >= 0) {
        	int r = q % p;
            if (sum(q / p, n - r)) {
                return true;
            }
            p *= 10;
        }
        return false;
    }
}