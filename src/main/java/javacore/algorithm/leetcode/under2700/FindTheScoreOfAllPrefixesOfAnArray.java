package javacore.algorithm.leetcode.under2700;

/**
 * 2640. Find the Score of All Prefixes of an Array
 */
public class FindTheScoreOfAllPrefixesOfAnArray {
    public long[] findPrefixScore(int[] nums) {
        long[] arr = new long[nums.length];
        int max = nums[0];
        arr[0] = 2L * nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            arr[i] += nums[i] + max + arr[i-1];
        }
        return arr;
    }
}
