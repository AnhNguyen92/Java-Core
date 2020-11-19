package vn.com.ids.javacore.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * LeetCode 1507
*/

public class ReformatDate {
    private static final Logger logger = LoggerFactory.getLogger(ReformatDate.class);
    
    public static void main(String[] args) {
        String date = "20th Oct 2052";
        String reformatDate = reformatDate(date);
        logger.info("Date in format 'yyyy-MM-dd': {}", reformatDate);
    }
    
    public static String reformatDate(String date) {
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
