select Student.SNAME,Student.STNO
from Student
where Student.STNO
in(select gr.STUDENT_NUMBER
	from Grade_report gr
	where gr.GRADE='A' or gr.GRADE='B')