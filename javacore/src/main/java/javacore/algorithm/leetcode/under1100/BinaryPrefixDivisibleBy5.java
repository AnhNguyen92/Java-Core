package javacore.algorithm.leetcode.under1100;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 1018
 */
public class BinaryPrefixDivisibleBy5 {
	public List<Boolean> prefixesDivBy5(int[] arr) {
        int reminder = 0;
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            reminder = 2 * reminder + arr[i];
            list.add(reminder % 5 == 0);
            reminder %= 5;
        }
        return list;
    }
}
