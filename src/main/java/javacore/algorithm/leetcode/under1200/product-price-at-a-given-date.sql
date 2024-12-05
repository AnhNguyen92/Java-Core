/**
 * 1164. Product Price at a Given Date
 */

# Write your MySQL query statement below

select distinct a.product_id
       , IFNULL(b.new_price, 10) price
from Products a
left join
(SELECT product_id, new_price FROM (
select product_id, new_price, change_date, RANK() OVER (PARTITION BY product_id ORDER BY change_date DESC) dest_rank
from Products

where change_date <= '2019-08-16'
  ) b where b.dest_rank = 1) b
on a.product_id = b.product_id
order by price desc;