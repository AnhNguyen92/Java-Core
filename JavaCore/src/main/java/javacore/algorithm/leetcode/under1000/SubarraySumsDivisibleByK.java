package javacore.algorithm.leetcode.under1000;

/*
 * LeetCode 974. Subarray Sums Divisible by K
 */
public class SubarraySumsDivisibleByK {
	public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int[] arr = new int[k+1];
        int sum = 0;
        arr[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sum %= k;
            if (sum < 0) {
                sum = sum + k;
            }
            count += arr[sum];
            arr[sum]++;
        }
        return count;
    }
}
