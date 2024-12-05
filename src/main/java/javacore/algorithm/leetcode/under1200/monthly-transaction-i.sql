/**
* 1193. Monthly Transactions I
*/

# Write your MySQL query statement below
select DATE_FORMAT(trans_date, '%Y-%m') AS 'month',
    country,
    count(amount) trans_count,
    sum(state = 'approved') approved_count,
    sum(amount) trans_total_amount,
    sum(case when state = 'approved' then amount else 0 end) approved_total_amount
from Transactions
group by DATE_FORMAT(trans_date, '%Y-%m'), country;