package javacore.algorithm.leetcode.under1900;

/*
 * LeetCode 1859. Sorting the Sentence
 */
public class SortingTheSentence {
	public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] tempArr = new String[arr.length];
        for (String str : arr) {
            String s1 = str.substring(0, str.length() - 1);
            int i = Integer.parseInt(str.substring(str.length() - 1, str.length()));
            tempArr[i - 1] = s1;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : tempArr) {
            sb.append(str).append(" ");
        }
        return sb.toString().trim();
    }
}
