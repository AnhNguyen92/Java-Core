package javacore.algorithm.leetcode.under2300;

/**
 * 2216. Minimum Deletions to Make Array Beautiful
 */
public class MinimumDeletionsToMakeArrayBeautiful {
    public int minDeletion(int[] nums) {
        int n = nums.length;
        int peek = nums[0];
        int deleteCount = 0;
        int size = 1;
        for (int i = 1; i < n; i++) {
            if (size % 2 == 1 && peek == nums[i]) {
                deleteCount++;
            } else {
                peek = nums[i];
                size++;
            }
        }
        return (n % 2 == deleteCount % 2) ? deleteCount : (deleteCount + 1);
    }
}
