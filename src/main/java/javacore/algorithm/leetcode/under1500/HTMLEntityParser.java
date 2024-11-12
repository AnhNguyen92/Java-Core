package javacore.algorithm.leetcode.under1500;

/**
 * 1410. HTML Entity Parser
 */
public class HTMLEntityParser {
    public String entityParser(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '&') {
                if (text.startsWith("&quot;", i)) {
                    i += 5;
                    sb.append("\"");
                } else if (text.startsWith("&apos;", i)) {
                    i += 5;
                    sb.append("'");
                } else if (text.startsWith("&gt;", i)) {
                    i += 3;
                    sb.append(">");
                } else if (text.startsWith("&lt;", i)) {
                    i += 3;
                    sb.append("<");
                } else if (text.startsWith("&frasl;", i)) {
                    i += 6;
                    sb.append("/");
                } else if (text.startsWith("&amp;", i)) {
                    i += 4;
                    sb.append("&");
                } else {
                    sb.append("&");
                }
            } else {
                sb.append(text.charAt(i));
            }
        }

        return sb.toString();
    }
}
