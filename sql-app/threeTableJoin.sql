SELECT  s.sname, s.major, t.section_id
    FROM    Student s, Grade_report g, Section t
    WHERE   s.stno = g.student_number
    AND       g.section_id =t.section_id
    AND       g.grade='C'
    AND       t.instructor LIKE 'HERMANO'