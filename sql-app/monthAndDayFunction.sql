SELECT names, birthdate, MONTH(birthdate) AS [Birth Month], ((MONTH(birthdate)) + 6 )
    AS     [Sixth month]
    FROM   DateTable

 SELECT names, birthdate, DAY([birthdate]) AS [Date]
    FROM   DateTable
