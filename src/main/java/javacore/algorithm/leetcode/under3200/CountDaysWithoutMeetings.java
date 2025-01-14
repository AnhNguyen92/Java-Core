package javacore.algorithm.leetcode.under3200;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 3169. Count Days Without Meetings
 */
public class CountDaysWithoutMeetings {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
        int count = 0;
        int end = 0;
        for (int i = 0; i < meetings.length; i++) {
            int[] arr = meetings[i];
            if (arr[0] > end) {
                count += Math.min(days, arr[0]) - end - 1;
            }
            end = Math.max(arr[1], end);
            if (i == meetings.length - 1 && end < days)
                count += days - end;
        }
        return count;
    }
}
