
/*
 * LeetCode 183.Customers Who Never Order
 */

select name "Customers"
from Customers
where id not in (
	select CustomerId from Orders
	);