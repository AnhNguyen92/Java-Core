package javacore.algorithm.leetcode.under0300;

/*
 * Leet code 268. Missing Number
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int[] arr = new int[nums.length + 1];
        arr[0] = -1;
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] = 1;

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                return i;
            }
        }
        return arr[0];
    }
}
