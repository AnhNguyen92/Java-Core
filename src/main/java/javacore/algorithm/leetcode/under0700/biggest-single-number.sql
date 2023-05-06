/*
 * LeetCode 619. Biggest Single Number
 */

# Write your MySQL query statement below

select max(num) 'num' from
(select num, count(num) 'count'
from MyNumbers group by num) a
where a.count = 1;