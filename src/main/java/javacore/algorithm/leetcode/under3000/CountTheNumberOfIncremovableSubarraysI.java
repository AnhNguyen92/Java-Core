package javacore.algorithm.leetcode.under3000;

/**
 * 2970. Count the Number of Incremovable Subarrays I
 */
public class CountTheNumberOfIncremovableSubarraysI {
    public int incremovableSubarrayCount(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                boolean valid = true;
                int prev = 0;
                int k = (i > 0) ? 0 : (j + 1);
                for (; k < nums.length; k++) {
                    if (k == i) {
                        k = j;
                        continue;
                    }
                    if (prev < nums[k]) {
                        prev = nums[k];
                    } else {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    count++;
                    System.out.println(i + ", " + j);
                }
            }
        }
        return count;
    }
}
