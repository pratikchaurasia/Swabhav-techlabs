CREATE FUNCTION GetAllEmployees(@sal money)  
RETURNS TABLE  
AS  
RETURN  
    SELECT *FROM emp WHERE sal>=@sal 
    
    
SELECT * FROM GetAllEmployees(1500)