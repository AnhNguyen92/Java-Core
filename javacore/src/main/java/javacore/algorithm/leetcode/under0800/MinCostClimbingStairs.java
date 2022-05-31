package javacore.algorithm.leetcode.under0800;

/*
 * LeetCode 746
 */
public class MinCostClimbingStairs {
	public int minCostClimbingStairs(int[] cost) {
		if (cost.length <= 1)
			return 0;
		if (cost.length == 2)
			return cost[0];
		int[] arr = new int[cost.length];
		arr[0] = cost[0];
		arr[1] = cost[1];
		for (int i = 2; i < arr.length; i++) {
			arr[i] = cost[i] + Math.min(arr[i - 1], arr[i - 2]);
		}
		return Math.min(arr[arr.length - 1], arr[arr.length - 2]);
	}

	public int minCostClimbingStairs1(int[] cost) {
		int f1 = 0;
		int f2 = 0;
		for (int i = cost.length - 1; i >= 0; --i) {
			int f0 = cost[i] + Math.min(f1, f2);
			f2 = f1;
			f1 = f0;
		}
		return Math.min(f1, f2);
	}
}
