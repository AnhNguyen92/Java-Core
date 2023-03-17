package javacore.algorithm.leetcode.under1700;

/*
 * LeetCode 1678. Goal Parser Interpretation
 */
public class GoalParserInterpretation {
	public String interpret(String command) {
        StringBuilder builder = new StringBuilder("");
        char c;
        for (int i = 0; i < command.length(); i++) {
            c = command.charAt(i);
            if (c ==  '(') continue;
            if (c != ')') {
                builder.append(c);
            } else {
                if (i > 0 && command.charAt(i-1) ==  '(') {
                    builder.append("o");
                }
            }
        }
        return builder.toString();
    }
}
