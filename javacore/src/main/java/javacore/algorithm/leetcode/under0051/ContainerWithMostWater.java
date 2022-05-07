package javacore.algorithm.leetcode.under0051;

/*
 * LeetCode 11
 */
public class ContainerWithMostWater {
	public int maxArea(int[] height) {
        int maxVolume = 0;
        int tempVolume = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i+1; j < height.length; j++) {
                tempVolume = (j - i) * minInt(height[i], height[j]);
                if (tempVolume > maxVolume) {
                    maxVolume = tempVolume;
                }
            }
        }
        
        return maxVolume;
    }
    
    private int minInt(int x, int y) {
        return x <= y ? x : y;
    }
}
