
/*
 * LeetCode 595. Big Countries
 */

SELECT
    name, population, area
FROM
    world
WHERE
    area > 3000000
UNION
SELECT
    name, population, area
FROM
    world
WHERE
    population > 25000000
;


select name, population, area
from World
where area > 3000000 
	or population > 25000000;