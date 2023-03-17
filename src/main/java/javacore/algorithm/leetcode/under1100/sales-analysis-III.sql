
/*
 * LeetCode 1084. Sales Analysis III
 */

select distinct p.product_id, p.product_name 
from Product p 
inner join Sales s
on p.product_id = s.product_id 
where s.product_id not in 
	(select product_id
	from Sales
	where sale_date < Date('2019-01-01') 
		or sale_date  > Date('2019-03-31')
	);