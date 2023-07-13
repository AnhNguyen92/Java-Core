package javacore.algorithm.leetcode.under0500;

/*
 * LeetCode 443. String Compression
 */
public class StringCompression {
	public int compress(char[] chars) {
		int ans = 0;
        int count = 0;
        int n = chars.length;
        char c = '!';
        int cur = -1;
        for (int i = 0; i < n; i++) {
            if (chars[i] == c) {
                count++;
            } else {
                if (i != 0) {
                    ans++;
                    chars[++cur] = c;
                }
                c = chars[i];
                if (count > 1) {
                    String s = "" + count;
                    ans += s.length();
                    for (char x : s.toCharArray()) {
                        chars[++cur] = x;
                    }
                }
                count = 1;
            }
            if (i == n - 1) {
                ans++;
                chars[++cur] = c;
                if (count > 1) {
                    String s = "" + count;
                    ans += s.length();
                    for (char x : s.toCharArray()) {
                        chars[++cur] = x;
                    }
                }
            }
        }
        return ans;
	}
}
