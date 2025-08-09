create table Employee_details(
   UserID Varchar(200),
   Password Varchar(200),
   Name Varchar(200),
   IncorrectAttempts Number(2),
   LockStatus Number(2),
   UserType Varchar(200));
   
insert into Employee_details values('AB1001','AB1001','Hari',0,0,'Admin');

insert into Employee_details values('TA1002','TA1002','Prasanth',0,0,'Employee');

insert into Employee_details values('RS1003','RS1003','Ganesh',0,0,'Employee');

select * from Employee_details; 

