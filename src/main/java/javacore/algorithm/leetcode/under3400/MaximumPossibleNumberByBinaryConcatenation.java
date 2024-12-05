package javacore.algorithm.leetcode.under3400;
/*
 * LeetCode 3309. Maximum Possible Number by Binary Concatenation
 */
public class MaximumPossibleNumberByBinaryConcatenation {
    public int maxGoodNumber(int[] nums) {
        String[] arr = new String[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.toBinaryString(nums[i]);
        }
        int max = Integer.parseInt(arr[0] + arr[1] + arr[2], 2);
        max = Math.max(Integer.parseInt(arr[0] + arr[2] + arr[1], 2), max);
        max = Math.max(Integer.parseInt(arr[1] + arr[0] + arr[2], 2), max);
        max = Math.max(Integer.parseInt(arr[1] + arr[2] + arr[0], 2), max);
        max = Math.max(Integer.parseInt(arr[2] + arr[1] + arr[0], 2), max);
        max = Math.max(Integer.parseInt(arr[2] + arr[0] + arr[1], 2), max);
        return max;
    }
}
