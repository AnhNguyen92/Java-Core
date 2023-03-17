
/*
 * LeetCode 180. Consecutive Numbers
 */

SELECT
    distinct min(num) AS 'ConsecutiveNums'
FROM
    (SELECT
        id, num, 
        (SELECT 
            sum(start_of_series) 
        FROM 
            (SELECT
                id, num, 
                case when 
                    (SELECT num FROM Logs t_prv WHERE t_prv.id < Logs.id ORDER BY id DESC LIMIT 1) <=> num 
                then 0
                else 1 
                end AS start_of_series 
            FROM
                Logs
            ) AS t1 
        WHERE 
            t1.id <= Logs.id
        ) AS series_number
    FROM
        Logs
    ) AS t2
GROUP BY
    series_number
Having count(*) >= 3
ORDER BY
    series_number;