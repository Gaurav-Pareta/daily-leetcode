# Write your MySQL query statement below
SELECT class
FROM Courses
Group By class
HAVING COUNT(class)>=5