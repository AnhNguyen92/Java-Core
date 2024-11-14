package javacore.algorithm.leetcode.under0500;

/**
 * 468. Validate IP Address
 */
public class ValidateIPAddress {
        public String validIPAddress(String queryIP) {
            if (queryIP.contains(".")) {
                return checkIPv4(queryIP);
            }
            return checkIPv6(queryIP);
        }

        private String checkIPv6(String queryIP) {
            String[] arr = queryIP.split(":", -1);
            //System.out.println(arr.length);
            if (arr.length == 8) {
                for (int i = 0; i < 8; i++) {
                    if (arr[i].isEmpty() || arr[i].length() > 4) {
                        return "Neither";
                    }
                    for (int j = 0; j < arr[i].length(); j++) {
                        if (!Character.isLetterOrDigit(arr[i].charAt(j))
                                || (Character.isLetter(arr[i].charAt(j)) && Character.toUpperCase(arr[i].charAt(j)) - 'F' > 0)) {
                            return "Neither";
                        }
                    }
                }
                return "IPv6";
            }
            return "Neither";
        }

        private String checkIPv4(String queryIP) {
            String[] arr = queryIP.split("\\.", -1);
            if (arr.length == 4) {
                for (int i = 0; i < 4; i++) {
                    if (!arr[i].matches("[0-9]+") || arr[i].length() > 3) {
                        return "Neither";
                    }
                    int x = Integer.parseInt(arr[i]);
                    if (x > 255 || x < 0 || (x != 0 && arr[i].charAt(0) == '0' && arr[i].length() > 1) || (x == 0&& arr[i].length() > 1)) {
                        return "Neither";
                    }
                }
                return "IPv4";
            }
            return "Neither";
        }
}
