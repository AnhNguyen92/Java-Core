package javacore.algorithm.leetcode.under1700;

import java.util.Arrays;

/*
 * LeetCode 1619
 */
public class MeanOfArrayAfterRemovingSomeElements {
	public double trimMean(int[] arr) {
        Arrays.sort(arr);
	    double sum = 0;
	    int fivePercent = (int)Math.ceil(arr.length * 0.05);
	        
	    for(int i = fivePercent; i < arr.length - fivePercent; i ++){
	        sum+= arr[i];
	    }
	        
	        
	    return sum / (arr.length - (2*fivePercent));
    }
}
