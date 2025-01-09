/*
 * 3220. Odd and Even Transactions
 */

# Write your MySQL query statement below
select transaction_date,
    sum(case when amount % 2 = 1 then amount else 0 end) odd_sum,
    sum(case when amount % 2 = 0 then amount  else 0 end) even_sum
from transactions
group by transaction_date
order by transaction_date asc;