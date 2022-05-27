package javacore.algorithm.leetcode.under1900;

/*
 * Leetcode 1816
 */
public class TruncateSentence {
	public String truncateSentence(String s, int k) {
        String[] srr = s.split(" ");
        StringBuilder builder = new StringBuilder();
        boolean fistItem = true;
        for (int i = 0; i < k; i++) {
            String str = srr[i];
            if (!fistItem) {
                builder.append(" ");
            } else {
                fistItem = false;
            }
            builder.append(str);
        }
        return builder.toString();
    }
}
