/**
 * 550. Game Play Analysis IV
 */

# Write your MySQL query statement below

-- select player_id, DATE_ADD(min(event_date), INTERVAL 1 DAY) from Activity
-- group by player_id

select round((select count(*) as count
    from Activity a
    where (a.player_id, a.event_date)
        in (select player_id
                , DATE_ADD(min(event_date), INTERVAL 1 DAY)
            from Activity
            group by player_id
            )) / (select count(distinct player_id) from Activity), 2) fraction
from dual
        ;