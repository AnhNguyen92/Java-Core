package javacore.algorithm.leetcode.under1700;

/*
 * LeetCode 1608
 */
public class SpecialArrayWithXElementsGreaterThanOrEqualX {
	public int specialArray(int[] nums) {
        int[] arr = new int[1001];
        for (int i : nums) {
            for (int j = i; j >= 0; j--) {
                arr[j]++;
            }
        }
        for (int i = 1000; i >=0; i--) {
            if (i > 0 && arr[i] == i)
                return arr[i];
        }
        return -1;
    }
}
