package javacore.algorithm.leetcode.under1400;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Leetcode 1389
 */

public class CreateTargetArrayInTheGivenOrder {
    private static final Logger logger = LoggerFactory.getLogger(CreateTargetArrayInTheGivenOrder.class);

    public static void main(String[] args) {
        int[] nums = new int[] { 0, 1, 2, 3, 4 };
        int[] index = new int[] { 0, 1, 2, 2, 1 };
        
        int[] res = createTargetArray(nums, index);
        for (int i = 0; i < res.length; i++) {
            logger.info("{}", res[i]);
        }
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            for (int j = res.length - 1; j > index[i]; j--) {
                res[j] = res[j - 1];
            }
            res[index[i]] = nums[i];
        }
        return res;
    }
}
