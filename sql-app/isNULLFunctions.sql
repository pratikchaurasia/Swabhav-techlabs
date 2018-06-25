DECLARE @a FLOAT, @b FLOAT
    SET @a = NULL
    SET @b = 2
    SELECT ISNULL(@a, 0) + ISNULL(@b, 0) AS 'A + B = '
