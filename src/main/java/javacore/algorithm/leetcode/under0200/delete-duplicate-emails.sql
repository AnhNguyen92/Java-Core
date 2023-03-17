
/*
 * LeetCode 196. Delete Duplicate Emails
 */

# Write your MySQL query statement below
DELETE t1 FROM Person t1
INNER JOIN Person t2 
WHERE 
    t1.id > t2.id AND 
    t1.email = t2.email;