package javacore.algorithm.leetcode.under2500;

/*
 * LeetCode 2469. Convert the Temperature
 */
public class ConvertTheTemperature {
	public double[] convertTemperature(double celsius) {
		return new double[] { celsius + 273.15, celsius * 1.80 + 32.00 };
	}
}
