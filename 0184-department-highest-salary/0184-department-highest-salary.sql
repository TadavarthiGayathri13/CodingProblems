# Write your MySQL query statement below



select d.name as Department,
       e.name as Employee,
       e.salary as Salary
from Employee e
Join Department d
on e.departmentID = d.id
Join(
    select departmentId,
    MAX(salary) as max_salary
    from Employee
    Group BY departmentId
)m
ON e.departmentId = m.departmentId
AND e.salary = m.max_salary;