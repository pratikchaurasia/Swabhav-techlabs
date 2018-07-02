CREATE PROCEDURE SelectAllCustomers @ename varchar(10), @sal money
AS
SELECT * FROM emp WHERE ename = @ename AND sal = @sal
GO
exec SelectAllCustomers king,5000