create database  Organisation;
use Organisation;
create table Employee_data(
Employee_Id int auto_increment,
Department_name varchar(50) not null,
Manager_id int not null,
 Manager_name varchar(50) not null,
 Manager_salary int not null,
 primary key(Employee_Id)
 );
 alter table Employee_data add Joining_date date;
 select*from Employee_data;

insert into Employee_data(Department_name,Manager_id, Manager_name, Manager_salary,Joining_date)values('Production',001,'Sundar',25000,'2005-05-15'),
('Marketting',002,'Karthi',20000,'2006-06-15'),('Sales',003,'Kumar',23000,'2005-09-13'),
('Devolopment',004,'Sanjay',26000,'2004-05-10'),
('Human Resource',005,'Arun',23000,'2005-04-09');
create table Department(
Employee_Id int auto_increment,
Department_id int not null,
working_hours int not null,
key(Employee_Id)
);
select*from Department;
insert into Department(Department_id,working_hours) values(001,8),
(002,10),(003,12),(004,8),(005,8);
select Department_name,Manager_name,Manager_salary
from Employee_data join Department on  (Manager_id=Department_id) where(sysdate()-joining_date)/365>5 ;