package javacore.algorithm.leetcode.under3000;
/**
 * 2960. Count Tested Devices After Test Operations
 */
public class CountTestedDevicesAfterTestOperations {
    public int countTestedDevices(int[] batteryPercentages) {
        int count = 0;
        for (int batteryPercentage : batteryPercentages) {
            if (batteryPercentage > count) {
                count++;
            }
        }
        return count;
    }
}
