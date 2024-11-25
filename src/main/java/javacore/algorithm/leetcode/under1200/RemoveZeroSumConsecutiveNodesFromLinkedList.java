package javacore.algorithm.leetcode.under1200;

import javacore.algorithm.leetcode.model.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 1171. Remove Zero Sum Consecutive Nodes from Linked List
 */
public class RemoveZeroSumConsecutiveNodesFromLinkedList {
    public ListNode removeZeroSumSublists(ListNode head) {
        List<Integer> lst = new ArrayList<>();
        while (head != null) {
            lst.add(head.val);
            head = head.next;
        }
        removeSumZero(lst);
        ListNode ans = null;
        for (int i = lst.size() - 1; i >= 0; i--) {
            ans = new ListNode(lst.get(i), ans);
        }
        return ans;
    }

    public void removeSumZero(List<Integer> nums) {
        boolean found;
        do {
            found = false;
            for (int i = 0; i < nums.size(); i++) {
                int sum = 0;
                for (int j = i; j < nums.size(); j++) {
                    sum += nums.get(j);
                    if (sum == 0) {
                        nums.subList(i, j + 1).clear();
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
        } while (found);
    }
}
