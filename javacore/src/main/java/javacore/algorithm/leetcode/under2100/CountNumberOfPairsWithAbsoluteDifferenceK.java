package javacore.algorithm.leetcode.under2100;

/*
 * LeetCode 2006
*/
public class CountNumberOfPairsWithAbsoluteDifferenceK {
	public int countKDifference(int[] nums, int k) {
        int l=nums.length;
        int[] arr=new int[101]; 
        for(int i=0;i<l;i++){
            arr[nums[i]]++;
        }
		
        int count=0;
        for(int i=1;i+k<101;i++){
            count+=arr[i] * arr[i+k];
        }
        
        return count;
    }
}
