package javacore.algorithm.leetcode.under1500;

import java.util.Arrays;

/*
 * LeetCode 1465. Maximum Area of a Piece of Cake After Horizontal and Vertical Cuts
 */
public class MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts {
	public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
		Arrays.sort(horizontalCuts);
		Arrays.sort(verticalCuts);
		int m = horizontalCuts.length;
		long a = max(horizontalCuts[0], (long) h - horizontalCuts[m - 1]);
		for (int i = 0; i < m - 1; i++) {
			if (a < horizontalCuts[i + 1] - horizontalCuts[i]) {
				a = (long) horizontalCuts[i + 1] - horizontalCuts[i];
			}
		}
		int n = verticalCuts.length;
		long b = max(verticalCuts[0], (long) w - verticalCuts[n - 1]);
		for (int i = 0; i < n - 1; i++) {
			if (b < (long)  verticalCuts[i + 1] - verticalCuts[i]) {
				b = (long) verticalCuts[i + 1] - verticalCuts[i];
			}
		}
		return modulo(a, b);
	}

	private int modulo(long a, long b) {
		long res = 0;
		long mod = 1000000007;
		a %= mod;

		while (b > 0) {
			if ((b & 1) > 0) {
				res = (res + a) % mod;
			}
			a = (2 * a) % mod;

			b >>= 1;
		}
		return (int) res;
	}

	public static long max(long a, long b) {
		return (a >= b) ? a : b;
	}

}
