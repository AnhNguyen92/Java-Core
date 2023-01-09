
/*
 * LeetCode 177. Nth Highest Salary
 */

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    DECLARE st INT;
    Set st = N - 1;
  RETURN (
      # Write your MySQL query statement below.
      SELECT distinct salary FROM Employee ORDER BY salary DESC LIMIT st, 1
  );
END