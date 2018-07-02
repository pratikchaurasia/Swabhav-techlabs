---display all employee in ascending order on EName
select * from EMP
order by ENAME ASC;

---display all employees in dept 10
Select * from EMP
where DEPTNO=10;

---whose commision is null
select * from EMP
where COMM IS NULL;


---display employee name starting with s
select ENAME from EMP
WHERE  ENAME LIKE 's%'

---display employees who are manager 
select * FROM EMP
WHERE JOB='MANAGER'

---display top 2 salary earning employees
SELECT TOP 2 ENAME,SAL
  FROM EMP
  
---display EName in small case
select LOWER(ENAME) from EMP


---display employee details with ctc column
select (sal+ISNULL(comm,0))*12 as CTC
from emp
  


---all emp in dept 10 and 20
select * FROM EMP
where deptno=10 or deptno=20
  

---sum of salary of all employees 

SELECT AVG(SAL) AS [AVG SAL]
    FROM   EMP

---avg salary of all employees
SELECT SUM(SAL) AS [total sal]
    FROM   EMP
    
    
---all employess in same dept as of smith
select * from emp 
where deptno  in 
            (select deptno from emp where ename = 'smith');
           
---all employess in same salary as of blake 
select * from emp 
where sal  in 
(select sal from emp where ename = 'blake');