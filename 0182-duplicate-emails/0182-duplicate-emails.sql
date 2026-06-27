# Write your MySQL query statement below
select email From person 
group by email 
having count(email)>1;