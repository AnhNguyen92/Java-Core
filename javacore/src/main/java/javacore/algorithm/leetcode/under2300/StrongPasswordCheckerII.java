package javacore.algorithm.leetcode.under2300;

/*
 * LeetCode 2299. Strong Password Checker II
 */
public class StrongPasswordCheckerII {
	public boolean strongPasswordCheckerII(String password) {
		boolean lowercase = false;
		boolean uppercase = false;
		boolean digit = false;
		boolean specialChar = false;
		boolean duplicate = false;
		if (password.length() >= 8) {
			String specialStr = "!@#$%^&*()-+";
			char c;
			for (int i = 0; i < password.length(); i++) {
				c = password.charAt(i);
				if (Character.isLowerCase(c)) {
					lowercase = true;
				} else if (Character.isUpperCase(c)) {
					uppercase = true;
				} else if (Character.isDigit(c)) {
					digit = true;
				} else if (specialStr.indexOf(c) >= 0) {
					specialChar = true;
				}
				if (i > 0 && c == password.charAt(i - 1)) {
					duplicate = true;
					break;
				}
			}
		}

		return lowercase && uppercase && digit && specialChar && !duplicate;
	}
}