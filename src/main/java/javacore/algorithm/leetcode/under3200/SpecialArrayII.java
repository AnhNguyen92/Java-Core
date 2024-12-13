package javacore.algorithm.leetcode.under3200;

/**
 * 3152. Special Array II
 */
public class SpecialArrayII {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] ans = new boolean[queries.length];
        nums[0] = (nums[0] % 2 == 0) ? 0 : 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] % 2 != nums[i-1] % 2) {
                nums[i] = nums[i-1] + 1;
            } else
                nums[i] = nums[i-1];
        }
        for (int i = 0; i < queries.length; i++) {
            ans[i] = (queries[i][1] - queries[i][0] == nums[queries[i][1]] - nums[queries[i][0]]);
        }
        return ans;
    }
}
