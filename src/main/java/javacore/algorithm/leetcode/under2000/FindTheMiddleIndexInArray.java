package javacore.algorithm.leetcode.under2000;

/*
 * LeetCode 1991. Find the Middle Index in Array
 */
public class FindTheMiddleIndexInArray {
	public int findMiddleIndex(int[] nums) {
        int middleIndex = -1;
        int leftSum = 0;
        int maxSum = 0;
        for (int i : nums) {
            maxSum += i;
        }
        for (int i = 0; i <= nums.length - 1; i++) {
            maxSum -= nums[i];
            if (maxSum == leftSum) {
                return i;
            }
            leftSum += nums[i];
        }
        
        return middleIndex;
    }
}
