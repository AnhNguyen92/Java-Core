/**
 * 262. Trips and Users
 */

 # Write your MySQL query statement below

 select  t.request_at Day,
         round(avg(case
                 when t.status = 'cancelled_by_driver' then 1
                 when t.status = 'cancelled_by_client' then 1
                 else 0 end
             ), 2) 'Cancellation Rate'
 from Trips t
 where request_at >= '2013-10-01' and request_at <= '2013-10-03'
     and client_id not in (select users_id from Users where banned = 'Yes')
     and driver_id not in (select users_id from Users where banned = 'Yes')
 group by t.request_at