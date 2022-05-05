package javacore.algorithm.leetcode.under400;

/*
 * LeetCode 338
*/
public class CountingBits {
	public int[] countBits(int n) {
        int[] arr = new int[n+1];
        
        for(int i = 1; i <= n; i++){
            arr[i] = (i&1) + arr[i/2];
        }
        
        return arr;
    }
}
