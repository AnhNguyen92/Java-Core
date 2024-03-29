
/*
 * LeetCode 1484. Group Sold Products By The Date
 */

select sell_date, count(distinct product) 'num_sold', GROUP_CONCAT(distinct product) as 'products'
from Activities
group by sell_date
order by sell_date asc;