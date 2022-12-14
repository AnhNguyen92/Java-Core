package javacore.algorithm.leetcode.under2200;

/*
 * LeetCode 2114. Maximum Number of Words Found in Sentences
 */
public class MaximumNumberOfWordsFoundInSentences {
	public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s : sentences) {
            int len = s.length();
            int count = s.replace(" ", "").length();
            if (max < (len - count)) {
                max = len - count;
            }
        }
        return max + 1;
    }
}
