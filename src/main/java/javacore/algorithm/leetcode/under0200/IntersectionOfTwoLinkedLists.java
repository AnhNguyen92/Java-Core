package javacore.algorithm.leetcode.under0200;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 160. Intersection of Two Linked Lists
 */
public class IntersectionOfTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        List<ListNode> lstA = new ArrayList<>();
        List<ListNode> lstB = new ArrayList<>();
        travel(lstA, headA);
        return travelAndCheck(lstB, lstA, headB);
    }
    
    private ListNode travelAndCheck(List<ListNode> lstB, List<ListNode> lstA, ListNode head) {
        if (head != null) {
            lstB.add(head);
            if (lstA.contains(head)) {
                return head;
            }
            return travelAndCheck(lstB, lstA, head.next);
        }
        return null;
    }
    
    private void travel(List<ListNode> lst, ListNode head) {
        if (head != null) {
            lst.add(head);
            travel(lst, head.next);
        }
    }
}
