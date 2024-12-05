package javacore.algorithm.leetcode.under0800;

/*
 * LeetCode 744. Find Smallest Letter Greater Than Target
 */
public class FindSmallestLetterGreaterThanTarget {
	public char nextGreatestLetter(char[] letters, char target) {
        for (char letter : letters) {
            if (letter > target) return letter;
        }
        
        return letters[0];
    }
}
