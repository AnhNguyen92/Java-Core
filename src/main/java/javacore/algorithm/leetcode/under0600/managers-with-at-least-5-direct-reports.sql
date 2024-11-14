/**
 * 570. Managers with at Least 5 Direct Reports
 */

/* Write your PL/SQL query statement below */

select a.name name
from
(
  select id, name,
    (select count(id) from Employee where managerId = e.id) count
  from Employee e
  group by id, name
) a
where a.count >= 5;