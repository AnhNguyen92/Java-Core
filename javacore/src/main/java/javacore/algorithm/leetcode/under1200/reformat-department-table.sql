/*
 * LeetCode 1179
 */

# Write your MySQL query statement below
select id,
        MAX(case when month = 'Jan' then revenue else null end) as 'Jan_Revenue',
        MAX(case when month = 'Feb' then revenue else null end) as 'Feb_Revenue',
        MAX(case when month = 'Mar' then revenue else null end) as 'Mar_Revenue',
        MAX(case when month = 'Apr' then revenue else null end) as 'Apr_Revenue',
        MAX(case when month = 'May' then revenue else null end) as 'May_Revenue',
        MAX(case when month = 'Jun' then revenue else null end) as 'Jun_Revenue',
        MAX(case when month = 'Jul' then revenue else null end) as 'Jul_Revenue',
        MAX(case when month = 'Aug' then revenue else null end) as 'Aug_Revenue',
        MAX(case when month = 'Sep' then revenue else null end) as 'Sep_Revenue',
        MAX(case when month = 'Oct' then revenue else null end) as 'Oct_Revenue',
        MAX(case when month = 'Nov' then revenue else null end) as 'Nov_Revenue',
        MAX(case when month = 'Dec' then revenue else null end) as 'Dec_Revenue'
from Department
GROUP BY 1;
# SELECT id,
# MAX(CASE WHEN month = 'Jan' THEN revenue ELSE NULL END) AS Jan_Revenue,
# MAX(CASE WHEN month = 'Feb' THEN revenue ELSE NULL END) AS Feb_Revenue,
# MAX(CASE WHEN month = 'Mar' THEN revenue ELSE NULL END) AS Mar_Revenue,
# MAX(CASE WHEN month = 'Apr' THEN revenue ELSE NULL END) AS Apr_Revenue,
# MAX(CASE WHEN month = 'May' THEN revenue ELSE NULL END) AS May_Revenue,
# MAX(CASE WHEN month = 'Jun' THEN revenue ELSE NULL END) AS Jun_Revenue,
# MAX(CASE WHEN month = 'Jul' THEN revenue ELSE NULL END) AS Jul_Revenue,
# MAX(CASE WHEN month = 'Aug' THEN revenue ELSE NULL END) AS Aug_Revenue,
# MAX(CASE WHEN month = 'Sep' THEN revenue ELSE NULL END) AS Sep_Revenue,
# MAX(CASE WHEN month = 'Oct' THEN revenue ELSE NULL END) AS Oct_Revenue,
# MAX(CASE WHEN month = 'Nov' THEN revenue ELSE NULL END) AS Nov_Revenue,
# MAX(CASE WHEN month = 'Dec' THEN revenue ELSE NULL END) AS Dec_Revenue
# FROM Department
# GROUP BY 1
# ORDER BY 1 ;