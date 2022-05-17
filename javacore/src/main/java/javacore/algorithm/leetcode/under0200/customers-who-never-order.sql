
/*
 * LeetCode 183
 */

select name "Customers"
from Customers
where id not in (
	select CustomerId from Orders
	);