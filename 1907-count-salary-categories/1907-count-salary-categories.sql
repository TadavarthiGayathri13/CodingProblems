# Write your MySQL query statement below

-- select
-- case
--     when income < 20000 then 'Low Salary'
--     when income between 20000 AND 50000 then 'Average Salary'
--     when income > 50000 then 'High Salary'
-- end as category,
-- count(*) as accounts_count
-- from Accounts
-- Group by category;

SELECT 'Low Salary' AS category,
       COUNT(*) AS accounts_count
FROM Accounts
WHERE income < 20000

UNION

SELECT 'Average Salary' AS category,
       COUNT(*) AS accounts_count
FROM Accounts
WHERE income BETWEEN 20000 AND 50000

UNION

SELECT 'High Salary' AS category,
       COUNT(*) AS accounts_count
FROM Accounts
WHERE income > 50000;