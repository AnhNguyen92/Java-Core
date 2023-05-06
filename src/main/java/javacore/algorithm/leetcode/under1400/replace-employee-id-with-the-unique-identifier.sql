/*
 * LeetCode 1378. Replace Employee ID With The Unique Identifier
 */

# Write your MySQL query statement below
select eu.unique_id,
       e.name
from Employees e left join EmployeeUNI eu
on eu.id = e.id;