package javacore.algorithm.leetcode.under0051;

/*
 * LeetCode 6
 */
public class ZigzagConversion {
	public String convert(String s, int numRows) {
		if (numRows == 1) {
			return s;
		}
		char[][] arr = new char[numRows][s.length()];
		StringBuilder sb = new StringBuilder();
		int i = 0;
		int j = 0;
		int k = 0;
		while (k < s.length()) {
			arr[i][j] = s.charAt(k++);
			if (j % (numRows - 1) == 0 && i < numRows - 1) {
				i++;
			} else {
				i--;
				j++;
			}
		}
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				if (arr[i][j] != '\u0000') {
					sb.append(arr[i][j]);
				}
			}
		}
		return sb.toString();
	}
}
