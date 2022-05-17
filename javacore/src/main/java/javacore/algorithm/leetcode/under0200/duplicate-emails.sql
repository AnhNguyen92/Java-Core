
/*
 * LeetCode 182
 */

select Email
from Person
group by Email
having count(Email) > 1;