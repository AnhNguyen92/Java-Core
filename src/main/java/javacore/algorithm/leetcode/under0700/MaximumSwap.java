package javacore.algorithm.leetcode.under0700;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 670. Maximum Swap
 */
public class MaximumSwap {
	public int maximumSwap(int num) {
		List<Integer> lst = new ArrayList<>();
		while (num > 0) {
			lst.add(0, num % 10);
			num /= 10;
		}
		boolean found = false;
		int max;
		int b = 0;
		int i = 0;
		while (!found && i < lst.size()) {
			max = lst.get(i);
			b = i;
			for (int j = i + 1; j < lst.size(); j++) {
				if (lst.get(j) > max || (lst.get(j) == max && max > lst.get(i))) {
					found = true;
					b = j;
					max = lst.get(j);
				}
			}
			if (found) {
				int x = lst.get(i);
				lst.set(i, lst.get(b));
				lst.set(b, x);
				break;
			}
			i++;
		}
		int n = 0;
		for (int x : lst) {
			n = n * 10 + x;
		}
		return n;
	}
}
