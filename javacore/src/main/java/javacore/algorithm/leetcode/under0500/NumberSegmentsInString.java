package javacore.algorithm.leetcode.under0500;

/*
 * LeetCode 434
*/
public class NumberSegmentsInString {
	public int countSegments(String s) {
        String str = s.trim();
        if (str.equals("")) return 0;
        String[] arr = str.trim().split("\\s+");
        return arr.length;
    }
}
