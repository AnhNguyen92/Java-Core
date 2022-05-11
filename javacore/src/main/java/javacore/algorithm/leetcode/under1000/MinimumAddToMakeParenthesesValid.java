package javacore.algorithm.leetcode.under1000;

/*
 * LeetCode 921
 */
public class MinimumAddToMakeParenthesesValid {
	public int minAddToMakeValid(String s) {
        boolean found = true; 
        do {
            found = false;
            int len = s.length();
            String s2 = s.replace("\\(\\)", "");
            if (len > s2.length()) {
                found = true;
                s = s2;
            }
        } while (found);
        return s.length();
    }
	
	public int minAddToMakeValid1(String s) {
        while(s.contains("()")) {
               s= s.replace("()","");
        }
        return s.length();
    }
}
