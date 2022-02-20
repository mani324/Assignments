create database MaximumSalary;
use Maximumsalary;
create table Programmer(
Emp_ID  int primary key auto_increment not null,
Emp_Name varchar(55) not null,
PhoneNumber bigint not null,
HireDate date not null,
Emp_salary int not null);
insert into Programmer(Emp_Name,PhoneNumber,HireDate,Emp_salary ) values
('Arun',9090567789,'2018-03-14',50000),
('Suriya',9090567790,'2019-03-14',48000),
('sekar',9090567789,'2017-07-23',56000),
('Dinesh',9090567767,'2018-03-15',51000),
('Karthi',9090567734,'2018-04-18',48000),
('Kumar',9090567723,'2018-05-19',44000),
('Anbu',9090567756,'2018-09-20',49000),
('Senthil',9090567789,'2018-03-14',50000),
('Guna',9090567733,'2018-08-01',51000),
('Rajan',9090567789,'2018-03-01',52000); 
select Emp_Name, max(Emp_salary) as MaximumSalary
from Programmer;
