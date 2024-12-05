package javacore.algorithm.leetcode.under2400;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 2325. Decode the Message
 */
public class DecodeTheMessage {
	public String decodeMessage(String key, String message) {
		Map<Character, Character> map = new HashMap<>();
		int j = 0;
		map.put(' ', ' ');
		for (int i = 0; i < key.length(); i++) {
			char c = key.charAt(i);
			if (map.get(c) == null) {
				map.put(c, (char) (97 + j++));
			}
		}

		StringBuilder sb = new StringBuilder();
		for (char c : message.toCharArray()) {
			sb.append(map.get(c));
		}
		return sb.toString();
	}

	public String decodeMessage1(String key, String message) {
		char[] crr = new char[26];
		int j = 0;
		for (int i = 0; i < key.length(); i++) {
			char c = key.charAt(i);
			if (c == ' ')
				continue;
			int k = c - 'a';
			if (k >= 0 && k <= 25 && crr[k] == '\u0000')
				crr[k] = (char) (97 + j++);
		}

		StringBuilder sb = new StringBuilder();
		for (char c : message.toCharArray()) {
			if (c != ' ') {
				sb.append(crr[c - 'a']);
			} else {
				sb.append(' ');
			}
		}
		return sb.toString();
	}
}
