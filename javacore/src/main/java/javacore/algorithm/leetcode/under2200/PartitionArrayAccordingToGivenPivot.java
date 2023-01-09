package javacore.algorithm.leetcode.under2200;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 2161. Partition Array According to Given Pivot
 */
public class PartitionArrayAccordingToGivenPivot {
	public int[] pivotArray(int[] nums, int pivot) {
        int[] arr = new int[nums.length];
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        int j = 0;
        for (int i : nums) {
            if (i < pivot) {
                arr[j++] = i;
            } else if (i == pivot) {
                equal.add(i);
            } else {
                greater.add(i);
            }
        }
        for (Integer i : equal) {
            arr[j++] = i;
        }
        for (Integer i : greater) {
            arr[j++] = i;
        }
        return arr;
	}
}
