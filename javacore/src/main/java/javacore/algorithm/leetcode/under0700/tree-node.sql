
/*
 * LeetCode 608
 */

select `id`,
(case
    WHEN p_id IS NULL THEN "Root"   
    WHEN id NOT IN (SELECT DISTINCT p_id FROM Tree WHERE p_id IS NOT NULL) THEN "Leaf"
    ELSE "Inner"
 end
) as 'type'
from Tree;