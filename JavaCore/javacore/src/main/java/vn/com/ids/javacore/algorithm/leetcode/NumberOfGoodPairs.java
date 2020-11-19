package vn.com.ids.javacore.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * LeetCode 1512
*/

public class NumberOfGoodPairs {
    private static final Logger logger = LoggerFactory.getLogger(NumberOfGoodPairs.class);

    public static void main(String[] args) {
        int[] nums = new int[] { 6,5,1,5,7,7,9,1,5,7,1,6,10,9,7,4,1,8,7,1,1,8,6,4,7,4,10,5,3,9,10,1,9,5,5,4,1,7,4,2,9,2,6,6,4,2,10,3,5,3,6,4,7,4,6,4,4,6,3,4,10,1,10,6,10,4,9,6,6,4,8,6,9,5,4 };
        int shuffle = numIdenticalPairs(nums);
        logger.info("{}", shuffle);
    }

    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int sum = 0;
        for (Integer v : map.values()) {
            int count = v * (v-1);
            sum += count/2;
        }
        return sum;
    }
    
}
