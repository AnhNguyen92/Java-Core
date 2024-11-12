package javacore.algorithm.leetcode.under1500;

/**
 * 1493. Longest Subarray of 1's After Deleting One Element
 */
public class LongestSubarrayOf1sAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int one = 0;
        int sec = 0;
        int ans = 0;
        int start = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i - 1] == 1) {
                    int diff = i - start;
                    if (one == 1) {
                        diff += sec;
                    }
                    if (diff > ans) {
                        ans = diff;
                    }
                }
                sec = one;
                one = i - start;
                start = i;
            }
            if (i == nums.length - 1 && nums[i] == 1) {
                int diff = i - start + 1;
                if (one == 1) {
                    diff += sec;
                } else if (one == 0) {
                    diff--;
                }
                if (diff > ans) {
                    ans = diff;
                }
            }
        }
        return ans;
    }
}
