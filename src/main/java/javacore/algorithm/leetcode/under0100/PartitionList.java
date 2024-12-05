package javacore.algorithm.leetcode.under0100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 86. Partition List
 */
public class PartitionList {
	public ListNode partition(ListNode head, int x) {
		if (head == null || head.next == null) {
			return head;
		}
		List<ListNode> lst = new ArrayList<>();
		travel(lst, head);
		lst.sort((a, b) -> {
            if (a.val < x && b.val >= x) {
                return -1;
            }
            if (a.val >= x && b.val < x) {
                return 1;
            }
            return (lst.indexOf(a) - lst.indexOf(b));
        });
		ListNode ans = null;
		for (int i = lst.size() - 1; i >= 0; i--) {
			ans = new ListNode(lst.get(i).val, ans);
		}
		return ans;

	}

	private void travel(List<ListNode> lst, ListNode head) {
		if (head != null) {
			lst.add(head);
			travel(lst, head.next);
		}
	}
	
	public ListNode partition1(ListNode head, int x) {
        ListNode beforeHead = new ListNode(0);
        ListNode afterHead = new ListNode(0);
        ListNode before = beforeHead;
        ListNode after = afterHead;
        while (head != null) {
            if (head.val < x) {
                before.next = new ListNode(head.val);
                before = before.next;
            } else {
                after.next = new ListNode(head.val);
                after = after.next;
            }
            head = head.next;
        }
        before.next = afterHead.next;
        return beforeHead.next;
    }
}
