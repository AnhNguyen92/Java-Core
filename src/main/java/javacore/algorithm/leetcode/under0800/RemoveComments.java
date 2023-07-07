package javacore.algorithm.leetcode.under0800;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 722. Remove Comments
 */
public class RemoveComments {

	public List<String> removeComments(String[] source) {
		List<String> lst = new ArrayList<>();
		boolean comment = false;
		boolean cont = false;
		for (String s : source) {
			if (!comment) {
				s = reduceBlock(s);
				int i = s.indexOf("/*");
				if (i >= 0) {
					comment = true;
					if (i > 0) {
						lst.add(s.substring(0, i));
						cont = true;
					}
				} else if (!s.isEmpty()) {
					lst.add(s);
				}
			} else { // da co cm nhieu dong
				int k = s.indexOf("*/");
				if (k >= 0) {
					s = s.substring(k + 2);
					comment = false;
					s = reduceBlock(s);
					int i = s.indexOf("/*");
					if (i >= 0) {
						comment = true;
						if (i > 0) {
							lst.add(s.substring(0, i));
							cont = true;
						}
					} else {
						if (!s.isEmpty()) {
							if (cont) {
								cont = false;
								String last = lst.get(lst.size() - 1);
								last += s;
								lst.remove(lst.size() - 1);
								lst.add(last);
							} else {
								lst.add(s);
							}
						}
					}
				}
			}
		}

		return lst;
	}

	private String reduceBlock(String s) {
		int i = s.indexOf("/*");
		int j = s.indexOf("//");
		if (i == j) { // no comment
			return s;
		}
		if (j >= 0 && (i == -1 || i > j)) { // line comment
			return s.substring(0, j);
		}
		// block comment
		int k = s.indexOf("*/", i + 2);
		if (k > 0) {
			s = s.substring(0, i) + s.substring(k + 2);
			return reduceBlock(s);
		}
		return s;
	}
}