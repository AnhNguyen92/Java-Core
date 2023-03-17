
/*
 * LeetCode 1741. Find Total Time Spent by Each Employee
 */

select event_day as 'day', emp_id, sum(out_time - in_time) as 'total_time' 
from Employees
group by emp_id, event_day;