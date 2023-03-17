package javacore.algorithm.leetcode.under0100;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 92. Reverse Linked List II
 */
public class ReverseLinkedListII {
	public ListNode reverseBetween(ListNode head, int left, int right) {
        swap(head, 0, left - 1, right - 1);
        return head;
    }
    
    private void swap(ListNode root, int height, int left, int right) {
        if (height < left) {
            swap(root.next, height + 1, left, right);
        } else if (left < right) {
            ListNode second = root;
            int k = left;
            while (k < right) {
                second = second.next;
                k++;
            }
            int temp = root.val;
            root.val = second.val;
            second.val = temp;
            swap(root.next, height + 1, left + 1, right - 1);
        }
    }
}
