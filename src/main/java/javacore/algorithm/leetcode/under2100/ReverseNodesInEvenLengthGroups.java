package javacore.algorithm.leetcode.under2100;

import javacore.algorithm.leetcode.model.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 2074. Reverse Nodes in Even Length Groups
 */
public class ReverseNodesInEvenLengthGroups {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        List<Integer> lst = new ArrayList<>();
        lst.add(0);
        ListNode current = head;
        while (current != null) {
            lst.add(current.val);
            current = current.next;
        }
        int group = 2;
        int idx = 2;
        int n = lst.size();
        while (idx < n) {
            int end = Math.min(idx + group - 1, n - 1);
            if ( (end - idx + 1) % 2 == 0) {
                for (int i = 0; i <= (end - idx)/2; i++) {
                    int temp = lst.get(idx + i);
                    lst.set(idx + i, lst.get(end - i));
                    lst.set(end - i, temp);
                }
            }
            group++;
            idx = end + 1;
        }
        ListNode ans = null;
        for (int i = n - 1; i > 0; i--) {
            ans = new ListNode(lst.get(i), ans);
        }
        return ans;
    }
}
