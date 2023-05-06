/*
 * LeetCode 1211. Queries Quality and Percentage
 */

# Write your MySQL query statement below
select query_name,
    round(sum(rating/position) / count(position),2) 'quality',
    round( sum(case when rating < 3 then 1 else 0 end) * 100 / count(rating) , 2) 'poor_query_percentage'
from Queries
group by query_name;
