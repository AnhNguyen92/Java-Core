
/*
 * LeetCode 1148
 */

select distinct author_id as id
from Views 
where author_id = viewer_id
order by author_id asc;