package javacore.algorithm.leetcode.under0051;

import java.util.HashSet;
import java.util.Set;

/*
 * LeetCode 3
 */
public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int len;
        for (int i = 0; i < s.length(); i++) {
            set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                len = set.size();
                set.add(s.charAt(j));
                if (set.size() == len) {
                    break;
                }
            }
            if (set.size() > max) {
                max = set.size();
                
            }
        }
        return max;
    }
	
	public static void main(String[] args) {
		int x = 123;
		int a = x >= 0 ? reverse(x) : (0-reverse(-1 * x));
		System.out.println(a);
	}

	private static int reverse(int x) {
		int a = 0;
		while (x > 0) {
			a = a * 10 + x % 10;
			x /= 10;
		}
		return a;
	}
}
