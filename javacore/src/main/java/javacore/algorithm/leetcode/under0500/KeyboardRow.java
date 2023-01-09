package javacore.algorithm.leetcode.under0500;

import java.util.ArrayList;
import java.util.List;

/*
 * Leetcode 500. Keyboard Row
 */
public class KeyboardRow {
	public String[] findWords(String[] words) {
		List<String> list = new ArrayList<>();
		int l = words.length;
		for (int i = 0; i < l; i++) {
			if (inOneRow(words[i]))
				list.add(words[i]);
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
    	switch(c) {
    	case 'q':case 'Q':
    	case 'w':case 'W':
    	case 'e':case 'E':
    	case 'r':case 'R':
    	case 't':case 'T':
    	case 'y':case 'Y':
    	case 'u':case 'U':
    	case 'i':case 'I':
    	case 'o':case 'O':
    	case 'p':case 'P':
    		return 1;
    	case 'a':case 'A':
    	case 's':case 'S':
    	case 'd':case 'D':
    	case 'f':case 'F':
    	case 'g':case 'G':
    	case 'h':case 'H':
    	case 'j':case 'J':
    	case 'k':case 'K':
    	case 'l':case 'L':
    		return 2;
    	case 'z':case 'Z':
    	case 'x':case 'X':
    	case 'c':case 'C':
    	case 'v':case 'V':
    	case 'b':case 'B':
    	case 'n':case 'N':
    	case 'm':case 'M':
    		return 3;
    	}
    	return -1;
    }
}
