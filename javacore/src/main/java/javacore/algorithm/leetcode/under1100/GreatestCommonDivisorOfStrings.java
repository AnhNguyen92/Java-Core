package javacore.algorithm.leetcode.under1100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * LeetCode 1071
 */
public class GreatestCommonDivisorOfStrings {
	public String gcdOfStrings(String str1, String str2) {
		int a = str1.length();
		int b = str2.length();
		List<Integer> lst = commDiv(a, b);
		for (Integer i : lst) {
			String s1 = str1.substring(0, i);
			if (s1.repeat(a / i).equals(str1) && s1.repeat(b / i).equals(str2)) {
				return s1;
			}
		}
		return "";
	}

	private int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	private List<Integer> commDiv(int a, int b) {
		int n = gcd(a, b);
		List<Integer> lst = new ArrayList<>();
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (n / i == i) {
					lst.add(i);
				} else {
					lst.add(i);
					lst.add(n / i);
				}
			}
		}
		Collections.sort(lst, Comparator.reverseOrder());
		return lst;
	}

}
