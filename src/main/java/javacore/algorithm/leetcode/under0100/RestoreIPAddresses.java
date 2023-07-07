package javacore.algorithm.leetcode.under0100;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 93. Restore IP Addresses
 */
public class RestoreIPAddresses {
	List<String> ans = new ArrayList<>();

	public List<String> restoreIpAddresses(String s) {
		String[] arr = new String[4];
		traverse(s, arr, 0, 0);
		return ans;
	}

	private void traverse(String s, String[] arr, int i, int idx) {
		if (idx > 3 || i >= s.length()) {
			return;
		}
		if (idx == 3) {
			if (i >= s.length() - 3) {
				String str = s.substring(i);
				int x = Integer.parseInt(str);
				if (x <= 255 && str.equals("" + x)) {
					ans.add(arr[0] + "." + arr[1] + "." + arr[2] + "." + x);
				}
			}
		} else {
			for (int j = i + 1; j <= Math.min(s.length() - 1, i + 3); j++) {
				String str = s.substring(i, j);
				int x = Integer.parseInt(str);
				if (x <= 255 && str.equals("" + x)) {
					arr[idx] = str;
					traverse(s, arr, j, idx + 1);
				}
			}
		}
	}
}
