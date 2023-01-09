/*
 * LeetCode 1158. Market Analysis I
 */

# Write your MySQL query statement below
select u.user_id as 'buyer_id', u.join_date, 
SUM(case WHEN year(o.order_date) = 2019 then 1 else 0 end) 
 as 'orders_in_2019'
from Users u left join Orders o
on u.user_id = o.buyer_id 
# where year(o.order_date) = 2019
group by u.user_id, u.join_date
order by u.user_id asc;