package javacore.algorithm.leetcode.under2200;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 2194. Cells in a Range on an Excel Sheet
 */
public class CellsInARangeOnAnExcelSheet {
	char[] alpha = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
			'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

	public List<String> cellsInRange(String s) {
		char first = s.charAt(0);
		char last = s.charAt(3);
		int start = Character.getNumericValue(s.charAt(1));
		int end = Character.getNumericValue(s.charAt(4));
		List<String> ans = new ArrayList<>();
		int startChar = first - 'A';
		int endChar = last - 'A';
		for (int j = startChar; j <= endChar; j++) {
			for (int i = start; i <= end; i++) {
				StringBuilder sb = new StringBuilder();
				sb.append(alpha[j]);
				sb.append(i);
				ans.add(sb.toString());
			}

		}
		return ans;
	}
}
