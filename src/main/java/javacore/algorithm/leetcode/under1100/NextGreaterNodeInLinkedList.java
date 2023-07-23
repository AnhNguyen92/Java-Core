package javacore.algorithm.leetcode.under1100;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 1019. Next Greater Node In Linked List
 */
public class NextGreaterNodeInLinkedList {
	public int[] nextLargerNodes(ListNode head) {
        int count = 0;
        ListNode temp = head;
        List<Integer> lst = new ArrayList<>();
        while (temp != null) {
            count++;
            lst.add(temp.val);
            temp = temp.next;
        }
        int[] ans = new int[count];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < lst.size(); i++) {
            while (!stack.isEmpty() && lst.get(stack.peek()) < lst.get(i)) {
                ans[stack.pop()] = lst.get(i);
            }
            stack.add(i);
        }
        return ans;
    }
}
