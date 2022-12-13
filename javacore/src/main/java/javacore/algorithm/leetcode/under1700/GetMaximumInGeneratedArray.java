package javacore.algorithm.leetcode.under1700;

/*
 * LeetCode 1646. Get Maximum in Generated Array
 */
public class GetMaximumInGeneratedArray {
	public int getMaximumGenerated(int n) {
        int[] arr = new int[n+1];
        
        int max = 0;
        for(int i = 0; i < n+1; i++) {
            if (i == 0) {
                arr[i] = 0;
            } else if (i == 1) {
                arr[i] = 1;
            } else if (i % 2 == 0) {
                arr[i] = arr[i/2];
            } else {
                arr[i] = arr[i/2] + arr[i/2+1];
            }
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
