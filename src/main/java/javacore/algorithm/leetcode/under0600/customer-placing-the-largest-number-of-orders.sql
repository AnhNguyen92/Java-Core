
/*
 * LeetCode 586. Customer Placing the Largest Number of Orders
 */

select customer_number from
(
	select customer_number, count(order_number)
	from Orders
	group by customer_number
	order by count(order_number) desc
) T
limit 1;