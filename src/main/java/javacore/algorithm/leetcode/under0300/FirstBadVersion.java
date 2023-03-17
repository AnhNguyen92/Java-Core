package javacore.algorithm.leetcode.under0300;

/*
 * LeetCode 278. First Bad Version
 */
public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

// pseudo class
class VersionControl {
    protected boolean isBadVersion(int n) {
        return true;
    }
}