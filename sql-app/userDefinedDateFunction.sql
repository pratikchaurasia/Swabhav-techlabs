CREATE FUNCTION dbo.getCurrentDate()  
RETURNS varchar(10)  
AS
BEGIN  
	RETURN  
		convert(varchar(10),GETDATE() ,12)
END
GO

print dbo.getCurrentDate();