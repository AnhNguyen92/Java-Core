package javacore.algorithm.leetcode.under2700;

/*
 * LeetCode 2644. Find the Maximum Divisibility Score
 */
public class FindTheMaximumDivisibilityScore {
	public int maxDivScore(int[] nums, int[] divisors) {
        int max = 0;
        int count;
        int ans = divisors[0];
        for (int i = 0; i < divisors.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % divisors[i] == 0) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                ans = divisors[i];
            } else if (count == max && ans > divisors[i]) {
                ans = divisors[i];
            }
        }
        return ans;
    }
}
