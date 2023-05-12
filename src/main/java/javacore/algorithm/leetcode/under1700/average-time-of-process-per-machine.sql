/*
 * LeetCode 1661. Average Time of Process per Machine
 */

# Write your MySQL query statement below
select machine_id,
 round(sum(time) / count(process_id), 3) processing_time 
 from
(select machine_id,
      process_id,
      round(sum(case
      when activity_type = 'start' then -1 * timestamp 
      else timestamp end), 3)  time
from Activity
group by machine_id, process_id
) a
group by machine_id;