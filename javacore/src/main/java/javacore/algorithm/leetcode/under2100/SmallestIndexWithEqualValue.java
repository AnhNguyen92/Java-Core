package javacore.algorithm.leetcode.under2100;

/*
 * LeetCode 2057. Smallest Index With Equal Value
*/
public class SmallestIndexWithEqualValue {
	public int smallestEqual(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i])
                return i;
        }
        return -1;
    }
}
