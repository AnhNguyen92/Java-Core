
/*
 * LeetCode 1873. Calculate Special Bonus
 */

select employee_id, 
CASE
    WHEN (employee_id % 2 = 1) and name NOT like 'M%' THEN salary
ELSE 0 END AS 'bonus'
from Employees;