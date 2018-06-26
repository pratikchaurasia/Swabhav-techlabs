SELECT DISTINCT student_number, grade
    FROM   Grade_report
    WHERE  grade LIKE '[^c-f]'
    AND    student_number > 100
