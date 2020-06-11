package vn.com.ids.javacore.algorithm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
