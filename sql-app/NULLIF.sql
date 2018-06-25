SELECT names, wage,
           new_wage = NULLIF(wage, 400)
    FROM   Employee
    
/*returns a NULL if expression1 = expression2. If the expressions are not equal, then expression1 is returned*/