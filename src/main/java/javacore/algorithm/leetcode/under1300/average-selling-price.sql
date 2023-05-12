/*
 * LeetCode 1251. Average Selling Price
 */

# Write your MySQL query statement below
select u.product_id,
    round(sum(p.price * u.units) / sum(u.units), 2) 'average_price'
from UnitsSold u 
    left join Prices p 
        on u.product_id = p.product_id and u.purchase_date >= p.start_date and u.purchase_date <= p.end_date 
group by u.product_id;