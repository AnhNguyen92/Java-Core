package javacore.algorithm.leetcode.under1900;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * LeetCode 1807. Evaluate the Bracket Pairs of a String
 */
public class EvaluateTheBracketPairsOfAString {
	public String evaluate(String s, List<List<String>> knowledge) {
		Map<String, String> map = new HashMap<>();
		for (List<String> lst : knowledge) {
			map.put(lst.get(0), lst.get(1));
		}
		StringBuilder sb = new StringBuilder();
		StringBuilder res = new StringBuilder();
		boolean found = false;
		for (char c : s.toCharArray()) {
			if (c == '(') {
				found = true;
				sb = new StringBuilder();
				continue;
			} else if (c == ')') {
				found = false;
				res.append(map.getOrDefault(sb.toString(), "?"));
				sb = new StringBuilder();
				continue;
			}
			if (found) {
				sb.append(c);
			} else {
				res.append(c);
			}
		}

		return res.toString();
	}
}
