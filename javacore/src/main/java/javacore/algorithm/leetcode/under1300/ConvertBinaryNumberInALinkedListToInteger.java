package javacore.algorithm.leetcode.under1300;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * Leetcode 1290. Convert Binary Number in a Linked List to In
 */
public class ConvertBinaryNumberInALinkedListToInteger {
	public int getDecimalValue(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }
        int result = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            result += list.get(i) * (int) Math.pow(2, list.size() - 1 - i);
        }
        return result;
    }
}
