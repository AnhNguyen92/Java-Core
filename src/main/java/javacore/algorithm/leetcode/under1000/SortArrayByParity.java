package javacore.algorithm.leetcode.under1000;

/*
 * LeetCode 905. Sort Array By Parity
 */
public class SortArrayByParity {
	public int[] sortArrayByParity(int[] A) {
		int[] ans = new int[A.length];
		int t = 0;

        for (int j : A)
            if (j % 2 == 0)
                ans[t++] = j;

        for (int j : A)
            if (j % 2 == 1)
                ans[t++] = j;

		return ans;
	}
}
