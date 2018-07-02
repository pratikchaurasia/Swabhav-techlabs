CREATE TABLE EmpLog (
  updatefrom varchar(50),
  updateto varchar(50),
  dateAndTime datetime
);

Create TRIGGER logChanges
	ON [EMP]
	FOR update
	AS
	BEGIN
		insert into EmpLog values(convert(varchar(50),(select sal from deleted)),convert(varchar(50),(select sal from inserted)),GETDATE());
	END
GO

update emp 
SET sal=5000 
where ename='king'

select * from EmpLog
