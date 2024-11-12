/**
 * LeetCode 1341. Movie Rating
 */

# Write your MySQL query statement below

select a.*
from (
     select u.name as results
     from Users u
     inner join MovieRating mr
        on u.user_id = mr.user_id
    group by u.name
    order by count(mr.movie_id) desc, u.name asc
    limit 1
    ) a
union all
select b.*
from (
    select m.title as results
     from Movies m
     inner join MovieRating mr
        on m.movie_id = mr.movie_id
     where mr.created_at >= '2020-02-01' AND mr.created_at < '2020-03-01'
     group by m.title
     order by  avg(mr.rating) desc,  m.title asc
     limit 1
    ) b;