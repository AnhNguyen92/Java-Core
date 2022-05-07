package javacore.algorithm.leetcode.under0300;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 202
 */
public class HappyNumber {
	public boolean isHappy(int n) {
        int result = n;
        boolean isEndlessLoop = false;
        List<Integer> list = new ArrayList<>();
        do {
            result = reduce(result);
            if (!list.contains(result)) {
                list.add(result);
            } else {
                isEndlessLoop = true;
            }
            
        } while (!isEndlessLoop && result != 1);
        
        return result == 1;
    }
    
    public int reduce(int result) {
        
        int sum = 0;
        int temp;
        while (result > 0) {
            temp = result%10;
            sum += temp * temp;
            result /= 10; 
        }
        return sum;
    }
}
