
/*
 * LeetCode 182. Duplicate Emails
 */

select Email
from Person
group by Email
having count(Email) > 1;