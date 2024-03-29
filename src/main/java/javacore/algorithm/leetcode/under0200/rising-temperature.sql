
/*
 * LeetCode 197. Rising Temperature
 */

select w.id as id 
from Weather w 
where Temperature > (
	select Temperature 
	from Weather 
	where recordDate = DATE_ADD(w.recordDate, INTERVAL -1 DAY)
	);