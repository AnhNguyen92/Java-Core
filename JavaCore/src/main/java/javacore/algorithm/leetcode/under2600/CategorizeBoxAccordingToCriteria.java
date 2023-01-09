package javacore.algorithm.leetcode.under2600;

/*
 * Leetcode 2523. Closest Prime Numbers in Range
 */
public class CategorizeBoxAccordingToCriteria {
	public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky = false;
        if (length >= 10000 || width >= 10000 || height >= 10000
           || (1l * length * width * height >= 1000000000l) ) {
            bulky = true;
        }
        boolean heavy = mass >= 100;
        if (bulky) {
            return (heavy ? "Both" : "Bulky");
        }
        return (heavy ? "Heavy" : "Neither");
    }
}
