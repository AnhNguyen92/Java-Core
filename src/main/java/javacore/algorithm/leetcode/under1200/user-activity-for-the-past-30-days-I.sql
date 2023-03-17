
/*
 * LeetCode 1141. User Activity for the Past 30 Days I
 */

# Write your MySQL query statement below
select activity_date as 'day', count(distinct user_id) as 'active_users'
from Activity
where activity_date <= DATE('2019-07-27') and activity_date > DATE_SUB(DATE('2019-07-27'),INTERVAL 30 DAY)
group by activity_date
order by activity_date asc
