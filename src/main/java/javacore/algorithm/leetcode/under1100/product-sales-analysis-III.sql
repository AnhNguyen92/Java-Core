/**
 * 1070. Product Sales Analysis III
 */

 # Write your MySQL query statement below

 select a.product_id product_id, a.year first_year, a.quantity, a.price from (
     select product_id, year,quantity, price,
     rank() over (PARTITION BY product_id  ORDER BY year ASC) min_year
     from Sales
 ) a
 where a.min_year = 1;