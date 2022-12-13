package javacore.algorithm.leetcode.under2100;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 2094. Finding 3-Digit Even Numbers
*/
public class Finding3DigitEvenNumbers {
	public int[] findEvenNumbers(int[] digits) {
        int[] nums = new int[10];
        for (int i : digits) {
            nums[i]++;
        }
        int ii = 1;
        while (ii < 10 && nums[ii] == 0) {
            ii++;
        }
        int min = ii;
        ii = 9;
        while (ii > 0 && nums[ii] == 0) {
            ii--;
        }
        int max = ii;
        List<Integer> lst = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (nums[i] > 0) {
                nums[i]--;
                for (int j = 0; j <= 9; j++) {
                    if (nums[j] > 0) {
                        nums[j]--;
                        for (int k = 0; k <= 8; k+=2) {
                            if (nums[k] > 0) {
                                lst.add(100*i + 10 * j + k);
                            }
                        }
                        nums[j]++;
                    }
                }
                nums[i]++;
            }
        }
        return lst.stream().mapToInt(Integer::intValue).toArray();
    }
}
