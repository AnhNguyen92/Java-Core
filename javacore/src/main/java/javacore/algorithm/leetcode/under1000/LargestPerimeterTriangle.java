package javacore.algorithm.leetcode.under1000;

import java.util.Arrays;

/*
 * Leetcode 976. Largest Perimeter Triangle
 */
public class LargestPerimeterTriangle {
	public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int sum  = 0;
        int a;
        int b;
        int c;
        for (int i = nums.length - 1; i >= 2; i--) {
            a = nums[i];
            b = nums[i-1];
            c = nums[i-2];
            if (isTriangle(a, b, c)) {
                sum = a + b + c;
                break;
            }
        }
        return sum;
    }
    
    private boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (c + b > a);
    }
}
