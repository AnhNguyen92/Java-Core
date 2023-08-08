package javacore.algorithm.leetcode.under2700;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class MakeArrayEmpty {
	public static void main(String[] args) {
		MakeArrayEmpty arrayEmpty = new MakeArrayEmpty();
		int[] nums = new int[] {-315,180,-613,-886,-903,336,-463};
		System.out.println(arrayEmpty.countOperationsToEmptyArray(nums));
	}
	
	public long countOperationsToEmptyArray(int[] nums) {
		List<Integer> lst = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        long ans = 0;
        for (int i : nums) {
        	lst.add(i);
        	deque.add(i);
        }
        Collections.sort(lst);
        int i = 0;
        while (!deque.isEmpty()) {
        	while (deque.peek().intValue() != lst.get(i).intValue()) {
            	ans++;
            	deque.addLast(deque.poll());
            }
        	deque.poll();
        	i++;
        	ans++;
        }
        
        return ans;
    }
}
