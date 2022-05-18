package javacore.algorithm.leetcode.under2000;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 1346
*/
public class CheckIfNAndItsDoubleExist {
	public boolean checkIfExist(int[] arr) {
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
