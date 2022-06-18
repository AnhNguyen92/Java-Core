package javacore.algorithm.leetcode.under0400;

import java.math.BigInteger;

/*
 * LeetCode 372
 */
public class SuperPow {

	public int superPow(int a, int[] b) {
		BigInteger bigInteger = new BigInteger("" + a);
		bigInteger = bigInteger.modPow(new BigInteger(buildArr(b)), new BigInteger("" + 1337));
		return bigInteger.intValue();
	}
	
	private String buildArr(int[] b) {
		StringBuilder sb = new StringBuilder();
		for (int i : b) {
			sb.append(i);
		}
		return sb.toString();
	}
}
