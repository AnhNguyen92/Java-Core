package javacore.algorithm.leetcode.under3000;

/**
 * 2917. Find the K-or of an Array
 */
public class FindTheKOrOfAnArray {
    public int findKOr(int[] nums, int k) {
        int[] arr = new int[32];
        for (int num : nums) {
            String s = Integer.toBinaryString(num);
            for (int j = s.length() - 1; j >= 0; j--) {
                if (s.charAt(j) == '1')
                    arr[31 - (s.length() - 1 - j)]++;
            }
        }
        boolean found = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            sb.append(arr[i] >= k ? 1 : 0);
        }
        return Integer.valueOf(sb.toString(), 2);
    }
}
