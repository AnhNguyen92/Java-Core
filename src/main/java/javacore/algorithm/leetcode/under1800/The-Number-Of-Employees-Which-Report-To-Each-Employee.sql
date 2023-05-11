/*
 * LeetCode 1731. The Number of Employees Which Report to Each Employee
 */

# Write your MySQL query statement below
select e.employee_id, name, a.reports_count, a.average_age
from Employees e
right join 
(select reports_to,
  count(employee_id) 'reports_count',
  round(sum(age)/ count(age), 0) 'average_age'
from Employees
where reports_to is not null
group by reports_to) a
on e.employee_id = a.reports_to
order by e.employee_id asc;