CREATE VIEW EMP_VIEW AS
SELECT empno, ename,sal
FROM  emp
with check option


select * from emp_view

update emp_view1
set sal=1605
where empno=7499

select * from emp