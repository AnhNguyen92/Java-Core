package javacore.algorithm.leetcode.under2000;

/*
 * LeetCode 1925. Count Square Sum Triples
 */
public class CountSquareSumTriples {

	public int countTriples(int n) {
		int count = 0;
		int max = n * n;
		int square;
		for (int i = 1; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				square = i * i + j * j;
				if (square <= max) {
					if (isSquareNo(square)) {
						count += 2;
					}
				} else {
					break;
				}
			}
		}
		return count;
	}

	private static boolean isSquareNo(int n) {
		int sqr = (int) Math.sqrt(n);
		return sqr * sqr == n;
	}
}
