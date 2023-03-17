/*
 * LeetCode 607. Sales Person
 */

select s.name 
	from SalesPerson s 
	where s.sales_id not in
	(select sales_id from Orders where com_id in (select com_id from company where name = 'RED')) 
	order by s.sales_id  asc;