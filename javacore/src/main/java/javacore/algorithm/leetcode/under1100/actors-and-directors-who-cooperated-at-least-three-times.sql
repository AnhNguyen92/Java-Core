
/*
 * LeetCode 1050
 */

select actor_id, director_id
from ActorDirector 
group by actor_id, director_id
having count(timestamp) >= 3;