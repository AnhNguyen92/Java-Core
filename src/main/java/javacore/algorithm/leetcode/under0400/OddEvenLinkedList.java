package javacore.algorithm.leetcode.under0400;

import javacore.algorithm.leetcode.model.ListNode;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 328. Odd Even Linked List
 */
public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        ListNode root = head;
        int i = 0;
        while (root != null) {
            if (i % 2 == 0) {
                even.add(root.val);
            } else {
                odd.add(root.val);
            }
            root = root.next;
            i++;
        }
        even.addAll(odd);
        ListNode ans = null;
        for (i = even.size() - 1; i >= 0; i--) {
            ans = new ListNode(even.get(i), ans);
        }

        return ans;
    }

}
