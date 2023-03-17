package javacore.algorithm.leetcode.under1400;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/*
 * LeetCode 1356. Sort Integers by The Number of 1 Bits
 */
public class SortIntegersByTheNumberOf1Bits {
	public int[] sortByBits(int[] arr) {
		// sort to avoid unnecessary computation
		Arrays.sort(arr);

		// count how many elements with each bit count we have
		int maxBitCount = 13; // == IntStream.rangeClosed(0, (int) Math.pow(10,
								// 4)).map(Integer::bitCount).max().orElse(0)
		int[] elementsWithBitCount = new int[maxBitCount + 1];
		for (int i = 0; i < arr.length; i++) {
			elementsWithBitCount[Integer.bitCount(arr[i])]++;
		}

		// determine start idx for each bit count in final result
		int[] fillWithStartPosition = new int[maxBitCount + 1];
		fillWithStartPosition[0] = 0;
		for (int i = 1; i < fillWithStartPosition.length; i++) {
			fillWithStartPosition[i] = fillWithStartPosition[i - 1] + elementsWithBitCount[i - 1];
		}

		// populate final result
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			result[fillWithStartPosition[Integer.bitCount(arr[i])]++] = arr[i];
		}

		return result;
	}

	public int[] sortByBits1(int[] arr) {
		return Arrays.stream(arr).boxed().sorted((a, b) -> {
			int aW = weight(a);
			int bW = weight(b);
			return aW != bW ? aW - bW : a - b;
		}).mapToInt(i -> i).toArray();
	}

	public int weight(int k) {
		int cnt = 0;
		while (k > 0) {
			cnt++;
			k &= k - 1;
		}

		return cnt;
	}

	public int[] sortByBits2(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		Map<Integer, Integer> frequenceMap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int count = countSetBits(arr[i]);
			if (map.containsKey(arr[i])) {
				frequenceMap.put(arr[i], frequenceMap.getOrDefault(arr[i], 1) + 1);
			}
			map.put(arr[i], count);
		}
		List<Integer> lst = map.entrySet().stream().sorted((Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) -> {
			return o1.getValue().equals(o2.getValue()) ? o1.getKey().compareTo(o2.getKey())
					: o1.getValue().compareTo(o2.getValue());
		}).map(e -> e.getKey()).collect(Collectors.toList());
		int[] res = new int[arr.length];
		int x = 0;
		for (int i = 0; i < lst.size(); i++) {
			Integer number = lst.get(i);
			res[x++] = number.intValue();
			Integer ocurrence = frequenceMap.get(number);

			if (ocurrence != null && ocurrence.intValue() > 1) {
				for (int j = 2; j <= ocurrence.intValue(); j++) {
					res[x++] = number.intValue();
				}
			}
		}
		return res;
	}

	private int countSetBits(int n) {
		int count = 0;
		while (n > 0) {
			count += n & 1;
			n >>= 1;
		}
		return count;
	}
}
