package javacore.algorithm.leetcode.under0700;

import java.util.Comparator;
import java.util.List;

/*
 * LeetCode 648. Replace Words
 */
public class ReplaceWords {
	public String replaceWords(List<String> dictionary, String sentence) {
		dictionary.sort(Comparator.comparingInt(String::length));
		String[] arr = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		boolean found;
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			found = false;
			for (String str : dictionary) {
				if (s.startsWith(str)) {
					sb.append(str);
					found = true;
					break;
				}
			}
			if (!found) {
				sb.append(arr[i]);
			}
			if (i < arr.length - 1) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}
}
