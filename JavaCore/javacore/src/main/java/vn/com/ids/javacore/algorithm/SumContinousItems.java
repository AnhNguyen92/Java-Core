package vn.com.ids.javacore.algorithm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author anh.nguyen
 *
 * <p>Problem:
 * <p>Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.</p>
 * </p>
 * @see
 * <blockquote><pre>
 *     <a href=https://leetcode.com/problems/subarray-sum-equals-k>https://leetcode.com/problems/subarray-sum-equals-k</a>
 *     <a href=https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x>https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x</a>
 * </pre></blockquote>
 */
public class SumContinousItems {
	private static final String PRINT_FORMAT_STR = "{} = {}";
	private static final Logger logger = LoggerFactory.getLogger(SumContinousItems.class);

	public static void main(String[] args) {
		int k = 6;
		int[] arr = { -2, 5, 3, 7, -4, 9, -12, 8, 5 };
		logger.info("Using for -------------------------------");
		getSumUsingFor(k, arr);
		logger.info("Using while -------------------------------");
		getSumUsingWhile(k, arr);
		logger.info("Using recursive -------------------------------");
		getSumWithRecursive(k, arr);
	}

	public static void getSumUsingFor(int key, int[] arr) {
		StringBuilder sumStr;
		for (int i = 0; i < arr.length; i++) {
			sumStr = new StringBuilder();
			sumStr.append(arr[i]);
			int sum = arr[i];
			if (sum == key) {
				logger.info(PRINT_FORMAT_STR, sumStr, sum);
			}
			for (int j = i + 1; j < arr.length; j++) {
				sumStr.append(" + ").append(arr[j]);
				sum += arr[j];
				if (sum == key) {
					logger.info(PRINT_FORMAT_STR, sumStr, sum);
				}
			}
		}
	}

	public static void getSumUsingWhile(int key, int[] arr) {
		int i = 0;
		StringBuilder sumStr;
		while (i < arr.length) {
			sumStr = new StringBuilder();
			sumStr.append(arr[i]);
			int sum = arr[i];
			if (sum == key) {
				logger.info(PRINT_FORMAT_STR, sumStr, sum);
				i++;
			} else {
				int j = i + 1;
				while (j < arr.length) {
					sumStr.append(" + ").append(arr[j]);
					sum += arr[j];
					if (sum == key) {
						logger.info(PRINT_FORMAT_STR, sumStr, sum);
					}
					j++;
				}
			}
			i++;
		}
	}

	public static void getSumWithRecursive(int key, int[] arr) {
		StringBuilder sumStr;
		for (int i = 0; i < arr.length; i++) {
			sumStr = new StringBuilder();
			sumStr.append(arr[i]);
			int sum = arr[i];
			if (sum == key) {
				logger.info(PRINT_FORMAT_STR, sumStr, sum);
				break;
			} else {
				plusSum(i + 1, key, sum, sumStr, arr);
			}
		}
	}
	
	public static void plusSum(int i,int key, int sum, StringBuilder sumStr, int[] arr) {
		if (i < arr.length) {
			sum += arr[i];
			sumStr.append(" + ").append(arr[i]);
			if (sum == key) {
				logger.info(PRINT_FORMAT_STR, sumStr, sum);
			}
			plusSum(i + 1, key, sum, sumStr, arr);
		}
	}
	
}
