package javacore.algorithm.leetcode.under51;

/*
 * LeetCode 26
 */
public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
        int length = 1;
        int curIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                length++;
                nums[curIndex] = nums[i];
                curIndex++;
            }
            
        }
        
        return length;
    }
}
