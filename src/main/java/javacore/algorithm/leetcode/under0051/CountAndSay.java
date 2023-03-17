package javacore.algorithm.leetcode.under0051;

/*
 * LeetCode 38. Count and Say
 */
public class CountAndSay {

	public String countAndSay(int n) {
		if (n == 1) {
			return "1";
		}
		StringBuilder builder = new StringBuilder("");
		String previous = countAndSay(n - 1);
		int i = 0;
		int j = 0;
		while (i < previous.length()) {
			j = i;
			while (j < previous.length() && previous.charAt(i) == previous.charAt(j)) {
				j++;
			}

			builder.append(j - i);
			builder.append(previous.charAt(i));
			i = j;
		}

		return builder.toString();
	}

}
