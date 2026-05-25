-- # Write your MySQL query statement below
-- select e1.name 
-- from Employee e1
-- inner join Employee e2
-- on e1.id=e2.managerid
-- group by e2.managerid
-- having count(e2.managerid)>=5


select e.name from Employee e

inner join Employee x on e.id = x.managerId

group by x.managerId

having count(x.managerId)>=5