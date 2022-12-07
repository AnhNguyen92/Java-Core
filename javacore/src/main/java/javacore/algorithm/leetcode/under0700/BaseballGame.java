package javacore.algorithm.leetcode.under0700;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 682. Baseball Game
 */
public class BaseballGame {
	public int calPoints(String[] ops) {
		int sum = 0;
		List<Integer> lst = new ArrayList<>();
		for (String s : ops) {
			if (s.equals("C")) {
				sum -= lst.get(lst.size() - 1);
				lst.remove(lst.size() - 1);
			} else if (s.equals("D")) {
				sum += 2 * lst.get(lst.size() - 1);
				lst.add(lst.get(lst.size() - 1) * 2);
			} else if (s.equals("+")) {
				sum += lst.get(lst.size() - 2) + lst.get(lst.size() - 1);
				lst.add(lst.get(lst.size() - 2) + lst.get(lst.size() - 1));
			} else {
				lst.add(Integer.valueOf(s));
				sum += Integer.parseInt(s);
			}
		}
		return sum;
	}
}
