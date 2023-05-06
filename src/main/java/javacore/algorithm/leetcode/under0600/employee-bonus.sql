/*
 * LeetCode 577. Employee Bonus
 */

# Write your MySQL query statement below
select name, 
       bonus 
from Employee e 
  left join Bonus b on e.empId = b.empId
where ifnull(b.bonus, 0) < 1000;