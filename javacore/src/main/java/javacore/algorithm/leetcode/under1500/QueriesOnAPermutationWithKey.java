package javacore.algorithm.leetcode.under1500;

/*
 * LeetCode 1409
 */
public class QueriesOnAPermutationWithKey {
	public int[] processQueries(int[] queries, int m) {
		int[] arr = new int[queries.length];
		int[] p = new int[m];
		for (int i = 0; i < m; i++) {
			p[i] = i + 1;
		}
		for (int i = 0; i < queries.length; i++) {
			int val = queries[i];
			int index = 0;
			for (int j = 0; j < m; j++) {
				if (p[j] == val) {
					index = j;
					break;
				}
			}
			arr[i] = index;
			val = p[index];
			for (int j = index; j > 0; j--) {
				p[j] = p[j - 1];
			}
			p[0] = val;
		}
		return arr;
	}
}
