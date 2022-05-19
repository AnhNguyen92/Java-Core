package javacore.algorithm.leetcode.under2000;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 1507
*/

public class ReformatDate {
    public String reformatDate(String date) {
        Map<String, String> map = new HashMap<>();
        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");
        String[] arr = date.split(" ");
        String day = arr[0].replaceAll("\\D", "");
        String month = arr[1];
        String year = arr[2];
        StringBuilder builder = new StringBuilder();
        builder.append(year);
        builder.append("-");
        builder.append(map.get(month));
        builder.append("-");
        builder.append(String.format("%02d", Integer.parseInt(day)));
        
        return builder.toString();
    }

}
