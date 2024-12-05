/**
 * 602. Friend Requests II: Who Has the Most Friends
 */

# Write your MySQL query statement below

with cte as (
select requester_id id, accepter_id receiver
from RequestAccepted
union all
select accepter_id id, requester_id receiver
from RequestAccepted )
select cte.id id, count(distinct receiver) num
from cte
group by cte.id
order by count(distinct receiver) desc
limit 1;