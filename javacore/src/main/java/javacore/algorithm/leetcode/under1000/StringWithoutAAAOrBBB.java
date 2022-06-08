package javacore.algorithm.leetcode.under1000;

/*
 * LeetCode 984
 */
public class StringWithoutAAAOrBBB {
	public String strWithout3a3b(int a, int b) {
		if (a == b)
			return "ab".repeat(b);

		if (a > b) {
			return buildData(a, b, "aaa", "aa", "a", 'b');
		}
		return buildData(b, a, "bbb", "bb", "b", 'a');
	}

	private static String buildData(int a, int b, String triple, String dup, String single, char c) {
		StringBuilder sb = new StringBuilder();
		sb.append(single.repeat(a));
		int i;
		while (sb.indexOf(triple) >= 0 && b-- > 0) {
			i = sb.indexOf(triple);
			sb.insert(i + 2, c);
		}
		while (b-- > 0) {
			i = sb.indexOf(dup);
			sb.insert(i + 1, c);
		}
		while (b-- > 0) {
			i = sb.indexOf(single);
			sb.insert(i + 1, c);
		}
		return sb.toString();
	}
}
