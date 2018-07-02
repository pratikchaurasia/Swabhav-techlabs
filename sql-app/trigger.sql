CREATE TRIGGER toUpperCase
	ON [EMP]
	FOR INSERT 
	AS
	BEGIN
		UPDATE Emp
     set ename= upper(ename)
	END
	
	
INSERT INTO EMP VALUES (8900,'pratik','CLERK',7698,'17-NOV-81',3000,NULL,10);
select * from emp