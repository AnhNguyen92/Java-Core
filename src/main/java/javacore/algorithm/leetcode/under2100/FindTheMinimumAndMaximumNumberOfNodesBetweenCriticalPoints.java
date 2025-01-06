package javacore.algorithm.leetcode.under2100;

import javacore.algorithm.leetcode.model.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 2058. Find the Minimum and Maximum Number of Nodes Between Critical Points
 */
public class FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] arr = { -1, -1 };
        int idx = 0;
        ListNode prev = null;
        List<Integer> lst = new ArrayList<>();
        while (head != null) {
            if (prev != null && head.next != null
                    && (prev.val < head.val && head.val > head.next.val
                    || prev.val > head.val && head.val < head.next.val ) ) {
                lst.add(idx);
            }
            idx++;
            prev = head;
            head = head.next;
        }
        for (int i = 1; i < lst.size(); i++) {
            int distance = lst.get(i) - lst.get(i-1);
            arr[0] = (arr[0] < 0) ? distance : Math.min(distance, arr[0]);

        }
        if (lst.size() > 1) {
            arr[1] = lst.get(lst.size() - 1) - lst.get(0);
        }
        return arr;
    }
}
