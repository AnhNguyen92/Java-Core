package vn.com.ids.javacore.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * LeetCode 1346
*/

public class CheckIfNAndItsDoubleExist {
    private static final Logger logger = LoggerFactory.getLogger(CheckIfNAndItsDoubleExist.class);

    public static void main(String[] args) {
        int[] arr = new int[] { 10, 2, 5, 3 };
        logger.info("{}", checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        boolean isdouble = false;
        for (int i = 0; i < arr.length; i++) {
            if ((map.containsKey(2 * arr[i])) || (arr[i] % 2 == 0 && map.containsKey(arr[i] / 2))) {
                isdouble = true;
                break;
            } else {
                map.put(arr[i], 1);
            }
        }
        return isdouble;
    }
}
