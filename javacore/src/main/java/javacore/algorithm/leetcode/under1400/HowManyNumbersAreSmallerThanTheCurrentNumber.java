package javacore.algorithm.leetcode.under1400;

/*
 * LeetCode 1365. How Many Numbers Are Smaller Than the Current Number
 */
public class HowManyNumbersAreSmallerThanTheCurrentNumber {
	public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[101];
        
        for(int i = 0; i < nums.length; i++){
            arr[nums[i]]++;
        }
        
        for(int i = 1; i < 101; i++){
            arr[i] += arr[i-1];
        }
        
        for(int i = 0; i < nums.length; i++){
           nums[i] = nums[i] == 0 ?  0 : arr[nums[i] - 1];
        }
        
        return nums;   
    }
}
