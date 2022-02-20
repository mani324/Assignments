create database salary;
use salary;
create table employee_details(
Emp_ID int auto_increment not null,
Employee_name varchar(50) not null,
Employee_Roll varchar(55) not null,
Employee_location varchar(50) not null,
primary key(Emp_ID));
select*from employee_details;
insert into employee_details(Employee_name,Employee_Roll,Employee_location,Department_ID) values
('Arun','Devoloper','Chennai',001),('Aasif','Tester','Chennai',002),('Arun','Teamleader','Chennai',003),('Kumar','ProjectManager','Chennai',004),('Dinesh','NetworkEngineer','Chennai',005);
alter table employee_details add Department_ID int not null;
truncate table employee_details;
create table salary_details(
Emp_ID  int auto_increment not null,
salary_id int not null,
salary int not null, 
key(Emp_ID )
);
alter table salary_details add Commission_pct int ;
alter table salary_details add Department_Id int;
alter table salary_details add Manager_id  int ;
select* from salary_details;
insert into salary_details(salary_id ,salary ,Commission_pct,Department_Id ,Manager_id) values
(001,3000,2000,554,908),(002,4000,2000,555,097),(003,4500,1500,556,096),(004,5000,2000,557,094),(005,5500,1900,553,093); 
select Employee_name,Employee_Roll ,Job_ID from employee_details
join salary_details on(Job_ID=salary_id) where salary >=4000 ;
alter table employee_details rename column Department_ID TO Job_ID;
truncate table salary_details;