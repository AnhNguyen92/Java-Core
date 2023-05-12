package javacore.algorithm.leetcode.under2600;

/*
 * LeetCode 2562. Find the Array Concatenation Value
 */
public class FindTheArrayConcatenationValue {
	public long findTheArrayConcVal(int[] nums) {
        long sum = 0;
        int n = nums.length;
        for (int i = 0; i < n / 2 ; i++) {
            sum += sum(nums[i], nums[n - 1 - i]);
        }
        if (n % 2 == 1) {
            sum += nums[n / 2];
        }

        return sum;
    }

    private long sum(int m, int n) {
        int t = n;
        while (t > 0) {
            m *= 10;
            t /= 10;
        }
        return m + n;
    }
}
