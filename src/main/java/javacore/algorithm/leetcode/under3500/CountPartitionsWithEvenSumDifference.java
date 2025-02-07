package javacore.algorithm.leetcode.under3500;

/**
 *  3432. Count Partitions with Even Sum Difference
 */
public class CountPartitionsWithEvenSumDifference {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i+1] = arr[i] + nums[i];
        }
        if (arr[n] % 2 == 1)
            return 0;
        int cnt = 0;
        for (int i  = 1; i < n; i++) {
            cnt += (arr[n] % 2 == 0) ? 1 : 0;
        }
        return cnt;
    }
}
