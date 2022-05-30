package javacore.algorithm.leetcode.under0300;

/*
 * Leet code 219
 */
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] == nums[j] && (j - i <= k)) {
                    return true;
                }
        }
        return false;
    }
}
