package javacore.algorithm.leetcode.under0300;

/*
 * LeetCode 287. Find the Duplicate Number
 */
public class FindTheDuplicateNumber {
	public int findDuplicate(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i : nums) {
            arr[i]++;
            if (arr[i] == 2)
                return i;
        }
        return nums[0];
    }
}
