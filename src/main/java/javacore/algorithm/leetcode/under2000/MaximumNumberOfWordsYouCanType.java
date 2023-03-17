package javacore.algorithm.leetcode.under2000;

/*
 * LeetCode 1935. Maximum Number of Words You Can Type
 */
public class MaximumNumberOfWordsYouCanType {
	public int canBeTypedWords(String text, String brokenLetters) {
        char[] carr = brokenLetters.toCharArray();
        String[] sarr = text.split(" ");
        boolean found;
        int count = 0;
        for (String s : sarr) {
            found = false;
            for (char c : carr) {
                if (s.indexOf(c) >= 0) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                count++;
            }
        }
        return count;
    }
}
