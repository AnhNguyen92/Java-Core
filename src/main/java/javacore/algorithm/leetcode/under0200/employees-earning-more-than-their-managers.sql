
/*
 * LeetCode 181. Employees Earning More Than Their Managers
 */

SELECT
     a.NAME AS Employee
FROM Employee AS a 
JOIN Employee AS b
     ON a.ManagerId = b.Id
     AND a.Salary > b.Salary;