package javacore.algorithm.leetcode.under0051;

/*
 * LeetCode 8. String to Integer (atoi)
 */
public class StringToIntegerAtoi {
	public int myAtoi(String str) {
        if (str == null || str.isEmpty()) return 0;
    str = str.trim();
    if (str.isEmpty()) return 0;
    int idx = 0;
    int sign = 1;
    long sum = 0;
    char firstChar = str.charAt(0);
    if (firstChar == '+') {
        idx++;
    } else if (firstChar == '-') {
        sign = -1;
        idx++;
    }
    while (idx < str.length()) {
        if (!Character.isDigit(str.charAt(idx))) return (int) sum * sign;
        sum = sum * 10 + str.charAt(idx) - '0';
        if (sign == 1 && sum > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (sign == -1 && sum * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        idx++;
    }
    return (int) sum * sign;
    }
}
