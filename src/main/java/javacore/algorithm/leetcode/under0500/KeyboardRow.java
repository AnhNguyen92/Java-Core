package javacore.algorithm.leetcode.under0500;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 500. Keyboard Row
 */
public class KeyboardRow {
	public String[] findWords(String[] words) {
		List<String> list = new ArrayList<>();
		int l = words.length;
        for (String word : words) {
            if (inOneRow(word))
                list.add(word);
        }
		return list.toArray(new String[list.size()]);
	}

	public static boolean inOneRow(String s) {
		int l = s.length();
		int a = whichRow(s.charAt(0));
		for (int i = 1; i < l; i++) {
			if (whichRow(s.charAt(i)) != a)
				return false;
		}
		return true;
	}
	
    public static int whichRow(char c) {
        return switch (c) {
            case 'q', 'Q', 'w', 'W', 'e', 'E', 'r', 'R', 't', 'T', 'y', 'Y', 'u', 'U', 'i', 'I', 'o', 'O', 'p', 'P' ->
                    1;
            case 'a', 'A', 's', 'S', 'd', 'D', 'f', 'F', 'g', 'G', 'h', 'H', 'j', 'J', 'k', 'K', 'l', 'L' -> 2;
            case 'z', 'Z', 'x', 'X', 'c', 'C', 'v', 'V', 'b', 'B', 'n', 'N', 'm', 'M' -> 3;
            default -> -1;
        };
    }
}
