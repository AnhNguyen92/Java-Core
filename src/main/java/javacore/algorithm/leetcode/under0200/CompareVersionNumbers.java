package javacore.algorithm.leetcode.under0200;

/*
 * LeetCode 165. Compare Version Numbers
 */
public class CompareVersionNumbers {
	public int compareVersion(String version1, String version2) {
		String[] srr1 = version1.split("\\.");
		String[] srr2 = version2.split("\\.");
		int i = 0;
		int v1, v2;
		if (srr1.length < srr2.length)
			return -1;
		if (srr1.length > srr2.length)
			return 1;
		while (i < srr1.length) {
			v1 = Integer.valueOf(srr1[i]);
			v2 = Integer.valueOf(srr2[i]);
			if (v1 > v2) {
				return 1;
			}
			if (v2 > v1) {
				return -1;
			}
			i++;
		}

		return 0;
	}
}
