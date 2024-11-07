package javacore.algorithm.leetcode.under2600;

/*
 * LeetCode 2525. Categorize Box According to Criteria
 */
public class CategorizeBoxAccordingToCriteria {
	public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky = false;
        if (length >= 10000 || width >= 10000 || height >= 10000
           || (1L * length * width * height >= 1000000000L) ) {
            bulky = true;
        }
        boolean heavy = mass >= 100;
        if (bulky) {
            return (heavy ? "Both" : "Bulky");
        }
        return (heavy ? "Heavy" : "Neither");
    }
}
