package javacore.algorithm.leetcode.under0200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 147. Insertion Sort List
 */
public class InsertionSortList {
	public ListNode insertionSortList(ListNode head) {
        List<Integer> lst = new ArrayList<>();
        while (head != null) {
            lst.add(head.val);
            head = head.next;
        }
        Collections.sort(lst);
        ListNode ans = null;
        for (int i = lst.size() - 1; i >= 0; i--) {
            ans = new ListNode(lst.get(i), ans);
        }
        return ans;
    }
}
