create database employee;
use employee;
create table employee(
Employee_Id int primary key auto_increment not null,
First_name varchar(55) not null,
Last_name varchar(55) not null
);
insert into employee(First_name,Last_name,joining_date,salary,department)values
('Arun','Kumar','2014-01-01 08:00:00',100000,'HR')
,('Mohamed','Aasif', '2014-02-01 08:00:00',80000,'Admin'),
('Lokesh','Waran' ,'2014-03-01 08:00:00',300000,'HR'),('Deepak','Kumar', '2014-05-01 08:00:00',500000,'Admin'),
('Sasi','Kumar','2014-01-04 08:00:00', 500000,'Account');
select First_name as EmployeeName from employee;
select upper(First_name) from employee;
alter table employee add joining_date datetime not null;
alter table employee add department varchar(55);
select*from employee;
Select distinct department from employee;
Select substring(First_name,1,3) from employee;
Select instr(First_name, binary'a') from employee where first_name = 'Sasi';
Select rtrim(First_name) from employee;
Select ltrim(department) from employee;
Select distinct length(department) from employee;
Select replace(First_name,'a','A') from employee;
Select concat(First_name, '', Last_name) AS 'Full_Name' from employee;
Select * from employee order by First_name asc;
Select * from employee order by First_name asc,department desc;
select *from employee order by department desc;
Select * from employee  where First_name in ('Mohamed','Arun');
Select * from employee  where First_name not in ('Mohamed','Arun');
Select * from employee  where department like 'Admin%';
Select * from employee  where First_name like '%a%';
alter table  employee add salary int not null after joining_date;
Select * from employee  where First_name like '%n';
Select * from employee  where First_name like '_____h';
Select * from employee  where salary between 100000 and 500000;
Select * from employee  where year(joining_data) = 2014 and month(joining_data) = 2;
select count( *)from employee  where department='Admin';
select cocat(First_name,'', Last_name) As employee_Name, Salary from employee where employee_id in (select employee_id from employee where Salary between 50000 and 100000);
select department, count(employee_id) No_of_employees from employee group by department order by No_of_employees desc;
create table Title(
Employee_Ref_ID int key auto_increment ,
Employee_title varchar (55) not null,
Affected_from datetime not null
);
insert into Title(Employee_title,Affected_from)values
('Manager' ,'2016-02-20 08:00:00'),('Executive' ,'2016-06-11 08:00:00'),('Lead' ,'2016-06-11 08:00:00'),('Asst. Manager' ,'2016-02-20 08:00:00'),
('Manager' ,'2016-02-20 08:00:00'),('Lead' ,'2016-02-20 08:00:00');
select*from title;
select department, count(employee_id) No_od_employees from employee group by department order by No_od_employees desc;
select distinct  w.first_name, t.employee_title from employee w inner join Title t on w.employee_id = t.employee_ref_id and t.employee_title in ('Manager');
select  employee_title , affected_from, count(*) from Title group by employee_title, affected_from having count(*) > 1;
select  *  from employee where mod (employee_id, 2) = 0;
select curdate();
select now();
select* from employee order by Salary desc limit 10;
select distinct Salary from employee a where 3 >= (select count(distinct Salary) from employee b where a.Salary <= b.Salary) order by a.Salary desc;
select*from employee;
select*from title;