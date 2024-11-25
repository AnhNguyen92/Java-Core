package javacore.algorithm.leetcode.under1400;

/**
 * 1344. Angle Between Hands of a Clock
 */
public class AngleBetweenHandsOfAClock {
    public double angleClock(int hour, int minutes) {
        double angleMinute = 6.0 * minutes;
        double angleHour = 30.0 * hour + 0.5 * minutes;
        double firstAngle = Math.abs(angleHour - angleMinute);
        return Math.min(firstAngle, 360.0 - firstAngle);
    }
}
