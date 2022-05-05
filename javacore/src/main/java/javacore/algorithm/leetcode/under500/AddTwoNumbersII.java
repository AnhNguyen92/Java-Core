package javacore.algorithm.leetcode.under500;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * Leetcode 445
 */
public class AddTwoNumbersII {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode ln1 = reveseList(l1);
		ListNode ln2 = reveseList(l2);

		ListNode ans = null;
		int a = 0;
		int b = 0;
		int sum = 0;
		int reminder = 0;
		while (ln1 != null || ln2 != null) {
			a = 0;
			b = 0;
			if (ln1 != null) {
				a = ln1.val;
				ln1 = ln1.next;
			}
			if (ln2 != null) {
				b = ln2.val;
				ln2 = ln2.next;
			}
			sum = a + b + reminder;
			reminder = sum / 10;
			if (sum >= 10) {
				sum -= 10;
			}
			ans = new ListNode(sum, ans);
		}
		if (reminder > 0) {
			ans = new ListNode(reminder, ans);
		}
		return ans;
	}

	private ListNode reveseList(ListNode l1) {
		ListNode ln1 = null;
		while (l1 != null) {
			ln1 = new ListNode(l1.val, ln1);
			l1 = l1.next;
		}
		return ln1;
	}
}
