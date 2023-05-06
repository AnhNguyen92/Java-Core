/*
 * LeetCode 1633. Percentage of Users Attended a Contest
 */
 
# Write your MySQL query statement below
#

select contest_id,
  round(100 * count(user_id) / (select count(*) from Users), 2) percentage 
from Register
group by contest_id
order by percentage desc, contest_id  asc;