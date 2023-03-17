package javacore.algorithm.leetcode.under1500;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 1414. Find the Minimum Number of Fibonacci Numbers Whose Sum Is K
 */
public class FindTheMinimumNumberOfFibonacciNumbersWhoseSumIsK {
	public int findMinFibonacciNumbers(int k) {
        List<Integer> lst = initFibonacci(k);
        if (lst.get(lst.size() - 1).intValue() == k) {
            return 1;
        }
        int count = 0;
        int i = lst.size() - 1;
        int val;
        while (k > 0) {
            val = lst.get(i).intValue();
            if (k >= val) {
                k -= val;
                count++;
            }
            i--;
        }
        return count;
    }

    private List<Integer> initFibonacci(int k) {
        List<Integer> lst = new ArrayList<>();
        int f1 = 1;
        int f2 = 1;
        lst.add(1);
        lst.add(1);
        int temp = f1 + f2;
        while (temp <= k) {
            temp = f1 + f2;
            f1 = f2;
            f2 = temp;
            lst.add(temp);
        }
        return lst;
    }
}
