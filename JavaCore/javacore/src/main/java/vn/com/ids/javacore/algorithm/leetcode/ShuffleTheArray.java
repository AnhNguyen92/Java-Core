package vn.com.ids.javacore.algorithm.leetcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * LeetCode 1431
*/

public class ShuffleTheArray {
    private static final Logger logger = LoggerFactory.getLogger(ShuffleTheArray.class);

    public static void main(String[] args) {
        int[] nums = new int[] { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int[] shuffle = shuffle(nums, n);
        logger.info("{}", shuffle);
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] shuffle = new int[nums.length];
        int i = 0;
        int j = n;
        for (int k = 0; k < nums.length; k++) {
            if (k % 2 == 0) {
                shuffle[k] = nums[i++];
            } else {
                shuffle[k] = nums[j++];
            }
        }
        return shuffle;
    }

}
