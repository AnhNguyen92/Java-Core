/**
 * LeetCode 1327. List the Products Ordered in a Period
 */

# Write your MySQL query statement below
select product_name,
       sum(unit) 'unit'
from Products p
    left join Orders o
    on p.product_id = o.product_id
    where order_date between date('2020-02-01') and date('2020-02-29')
group by product_name
having sum(unit) >= 100;
