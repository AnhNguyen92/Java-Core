
/*
 * LeetCode 601
 */

select
    id,
    visit_date,
    people
from Stadium
where id in (select id from Stadium where people >= 100) and (
    (
        (id + 1) in (select id from Stadium where people >= 100)
        and (id + 2) in (select id from Stadium where people >= 100)
    ) or (
        (id + 1) in (select id from Stadium where people >= 100)
        and (id - 1) in (select id from Stadium where people >= 100)
    )
    or (
        (id - 1) in (select id from Stadium where people >= 100)
        and (id - 2) in (select id from Stadium where people >= 100)
    )
);