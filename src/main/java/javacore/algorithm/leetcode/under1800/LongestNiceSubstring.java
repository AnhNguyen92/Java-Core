package javacore.algorithm.leetcode.under1800;

/*
 * LeetCode 1763. Longest Nice Substring
 */
public class LongestNiceSubstring {
	public String longestNiceSubstring(String s) {
        int max = 0;
		String ans = "";
		for (int i = 0; i <= s.length(); i++) {
			for (int j = s.length(); j > i; j--) {
				if (j - i > max) {					
					String substring = s.substring(i, j);
					boolean found = isNiceStr(substring);
					if (found && max < substring.length()) {
						max = substring.length();
						ans = substring;
					}
				}
			}
		}
        return ans;
    }
    
    private boolean isNiceStr(String s) {
		int[][] arr = new int[26][2];
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c - 'A' <= 25) {
				arr[c - 'A'][0] = 1;
			} else {
				arr[c - 'A' - 32][1] = 1;
			}
		}
		for (int[] row : arr) {
			if (row[0] + row[1] == 1) {
				return false;
			}
		}
		return true;
	}
}
