package javacore.algorithm.leetcode.under0900;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 888. Fair Candy Swap
 */
public class FairCandySwap {
	public int[] fairCandySwap(int[] a, int[] b) {
		int sumA = 0;
		int sumB = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : a) {
			sumA += i;
		}
        for (int j : b) {
            sumB += j;
            map.put(j, j);
        }
		int diff = (sumA - sumB) / 2;
		for (int i : a) {
			if (map.get(i - diff) != null) {
				return new int[] { i, i - diff };
			}
		}
		return new int[] { 1, 1 };
	}
}
