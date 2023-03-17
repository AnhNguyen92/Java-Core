package javacore.algorithm.leetcode.under1900;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 1823. Find the Winner of the Circular Game
*/
public class FindTheWinnerOfTheCircularGame {
	public int findTheWinner(int n, int k) {
		List<Integer> lst = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			lst.add(i);
		}
		int remove = k - 1;
		int size = n;
		for (int i = 1; i < n; i++) {
			lst.remove(remove);
			size--;
			remove = (remove + k - 1) % (size);
		}
		return lst.get(0);
	}
}
