package javacore.algorithm.leetcode.under1400;

public class DecryptStringFromAlphabetToIntegerMapping {
	public String freqAlphabets(String s) {
		char[] alpha = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		char[] inArr = s.toCharArray();
		StringBuilder str = new StringBuilder();
		int i = 0;
		while (i < inArr.length) {
			if (i < inArr.length - 2 && inArr[i + 2] == '#') {
				int one = Character.getNumericValue(inArr[i]);
				int two = Character.getNumericValue(inArr[i + 1]);
				int curInt = (one * 10 + two) - 1;
				str.append(alpha[curInt]);
				i = i + 3;
			} else {
				int curInt = Character.getNumericValue(inArr[i]) - 1;
				str.append(alpha[curInt]);
				i++;
			}

		}
		return str.toString();
	}
}
