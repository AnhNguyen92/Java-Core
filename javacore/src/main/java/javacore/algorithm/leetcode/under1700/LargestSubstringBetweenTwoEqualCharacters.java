package javacore.algorithm.leetcode.under1700;

/*
 * LeetCode 1624. Largest Substring Between Two Equal Characters
 */
public class LargestSubstringBetweenTwoEqualCharacters {
	public int maxLengthBetweenEqualCharacters(String s) {
        int max = 0;
        for (char c : s.toCharArray()) {
            int first = s.indexOf(c);
            int last = s.lastIndexOf(c);
            if (max < last - first) {
                max = last - first;
            }
        }
        return max - 1;
    }
}
