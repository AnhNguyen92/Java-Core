package javacore.algorithm.interview;

import java.util.ArrayList;
import java.util.List;
//		// CHO 1 TAP HOP SO TU 1,2,3,4,5,6,7,8,9
//		// TAO SO CO 5 CHU     ABCDE
//		// VA 1 SO CO 4 CHU SO  FGHK
//		// HIEU CUA HAI SO: ABCDE - FGHK = 33333
//		// TIM 2 SO ABCDE VA EFGH
public class MatchingNumber {
    public static void main(String[] args) {
		System.out.println("============");
		for (int i = 10000; i <= 99999; i++) {
			for (int j = 1000; j <= 9999; j++) {
				if (i - j == 33333 && validLst(i, j)) {
					System.out.println("============");
					System.out.println(i + " - " + j + " = " + (i - j));
					System.out.println("============");
				}
			}
		}
		System.out.println("============");
	}

	private static boolean validLst(int a, int b) {
		List<Integer> compare = new ArrayList<>();
		while (a > 0) {
			if (!compare.contains(a % 10)) {
				compare.add(a % 10);
			}
			a /= 10;
		}
		while (b > 0) {
			if (!compare.contains(b % 10)) {
				compare.add(b % 10);
			}
			b /= 10;
		}
		return compare.size() == 9 && !compare.contains(0);
	}
	
}
