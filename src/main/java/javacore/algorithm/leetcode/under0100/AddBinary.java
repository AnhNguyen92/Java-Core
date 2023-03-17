package javacore.algorithm.leetcode.under0100;

import java.math.BigInteger;

/*
 * LeetCode 67. Add Binary
 */
public class AddBinary {
	public String addBinary(String a, String b) {
		BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);
        
        return x.add(y).toString(2);
	}
}
