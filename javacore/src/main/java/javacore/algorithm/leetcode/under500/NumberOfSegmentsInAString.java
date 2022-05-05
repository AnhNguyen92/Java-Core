package javacore.algorithm.leetcode.under500;

/*
 * Leetcode 434
 */
public class NumberOfSegmentsInAString {
	public int countSegments(String s) {
        String str = s.trim();
        if (str.equals("")) return 0;
        String[] arr = str.trim().split("\\s+");
        return arr.length;
    }
}
