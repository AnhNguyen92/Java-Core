package javacore.algorithm.leetcode.under1100;

/*
 * LeetCode 1009. Complement of Base 10 Integer
 */
public class ComplementOfBase10Integer {
	public int bitwiseComplement(int n) {
        String nBinary = Integer.toBinaryString(n);
        StringBuilder s = new StringBuilder("");
        for (char c : nBinary.toCharArray()) {
            if (c == '1') s.append(0);
            else s.append(1);
        }
        return Integer.parseInt(s.toString(), 2);
    }
}
