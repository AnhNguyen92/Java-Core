package javacore.algorithm.leetcode.under900;

import java.util.HashSet;
import java.util.Set;

/*
 * LeetCode 804
 */
public class UniqueMorseCodeWords {
	public int uniqueMorseRepresentations(String[] words) {
		String[] MORSE = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
				".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
				"--.." };

		Set<String> seen = new HashSet<>();
		for (String word : words) {
			StringBuilder code = new StringBuilder();
			for (char c : word.toCharArray())
				code.append(MORSE[c - 'a']);
			seen.add(code.toString());
		}

		return seen.size();
	}
}
