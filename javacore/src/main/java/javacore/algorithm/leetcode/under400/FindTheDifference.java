package javacore.algorithm.leetcode.under400;

/*
 * LeetCode 389
*/
import java.util.Arrays;

public class FindTheDifference {
	public char findTheDifference(String s, String t) {
		StringBuilder sb = new StringBuilder(sortString(s));
		StringBuilder tb = new StringBuilder(sortString(t));
		int i = 0;
		int j = 0;
		while (i < sb.length() && j < tb.length() && sb.charAt(i) == tb.charAt(j)) {
			i++;
			j++;
		}

		return tb.charAt(j);
	}

	public static String sortString(String inputString) {
		char[] tempArray = inputString.toCharArray();
		Arrays.sort(tempArray);
		return new String(tempArray);
	}
}
