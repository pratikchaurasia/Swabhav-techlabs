 SELECT names, 'Months between birth date and school date' = DATEDIFF(mm, birthdate,
    school_date)
    FROM Datetable