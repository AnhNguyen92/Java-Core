package javacore.algorithm.leetcode.under1800;

/*
 * LeetCode 1732. Find the Highest Altitude
 */
public class FindTheHighestAltitude {
	public int largestAltitude(int[] gain) {
        int max = 0;
        int[] arr = new int[gain.length+1];
        for (int i = 0; i < gain.length; i++) {
            arr[i + 1] = arr[i] + gain[i];
            if (arr[i+1] > max) max = arr[i+1];
        }
        return max;
    }
}
