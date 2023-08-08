
/*
 * LeetCode 1934. Confirmation Rate
 */

# Write your MySQL query statement below
select s.user_id user_id,
    (case 
        when (select count(*) from Confirmations where user_id = s.user_id) > 0
        then round(sum(case when c.action = 'confirmed' then 1 else 0 end) / (select count(*) from Confirmations where user_id = s.user_id), 2)
        else 0
        end) confirmation_rate
from Signups s 
    left join Confirmations c
    on s.user_id = c.user_id
group by s.user_id;
