
/*
 * LeetCode 596
 */

select class
from courses
group by class
having count(distinct student) >= 5;

SELECT
    class
FROM
    (SELECT
        class, COUNT(DISTINCT student) AS num
    FROM
        courses
    GROUP BY class) AS temp_table
WHERE
    num >= 5;