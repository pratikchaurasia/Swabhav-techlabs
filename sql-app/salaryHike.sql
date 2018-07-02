CREATE PROCEDURE salaryHike @empNo int, @hike float
AS
IF EXISTS (SELECT * FROM emp WHERE empno=@empNo)
	BEGIN 
		update emp
		SET sal=sal+sal*@hike 
		WHERE empno=@empNo
	END
Else
	BEGIN
		print 'Check the employee no'
	END
GO
select * from emp
exec salaryHike 684654,.05