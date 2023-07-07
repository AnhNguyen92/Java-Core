package javacore.algorithm.leetcode.under1500;

import java.util.ArrayList;
import java.util.List;
/*
 * LeetCode 1447. Simplified Fractions
 */
public class SimplifiedFractions {
	public List<String> simplifiedFractions(int n) {
		List<String> res = new ArrayList<>();
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				if (gcd(i, j) == 1) {
					res.add(j + "/" + i);
				}
			}
		}
		return res;
	}

	int gcd(int n1, int n2) {
		if (n2 == 0) {
			return n1;
		}
		return gcd(n2, n1 % n2);
	}
}
