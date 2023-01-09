
/*
 * LeetCode 626. Exchange Seats
 */

select 
(case
    when `id` % 2 = 0 then (`id` - 1)
    else
        case
            when `id` < (select max(`id`) from `Seat`) then (`id` + 1)
            else `id`
            end
end) as 'id',
`student` as 'student'
from `Seat`
order by (case
    when `id` % 2 = 0 then (`id` - 1)
    else
        case
            when `id` < (select max(`id`) from `Seat`) then (`id` + 1)
            else `id`
            end
end);