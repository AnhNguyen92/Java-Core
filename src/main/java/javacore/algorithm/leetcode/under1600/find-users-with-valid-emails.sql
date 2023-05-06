/*
 * LeetCode 1517. Find Users With Valid E-Mails
 */

# Write your MySQL query statement below
select * from Users
where mail REGEXP '^[a-zA-Z][a-zA-Z0-9-_.]*+@leetcode\\.com$';