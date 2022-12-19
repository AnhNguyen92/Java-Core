package javacore.algorithm.leetcode.under0300;

/*
 * Leet code 273. Integer to English Words
 */
public class IntegerToEnglishWords {

	public String numberToWords(int num) {
		if (num == 0) {
			return "Zero";
		}
		StringBuilder sb = new StringBuilder();
		int group3;
		int count = 0;
		while (num > 0) {
			group3 = num % 1000;
			String groupStr = readNoByGroup3(group3);
			if (count > 0 && !groupStr.equals("")) {
				sb.insert(0, group(count) + " ");
			}
			if (!groupStr.equals("")) {
				sb.insert(0, groupStr + " ");
			}
			num /= 1000;
			count++;
		}

		return sb.toString().trim();
	}

	private String group(int count) {
		if (count == 1) {
			return "Thousand";
		}
		if (count == 2) {
			return "Million";
		}
		if (count == 3) {
			return "Billion";
		}
		return "";
	}

	private String readNoByGroup3(int n) {
		StringBuilder sb = new StringBuilder();
		if (n / 100 > 0) {
			sb.append(readUnit(n / 100));
			sb.append(" Hundred");
		}
		if (n % 100 > 0) {
			if (sb.length() > 0) {
				sb.append(" ");
			}
			sb.append(readNoByGroup2(n % 100));
		}

		return sb.toString();
	}

	private String readNoByGroup2(int n) {
		if (n < 10) {
			return readUnit(n % 10);
		} else if (n < 20) {
			return specialCase(n);
		} else if (n % 10 == 0) {
			return readTens(n / 10);
		}
		return readTens(n / 10) + " " + readUnit(n % 10);
	}

	private String specialCase(int n) {
		switch (n) {
		case 10:
			return "Ten";
		case 11:
			return "Eleven";
		case 12:
			return "Twelve";
		case 13:
			return "Thirteen";
		case 14:
			return "Fourteen";
		case 15:
			return "Fifteen";
		case 16:
			return "Sixteen";
		case 17:
			return "Seventeen";
		case 18:
			return "Eighteen";
		case 19:
			return "Nineteen";
		default:
			return "Ten";
		}
	}

	private String readTens(int n) {
		switch (n) {
		case 2:
			return "Twenty";
		case 3:
			return "Thirty";
		case 4:
			return "Forty";
		case 5:
			return "Fifty";
		case 6:
			return "Sixty";
		case 7:
			return "Seventy";
		case 8:
			return "Eighty";
		case 9:
			return "Ninety";
		default:
			return "";
		}
	}

	private String readUnit(int n) {
		switch (n) {
		case 1:
			return "One";
		case 2:
			return "Two";
		case 3:
			return "Three";
		case 4:
			return "Four";
		case 5:
			return "Five";
		case 6:
			return "Six";
		case 7:
			return "Seven";
		case 8:
			return "Eight";
		case 9:
			return "Nine";
		default:
			return "";
		}
	}

}
