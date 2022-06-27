package javacore.algorithm.leetcode.under0200;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 110
 */
public class FractionToRecurringDecimal {

	public String fractionToDecimal(int numerator, int denominator) {
		if (numerator == 0) {
			return "0";
		}
		StringBuilder sb = new StringBuilder();
		if (numerator < 0 ^ denominator < 0) {
			sb.append('-');
		}
		long n = Math.abs((long) numerator);
		long d = Math.abs((long) denominator);
		sb.append(String.valueOf(n / d));
		long remind = n % d;
		if (remind == 0) {
			return sb.toString();
		}
		sb.append('.');

		Map<Long, Integer> map = new HashMap<>();
		while (remind != 0) {
			if (map.get(remind) != null) {
				sb.insert(map.get(remind), "(");
				sb.append(')');
				break;
			}
			map.put(remind, sb.length());
			remind *= 10;
			sb.append(String.valueOf(remind / d));
			remind %= d;
		}
		return sb.toString();
	}

	public String fractionToDecimal1(int numerator, int denominator) {
		if (numerator == 0) {
			return "0";
		}
		Map<Long, Long> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		long n = numerator;
		long d = denominator;
		if (n * d < 0) {
			sb.append('-');
		}
		n = Math.abs(n);
		d = Math.abs(d);
		boolean firstTime = false;
		while (n > 0 && map.get(n) == null) {
			sb.append(n / d);
			if (n % d == 0) {
				break;
			}
			if (firstTime && map.get(n) == null) {
				map.put(n, (long) (sb.length() - 1));
			}
			n %= d;
			if (!firstTime) {
				firstTime = true;
				sb.append('.');
			}
			n *= 10;
		}
		if (map.get(n) != null) {
			int dosPos = sb.indexOf(".");
			int insertPos = map.get(n).intValue();
			if (insertPos > dosPos) {
				sb.insert(insertPos, '(');
			} else {
				sb.insert(dosPos + 1, '(');
			}
			sb.append(')');
		}
		return sb.toString();
	}

}
