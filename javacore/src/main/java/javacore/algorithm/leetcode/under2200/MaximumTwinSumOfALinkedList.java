package javacore.algorithm.leetcode.under2200;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 2130
 */
public class MaximumTwinSumOfALinkedList {
	public int pairSum(ListNode head) {
        List<Integer> lst = new ArrayList<>();
        travel(lst, head);
        int n = lst.size();
        int max = 0;
        for (int i = 0; i < n/2; i++) {
            max = Math.max(max, lst.get(i) + lst.get(n - 1 - i));
        }
        return max;
    }
    
    private void travel(List<Integer> lst, ListNode head) {
        if (head != null) {
            lst.add(head.val);
            travel(lst, head.next);
        } 
    }
}
