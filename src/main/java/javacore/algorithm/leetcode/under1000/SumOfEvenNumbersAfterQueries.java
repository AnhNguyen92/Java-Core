package javacore.algorithm.leetcode.under1000;

/*
 * LeetCode 985. Sum of Even Numbers After Queries
 */
public class SumOfEvenNumbersAfterQueries {
	public int[] sumEvenAfterQueries(int[] arr, int[][] queries) {
		int s = 0;
		for (int x : arr)
			if (x % 2 == 0)
				s += x;

		int[] ans = new int[queries.length];

		for (int i = 0; i < queries.length; ++i) {
			int val = queries[i][0];
			int index = queries[i][1];
			if (arr[index] % 2 == 0)
				s -= arr[index];
			arr[index] += val;
			if (arr[index] % 2 == 0)
				s += arr[index];
			ans[i] = s;
		}

		return ans;
	}
}
