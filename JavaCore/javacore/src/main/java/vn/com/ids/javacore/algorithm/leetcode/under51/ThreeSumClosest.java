package vn.com.ids.javacore.algorithm.leetcode.under51;

/*
 * Leetcode 16
 */

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = new int[] { -1, 2, 1, -4 };
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int nearestSum = Integer.MIN_VALUE;
        int tempSum;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    tempSum = nums[i] + nums[j] + nums[k];
                    if (Math.abs((long) target - tempSum) < Math.abs((long) target - nearestSum)) {
                        nearestSum = tempSum;
                    }
                }
            }
        }

        return nearestSum;
    }

}
