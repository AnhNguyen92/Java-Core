package javacore.algorithm.leetcode.under100;

import java.math.BigInteger;

/*
 * LeetCode 67
 */
public class AddBinary {
	public String addBinary(String a, String b) {
		BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);
        
        return x.add(y).toString(2);
	}
}
