package javacore.algorithm.leetcode.under2200;

/*
 * LeetCode 2138. Divide a String Into Groups of Size k
*/
public class DivideAStringIntoGroupsOfSizeK {
	public String[] divideString(String s, int k, char fill) {
		int len = s.length() % k == 0 ? (s.length() / k) : (s.length() / k + 1);
		String[] arr = new String[len];
		for (int i = 0; i < s.length(); i += k) {
			String str = s.substring(i, Math.min(i + k, s.length()));
			if (str.length() < k) {
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < k - str.length(); j++) {
					sb.append(fill);
				}
				sb.insert(0, str);
				arr[i / k] = sb.toString();
			} else {
				arr[i / k] = str;
			}
		}
		return arr;
	}
}
