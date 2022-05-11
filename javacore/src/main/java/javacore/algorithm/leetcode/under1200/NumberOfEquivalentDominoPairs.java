package javacore.algorithm.leetcode.under1200;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 1128
 */
public class NumberOfEquivalentDominoPairs {
	public int numEquivDominoPairs2(int[][] dominoes) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < dominoes.length; i++) {
			int[] domino = dominoes[i];
			int sum = sum(domino);
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		int count = 0;
		for (Integer i : map.values()) {
			if (i > 1) {
				count += combination(2, i);
			}
		}
		return count;
	}

	private int combination(int k, int n) {
		if (k == 0 || k == n)
			return 1;
		if (k == 1)
			return n;
		return combination(k - 1, n - 1) + combination(k, n - 1);
	}

	private int sum(int[] domino) {
		if (domino[0] > domino[1]) {
			return domino[0] * 10 + domino[1];
		}
		return domino[1] * 10 + domino[0];
	}

	// solution 2
	public int numEquivDominoPairs(int[][] dominoes) {
		int[] arr = new int[100];
		int sum;
		for (int i = 0; i < dominoes.length; i++) {
			sum = sum(dominoes[i][0], dominoes[i][1]);
			arr[sum]++;
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count += combination(arr[i]);
		}
		return count;
	}

	private int combination(int n) {
		return (n * (n - 1)) / 2;
	}

	private int sum(int d0, int d1) {
		return (d0 > d1) ? (d0 * 10 + d1) : (d1 * 10 + d0);
	}
}
