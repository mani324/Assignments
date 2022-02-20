create database average;
use average;
create table salary_info(
Emp_ID  int primary key auto_increment not null,
Department_id int not null ,
PhoneNumber bigint not null,
Emp_Name varchar(55) not null,
HireDate date not null,
Emp_salary int not null
);
alter table salary_info modify PhoneNumber bigint not null;

insert into salary_info(Department_id,PhoneNumber,Emp_Name,HireDate ,Emp_salary) values
(501,9090567789,'Arun','2018-03-14',50000),
(502,9090567790,'Suriya','2019-03-14',48000),
(503,9090567789,'sekar','2017-07-23',56000),
(504,9090567767,'Dinesh','2018-03-15',51000),
(505,9090567734,'Karthi','2018-04-18',48000),
(506,9090567723,'Kumar','2018-05-19',44000),
(507,9090567756,'Anbu','2018-09-20',49000),
(508,9090567789,'Senthil','2018-03-14',50000),
(509,9090567733,'Guna','2018-08-01',51000),
(510,9090567789,'Rajan','2018-03-01',52000);
select avg(Emp_salary) from salary_info;
SELECT department_id  , AVG(Emp_salary), COUNT(*) 
FROM salary_info
GROUP BY department_id
having count(*)<10;