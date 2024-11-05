package javacore.algorithm.leetcode.under3100;

/**
 * 3095. Shortest Subarray With OR at Least K I
 */
public class ShortestSubarrayWithORAtLeastKI {
    public int minimumSubarrayLength(int[] nums, int k) {
        int min = nums.length;
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            int s = 0;
            for (int j = i; j < nums.length; j++) {
                s |= nums[j];
                if (s >= k) {
                    found = true;
                    min = Math.min(min, j - i + 1);
                    break;
                }
            }
        }
        return found ? min : -1;
    }
}
