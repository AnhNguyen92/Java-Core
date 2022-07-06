package javacore.algorithm.leetcode.under0051;

/*
 * LeetCode 42
 */
public class TrappingRainWater {
	public int trap(int[] height) {
		int n = height.length;
		int[] lMax = new int[n];
		lMax[0] = height[0];
		for (int i = 1; i < n; i++) {
			lMax[i] = Math.max(lMax[i - 1], height[i]);
		}
		int[] rMax = new int[n];
		rMax[n - 1] = height[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			rMax[i] = Math.max(rMax[i + 1], height[i]);
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += Math.min(lMax[i], rMax[i]) - height[i];
		}
		
		return sum;
	}
	
	public int trap1(int[] height) {
		int l = 0;
        int r = height.length - 1;
        int sum = 0;
        int lMax = 0;
        int rMax = 0;
        while (l < r) {
            if (height[l] < height[r]) {
                if (height[l] >= lMax) {
                    lMax = height[l];
                }
                sum += lMax - height[l++];
            } else {
                if (height[r] >= rMax) {
                    rMax = height[r];
                }
                sum += rMax - height[r--];
            }
        }
        
		return sum;
    }
	
}
