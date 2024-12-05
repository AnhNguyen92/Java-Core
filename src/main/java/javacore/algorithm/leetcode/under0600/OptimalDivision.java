package javacore.algorithm.leetcode.under0600;

/**
 * 553. Optimal Division
 */
public class OptimalDivision {
    public String optimalDivision(int[] nums) {
        int n = nums.length;
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]);
        if (n > 1) {
            sb.append("/");
            if (n > 2) {
                sb.append("(");
            }
            sb.append(nums[1]);
            for (int i = 2; i < n; i++) {
                sb.append("/");
                sb.append(nums[i]);
            }
            if (n > 2) {
                sb.append(")");
            }
        }
        return sb.toString();
    }
}
