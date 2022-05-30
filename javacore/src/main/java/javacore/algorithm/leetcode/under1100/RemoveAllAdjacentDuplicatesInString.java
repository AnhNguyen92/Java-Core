package javacore.algorithm.leetcode.under1100;

/*
 * LeetCode 1047
 */
public class RemoveAllAdjacentDuplicatesInString {
	public String removeDuplicates(String S) {
        if (S.length() <= 1)
            return S;
        char[] chs = S.toCharArray();
        int pos = -1;
        for (int i = 0; i < S.length(); i++) {
            if (pos == -1 || chs[pos] != chs[i])
                chs[++pos] = chs[i];
            else
                pos--;
        }
        return new String(chs, 0, pos + 1);
    }
}
