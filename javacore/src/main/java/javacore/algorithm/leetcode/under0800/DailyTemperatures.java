package javacore.algorithm.leetcode.under0800;

/*
 * LeetCode 739
 */
public class DailyTemperatures {
	public int[] dailyTemperatures(int[] temperatures) {
		int n = temperatures.length;
		int j;

		int val;
		for (int i = 0; i < n - 1; i++) {
			val = temperatures[i];
			temperatures[i] = 0;
			for (j = i + 1; j < n; j++) {
				if (temperatures[j] > val) {
					temperatures[i] = j - i;
					break;
				}
			}
		}
		temperatures[n - 1] = 0;
		return temperatures;
	}
}
