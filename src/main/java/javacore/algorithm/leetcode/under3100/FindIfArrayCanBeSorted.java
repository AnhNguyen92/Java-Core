package javacore.algorithm.leetcode.under3100;

/**
 * 3011. Find if Array Can Be Sorted
 */
public class FindIfArrayCanBeSorted {
    public boolean canSortArray(int[] nums) {
        int max = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = Integer.bitCount(nums[i]);
            int j = i + 1;
            int curMax = nums[i];
            int curMin = nums[i];
            while (j < n && count == Integer.bitCount(nums[j])) {
                curMax = Math.max(curMax, nums[j]);
                curMin = Math.min(curMin, nums[j]);
                j++;
            }
            i = j - 1;
            if (curMin < max) {
                return false;
            }
            max = curMax;
        }
        return true;
    }
}
