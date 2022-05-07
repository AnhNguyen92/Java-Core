package javacore.algorithm.leetcode.under0051;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/*
 * LeetCode 12
 */

public class IntegerToRoman {
	private static Logger logger = LoggerFactory.getLogger(IntegerToRoman.class);

	public static void main(String[] args) {
		int number = 3;
		logger.info("{}", intToRoman(number));
	}

	public static String intToRoman(int num) {
		StringBuilder builder = new StringBuilder("");
		int count = 0;
		int temp;
		while (num > 0) {
			temp = num % 10;
			builder.insert(0, buildPart(temp, count));
			num /= 10;
			count++;
		}

		return builder.toString();
	}

	private static String buildPart(int temp, int count) {
		String part = "";
		if (count == 0) {
			part = buildUnderTen(temp);
		} else if (count == 1) {
			part = buildUnderHundereds(temp);
		} else if (count == 2) {
			part = buildUnderThousand(temp);
		} else { // thousand
			part = buildUnderMillion(temp);
		}

		return part;
	}

	private static String buildUnderTen(int number) {
		String romanStr = "";
		switch (number) {
		case 1:
			romanStr = "I";
			break;
		case 2:
			romanStr = "II";
			break;
		case 3:
			romanStr = "III";
			break;
		case 4:
			romanStr = "IV";
			break;
		case 5:
			romanStr = "V";
			break;
		case 6:
			romanStr = "VI";
			break;
		case 7:
			romanStr = "VII";
			break;
		case 8:
			romanStr = "VIII";
			break;
		case 9:
			romanStr = "IX";
			break;
		default: // 0
			break;
		}
		
		return romanStr;
	}

	private static String buildUnderHundereds(int number) {
		String romanStr = "";
		switch (number) {
		case 1:
			romanStr = "X";
			break;
		case 2:
			romanStr = "XX";
			break;
		case 3:
			romanStr = "XXX";
			break;
		case 4:
			romanStr = "XL";
			break;
		case 5:
			romanStr = "L";
			break;
		case 6:
			romanStr = "LX";
			break;
		case 7:
			romanStr = "LXX";
			break;
		case 8:
			romanStr = "LXXX";
			break;
		case 9:
			romanStr = "IC";
			break;
		default: // 0
			break;
		}
		
		return romanStr;
	}

	private static String buildUnderThousand(int number) {
		String romanStr = "";
		switch (number) {
		case 1:
			romanStr = "C";
			break;
		case 2:
			romanStr = "CC";
			break;
		case 3:
			romanStr = "CC";
			break;
		case 4:
			romanStr = "CD";
			break;
		case 5:
			romanStr = "D";
			break;
		case 6:
			romanStr = "DC";
			break;
		case 7:
			romanStr = "DCC";
			break;
		case 8:
			romanStr = "DCCC";
			break;
		case 9:
			romanStr = "IM";
			break;
		default: // 0
			break;
		}
		
		return romanStr;
	}

	private static String buildUnderMillion(int number) {
		String romanStr = "";
		switch (number) {
		case 1:
			romanStr = "M";
			break;
		case 2:
			romanStr = "MM";
			break;
		case 3:
			romanStr = "MMM";
			break;
		default:
			break;
		}
		
		return romanStr;
	}
	
}
