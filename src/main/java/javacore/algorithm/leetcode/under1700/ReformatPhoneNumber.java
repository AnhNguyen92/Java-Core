package javacore.algorithm.leetcode.under1700;

/*
 * LeetCode 1694. Reformat Phone Number
 */
public class ReformatPhoneNumber {
	public String reformatNumber(String number) {
		StringBuilder sb = new StringBuilder();
		for (char c : number.toCharArray()) {
			if (c >= '0' && c <= '9') {
				sb.append(c);
			}
		}
		int remainingLength = sb.length();
		int index = 0;
		while (remainingLength > 4) {
			sb.insert(index + 3, '-');
			index += 4;
			remainingLength -= 3;
		}

		switch (remainingLength) {
		case 2:
		case 3:
			break;
		case 4:
			index += 2;
			sb.insert(index, '-');
			break;
		default:
		}

		return sb.toString();
	}
}