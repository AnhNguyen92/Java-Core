package javacore.algorithm.leetcode.under2300;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * LeetCode 2231
 */
public class LargestNumberAfterDigitSwapsByParity {

	public int largestInteger(int num) {
		List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        int temp;
        List<Boolean> boolLst = new ArrayList<>();
        while (num > 0) {
            temp = num % 10;
            if (temp % 2 == 0) {
                even.add(temp);
                boolLst.add(true);
            } else {
                odd.add(temp);
                boolLst.add(false);
            }
            num /= 10;
        }
        int ans = 0;
        Collections.sort(odd);
        Collections.sort(even);
        int i = 0;
        int j = 0;
        for (int k = 0; k < boolLst.size(); k++) {
            if (boolLst.get(k).booleanValue()) {
                ans += (int) Math.pow(10, k) * even.get(i++);
            } else {
                ans += (int) Math.pow(10, k) * odd.get(j++);
            }
        }
        return ans;
	}
}
