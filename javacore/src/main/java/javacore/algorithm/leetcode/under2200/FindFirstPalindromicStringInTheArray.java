package javacore.algorithm.leetcode.under2200;

/*
 * LeetCode 2108. Find First Palindromic String in the Array
 */
public class FindFirstPalindromicStringInTheArray {
	public String firstPalindrome(String[] words) {
        String res = "";
        boolean found = false;
        int i = 0;
        while(!found && i < words.length) {
            String s = words[i];
            if (isPalindromic(s)) {
                res = s;
                found = true;
            }
            i++;
        }
        
        return res;
    }
    
    private boolean isPalindromic(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i ++) {
            if (s.charAt(i) != s.charAt(len - 1 - i))
                return false;
        }
        return true;
    }
}
