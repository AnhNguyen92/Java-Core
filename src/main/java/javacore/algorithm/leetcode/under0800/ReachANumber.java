package javacore.algorithm.leetcode.under0800;

/**
 * 754. Reach a Number
 */
public class ReachANumber {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int sum = 0;
        int i = 1;
        int diff;
        while (i < target + 10) {
            sum += i;
            if (sum == target)  return i;
            diff = sum - target;
            if (diff > 0 && diff % 2 == 0) {
                return i;
            }
            i++;
        }
        return i;
    }
}
