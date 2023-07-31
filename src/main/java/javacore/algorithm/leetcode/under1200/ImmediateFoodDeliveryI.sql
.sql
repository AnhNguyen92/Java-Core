/*
 * LeetCode 1173. Immediate Food Delivery I
 */

# Write your MySQL query statement below
select 
    round(100 * avg(case
        when order_date = customer_pref_delivery_date
        then 1 else 0
      end), 2) immediate_percentage
FROM
    Delivery;