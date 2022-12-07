package javacore.algorithm.leetcode.under0600;

/*
 * LeetCode 551. Student Attendance Record I
 */
public class StudentAttendanceRecordI {
	public boolean checkRecord(String s) {
		long count = s.chars().filter(ch -> ch == 'A').count();
		return (s.indexOf("LLL") < 0 && count < 2);
	}
}
