
/*
 * LeetCode 178. Rank Scores
 */

select score,
DENSE_RANK() OVER (
    ORDER BY
    score DESC
    ) 'rank'
from Scores
order by 'rank';