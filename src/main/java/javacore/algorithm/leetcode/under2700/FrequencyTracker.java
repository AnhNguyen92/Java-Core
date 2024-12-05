package javacore.algorithm.leetcode.under2700;

import java.util.HashMap;
import java.util.Map;

/**
 * 2671. Frequency Tracker
 */
public class FrequencyTracker {
    Map<Integer, Integer> freqMap;
    Map<Integer, Integer> countMap;
    public FrequencyTracker() {
        freqMap = new HashMap<>();
        countMap = new HashMap<>();
    }

    public void add(int number) {
        Integer val = freqMap.get(number);
        if (val == null) {
            freqMap.put(number, 1);
            countMap.put(1, countMap.getOrDefault(1, 0) + 1);
        } else {
            freqMap.put(number, val + 1);
            Integer count = countMap.getOrDefault(val, 0);
            if (count == 1) {
                countMap.remove(val);
            } else {
                countMap.put(val, count - 1);
            }
            countMap.put(val + 1, countMap.getOrDefault(val + 1, 0) +  1);
        }
    }

    public void deleteOne(int number) {
        Integer val = freqMap.get(number);
        if (val != null) {
            if (val == 1) {
                freqMap.remove(number);
            } else {
                freqMap.put(number, val - 1);
            }
            Integer count = countMap.get(val);
            if (count != null)
                if (count == 1) {
                    countMap.remove(val);
                    if (val > 1) {
                        countMap.put(val - 1, countMap.getOrDefault(val - 1, 0) + 1);
                    }
                } else {
                    countMap.put(val - 1, countMap.getOrDefault(val - 1, 0) + 1);
                    countMap.put(val, countMap.get(val) - 1);
                }
        }
    }

    public boolean hasFrequency(int frequency) {
        return countMap.containsKey(frequency);
    }
}
