package javacore.algorithm.leetcode.under0800;

/*
 * LeetCode 788
 */
public class RotatedDigits {
	public int rotatedDigits(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (good(i)) {
				count++;
			}
		}
		return count;
	}

	private boolean good(int x) {
		int y;
		boolean rotated = false;
		while (x > 0) {
			y = x % 10;
			switch (y) {
			case 0:
			case 1:
			case 8:
				break;
			case 2:
			case 5:
			case 6:
			case 9:
				rotated = true;
				break;
			default:
				return false;
			}
			x = x / 10;
		}
		return rotated;
	}
}
