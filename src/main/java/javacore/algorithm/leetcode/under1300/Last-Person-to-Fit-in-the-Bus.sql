/*
 * LeetCode 1204. Last Person to Fit in the Bus
 */

# Write your MySQL query statement below
select person_name
from (
	SELECT t.turn,
	person_name, (
	    SELECT SUM(weight) 
	    FROM Queue t2 
	    WHERE t2.turn <= t.turn
	) AS cnt
FROM Queue t
having cnt <= 1000
order by t.turn
) x
ORDER BY  x.turn DESC
LIMIT 1;