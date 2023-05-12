/*
 * LeetCode 2356. Number of Unique Subjects Taught by Each Teacher
 */

# Write your MySQL query statement below
select teacher_id,
    count(distinct subject_id) 'cnt'
from Teacher
group by teacher_id;