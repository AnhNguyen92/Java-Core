/*
 * LeetCode 175. Combine Two Tables
 */

select  p.FirstName "FirstName", p.LastName "LastName",a.City "City",a.State "State"          
from Person p 
left join Address a
on p.PersonId = a.PersonId;