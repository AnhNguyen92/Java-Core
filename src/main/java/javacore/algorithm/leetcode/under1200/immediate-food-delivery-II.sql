/**
 * 1174. Immediate Food Delivery II
 */

# Write your MySQL query statement below

select round(100.0 *
(select count(*) from Delivery a
inner join (
select customer_id, min(order_date) first_order
from Delivery
group by customer_id
)b
on a.customer_id = b.customer_id and a.order_date = b.first_order
and a.order_date = a.customer_pref_delivery_date
 ) / (select count(distinct customer_id) from Delivery), 2
 ) immediate_percentage
 from dual;