
/*
 * LeetCode 185
 */

select d.name 'Department',
        e.name 'Employee',
        e.salary 'Salary'
from Department d
inner join Employee e
on d.id = e.departmentId
where e.salary 
	in (SELECT * 
		FROM (
			select distinct e1.salary
			from Employee e1
			where e1.departmentId = e.departmentId
			order by e1.salary DESC
			limit 3)
			as t
		);