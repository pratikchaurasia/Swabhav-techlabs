---deptwise no of employees
select deptno , COUNT(*)
from emp
group by deptno

---jobwise no of employees
select job , COUNT(*) as jobwise
from emp
group by job

---deptwise, jobwise of employees
select deptno,job , COUNT(*) 
from emp
group by deptno,job

---display employee employee with their dept name
select dept.dname,emp.ename
from emp
join dept
on emp.deptno=dept.deptno

---all departments with employees if any
select dept.dname,emp.ename
from dept
left outer join emp
on emp.deptno=dept.deptno

---all departments which dosent have employees
select dept.dname,emp.ename
from dept
left outer join emp
on emp.deptno=dept.deptno
where emp.ename is null

---all employee name and their boss name
SELECT e.ename,m.ename
FROM emp AS m right outer JOIN emp AS e
ON e.mgr = m.empno

---all empname,deptname,with manager name
SELECT e.ename,dname,m.ename
FROM emp e 
join dept d
on e.deptno=d.deptno
left JOIN emp m
ON e.mgr = m.empno




