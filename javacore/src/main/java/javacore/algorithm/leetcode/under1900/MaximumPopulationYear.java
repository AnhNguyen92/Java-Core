package javacore.algorithm.leetcode.under1900;

/*
 * Leetcode 1854. Maximum Population Year
 */
public class MaximumPopulationYear {
	public int maximumPopulation(int[][] logs) {
        int[] arr = new int[2051];
		for (int[] log : logs) {
			for (int i = log[0]; i < log[1]; i++) {
				arr[i]++;
			}
		}
		int max = arr[1951];
		int index = 0;
		for (int i = arr.length - 1; i >= 1950; i--) {
			if (arr[i] > max) {
				max = arr[i];
                index = i;
			} else if (arr[i] == max) {
				index = i;
			}
		}
		return index;
    }
	
}
