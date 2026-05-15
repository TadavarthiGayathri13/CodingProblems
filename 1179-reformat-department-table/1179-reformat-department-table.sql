# Write your MySQL query statement below

-- CASE WHEN → creates separate month columns
-- GROUP BY id → combines rows
-- MAX() → picks actual revenue ignoring NULLs
-- Revenue END ->return the value present in revenue column.

SELECT
    id,
    MAX(CASE WHEN month='Jan' THEN revenue END) AS Jan_Revenue,
    MAX(CASE WHEN month='Feb' THEN revenue END) AS Feb_Revenue,
    MAX(CASE WHEN month='mar' THEN revenue END) AS mar_Revenue,
    MAX(CASE WHEN month='Apr' THEN revenue END) AS Apr_Revenue,
    MAX(CASE WHEN month='may' THEN revenue END) AS may_Revenue,
    MAX(CASE WHEN month='Jun' THEN revenue END) AS jun_Revenue,
    MAX(CASE WHEN month='jul' THEN revenue END) AS jul_Revenue,
    MAX(CASE WHEN month='Aug' THEN revenue END) AS Aug_Revenue,
    MAX(CASE WHEN month='sep' THEN revenue END) AS Sep_Revenue,
    MAX(CASE WHEN month='oct' THEN revenue END) AS oct_Revenue,
    MAX(CASE WHEN month='nov' THEN revenue END) AS Nov_Revenue,
    MAX(CASE WHEN month='Dec' THEN revenue END) AS Dec_Revenue
FROM Department
GROUP BY id;