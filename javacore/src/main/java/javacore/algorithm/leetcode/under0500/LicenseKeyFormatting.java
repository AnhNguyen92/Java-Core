package javacore.algorithm.leetcode.under0500;

/*
 * Leetcode 482. License Key Formatting
 */
public class LicenseKeyFormatting {
	public String licenseKeyFormatting(String s, int k) {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != '-') {
				count++;
				sb.insert(0, s.charAt(i));
			}
			if (count == k) {
				count = 0;
				sb.insert(0, '-');
			}
		}
		String result = sb.toString().toUpperCase();
		if (result.startsWith("-")) {
			result = result.replaceFirst("-", "");
		}
		return result;
	}
}
