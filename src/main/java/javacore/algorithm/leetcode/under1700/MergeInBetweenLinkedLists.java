package javacore.algorithm.leetcode.under1700;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 1669. Merge In Between Linked Lists
*/
public class MergeInBetweenLinkedLists {
	public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode l1Head = list1;
        while (--a > 0) {
            l1Head = l1Head.next;
        }
        
        ListNode l2Tail = list2;
        while (l2Tail != null && l2Tail.next  != null) {
            l2Tail = l2Tail.next;
        }
        ListNode l1Tail = list1;
        while (b >= 0) {
            l1Tail = l1Tail.next;
            b--;
        }
        l1Head.next = list2;
        l2Tail.next = l1Tail;
        return list1;
    }
}
