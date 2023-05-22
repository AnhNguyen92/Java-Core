/*
 * LeetCode 1321. Restaurant Growth
 */
 
# Write your MySQL query statement below

select c.visited_on visited_on, 
    (select sum(amount) from Customer where visited_on >= DATE_SUB(c.visited_on, INTERVAL 6 DAY) AND visited_on <= c.visited_on) amount,
    round(AVG(amount), 7) average_amount 
from Customer c