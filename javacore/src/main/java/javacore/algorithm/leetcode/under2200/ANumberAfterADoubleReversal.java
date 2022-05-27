package javacore.algorithm.leetcode.under2200;

/*
 * LeetCode 2119
 */
public class ANumberAfterADoubleReversal {
	public boolean isSameAfterReversals(int num) {
		String s = "" + num;
		s = new StringBuilder(s).reverse().toString();
		int n = Integer.parseInt(s);
		s = new StringBuilder("" + n).reverse().toString();
		return num == Integer.valueOf(s);
	}

	public boolean isSameAfterReversals1(int num) {
		int temp = num;
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		int rev2 = 0;
		while (rev > 0) {
			rev2 = rev2 * 10 + rev % 10;
			rev /= 10;
		}
		return rev2 == temp;
	}

}
