package javacore.algorithm.leetcode.under1600;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * LeetCode 1592. Rearrange Spaces Between Words
 */
public class RearrangeSpacesBetweenWords {
	public String reorderSpaces(String text) {
		char[] next = new char[text.length()];
		int N = text.length();
		char[] b = text.toCharArray();
		int spCnt = 0;
		int wcnt = 0;
		List<Integer> idx = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			if (b[i] == ' ') {
				spCnt++;
			}
			if ((i > 0 && b[i - 1] == ' ' && b[i] != ' ') || (i == 0 && b[i] != ' ')) {
				wcnt++;
				idx.add(i);
			}
		}
		int sp = wcnt > 1 ? spCnt / (wcnt - 1) : 0;
		int j = 0;
		Arrays.fill(next, ' ');
		for (int i = 0; i < idx.size(); i++) {
			int s = idx.get(i);
			while (s < N && b[s] != ' ') {
				next[j++] = b[s++];
			}
			j = j + sp;
		}
		return new String(next);
	}
	
}
