package javacore.algorithm.leetcode.under300;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length - 1; i ++) {
            for (int j = i + 1; j < nums.length; j++) 
                if ( nums[i] == nums[j] && (j - i <= k) ) {
                    return true;
                }
        }
        return false;
    }
}
