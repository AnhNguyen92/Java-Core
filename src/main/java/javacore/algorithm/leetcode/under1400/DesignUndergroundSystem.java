package javacore.algorithm.leetcode.under1400;

import java.util.HashMap;
import java.util.Map;

/**
 * 1396. Design Underground System
 */
public class DesignUndergroundSystem {
    class UndergroundSystem {
        Map<Integer, Object[]> checkinMap;
        Map<String, int[]> times;

        public UndergroundSystem() {
            checkinMap = new HashMap<>();
            times = new HashMap<>();
        }

        public void checkIn(int id, String stationName, int t) {
            checkinMap.put(id, new Object[] { stationName, t });
        }

        public void checkOut(int id, String stationName, int t) {
            Object[] arr = checkinMap.get(id);
            int time = t - (Integer) arr[1];
            String start = (String) arr[0];
            String key = start + "," + stationName;
            int[] trr = times.getOrDefault(key, new int[2]);
            trr[0] += time;
            trr[1]++;
            times.put(key, trr);
        }

        public double getAverageTime(String startStation, String endStation) {
            int[] arr = times.get(startStation + "," + endStation);
            return (double) arr[0] / arr[1];
        }
    }

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
}
