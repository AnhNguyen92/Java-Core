package javacore.algorithm.leetcode.under1600;

/*
 * LeetCode 1556. Thousand Separator
 */
public class ThousandSeparator {
	public String thousandSeparator(int n) {
		if (n < 999)
			return Integer.toString(n);

		String s = Integer.toString(n);
		StringBuilder sb = new StringBuilder(s);
		for (int i = sb.length() - 3; i >= 0; i = i - 3) {
			sb.insert(i, '.');
		}
		if (sb.charAt(0) == '.')
			sb.deleteCharAt(0);
		return sb.toString();
	}

	public String thousandSeparator1(int n) {
		if (n == 0)
			return "0";
		int index = 0;
		StringBuilder res = new StringBuilder();
		while (n != 0) {
			if (index != 0 && index % 3 == 0)
				res.insert(0, '.');

			res.insert(0, n % 10);
			index++;
			n = n / 10;
		}
		return res.toString();
	}
}
