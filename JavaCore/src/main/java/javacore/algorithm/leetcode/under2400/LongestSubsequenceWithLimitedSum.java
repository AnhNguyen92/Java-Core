package javacore.algorithm.leetcode.under2400;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] ans = new int[queries.length];
        int j;
        int nLen = nums.length;
        int[] preSum = new int[nLen + 1];
        for (int i = 1; i <= nLen; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }
        for (int i = 0; i < queries.length; i++) {
            j = 0;
            while (j < nLen && preSum[j] <= queries[i]) {
                j++;
            }
            ans[i] = preSum[j];
        }
        return ans;
    }
}
