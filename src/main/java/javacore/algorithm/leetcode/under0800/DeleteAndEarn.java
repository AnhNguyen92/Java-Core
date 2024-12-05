package javacore.algorithm.leetcode.under0800;

/**
 * 740. Delete and Earn
 */
public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        int[] arr = new int[max+1];

        for (int i : nums) {
            arr[i] += i;
        }
        for (int i = 2; i <= max; i++) {
            arr[i] = Math.max(arr[i-1], arr[i] + arr[i-2]);
        }

        return arr[max];
    }
}
