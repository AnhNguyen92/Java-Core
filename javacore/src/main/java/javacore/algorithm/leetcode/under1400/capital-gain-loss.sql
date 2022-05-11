
/*
 * LeetCode 1393
 */

select stock_name,
sum( price * case operation when 'Sell' then 1 else -1 end) as 'capital_gain_loss'
from Stocks
group by stock_name;