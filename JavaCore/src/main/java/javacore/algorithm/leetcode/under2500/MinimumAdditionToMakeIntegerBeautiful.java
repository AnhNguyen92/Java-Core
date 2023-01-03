package javacore.algorithm.leetcode.under2500;

/*
 * Leetcode 2457. Minimum Addition to Make Integer Beautiful
 */
public class MinimumAdditionToMakeIntegerBeautiful {
	public long makeIntegerBeautiful(long n, int target) {
        long sum = sum(n);
        long ans = 0;
        long pow = 1;
        long temp;
        while (sum > target) {
            temp = 10l - n % 10;
            n += temp;
            ans = temp * pow + ans;
            pow *= 10;
            n /= 10;
            sum = sum(n);
        }

        return ans;
    }

    private long sum(long n) {
        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
