
/*
 * LeetCode 184. Department Highest Salary
 */

select d.name 'Department',
        e.name 'Employee',
        e.salary 'Salary'
from Department d
inner join Employee e
on d.id = e.departmentId
where e.salary = (select max(salary) from Employee e1 where e1.departmentId = e.departmentId);