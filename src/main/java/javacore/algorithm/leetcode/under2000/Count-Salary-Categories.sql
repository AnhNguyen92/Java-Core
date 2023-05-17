/*
 * LeetCode 1907. Count Salary Categories
 */
 
 # Write your MySQL query statement below
    select "Low Salary" category,
        count(income) accounts_count 
    from Accounts
    where income < 20000
union
    select "Average Salary" category,
        count(income) accounts_count 
    from Accounts
    where income >= 20000 and income <= 50000
union
    select "High Salary" category,
        count(income) accounts_count 
    from Accounts
    where income > 50000;