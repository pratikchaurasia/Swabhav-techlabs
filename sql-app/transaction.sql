begin transaction abc
begin
	insert into Student values(110,'himanshu','sharma',4787848);
	insert into student values(111,'sarvesh','pandey',98989848);
	select * from student;
	rollback;
end

select * from student