package javacore.algorithm.leetcode.under0900;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 870. Advantage Shuffle
 */
public class AdvantageShuffle {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[][] nums3 = new int[n][2];
        for (int i = 0; i < n; i++) {
            nums3[i] = new int[]{i, nums2[i]};
        }
        Arrays.sort(nums1);
        Arrays.sort(nums3, (a, b) -> {
            if (a[1] != b[1])
                return a[1] - b[1];
            return a[0] - b[0];
        });
        int[] arr = new int[n];
        Arrays.fill(arr, -1);
        List<Integer> lst = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n && j < n) {
            if (nums1[i] <= nums3[j][1]) {
                lst.add(nums1[i++]);
            } else {
                arr[nums3[j++][0]] = nums1[i++];
            }
        }
        int idx = 0;
        for (int x = 0; x < n; x++)
            if (arr[x] == -1)
                arr[x] = lst.get(idx++);
        return arr;
    }
}
