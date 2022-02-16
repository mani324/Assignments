create database College_management;
use  College_management;
create table College_Details(
College_Name varchar(50) not null,
College_Code int not null,
College_location varchar(50) not null,
College_Address varchar(255) not null);
insert into College_Details values
('A Engineering College',5321,'Dindigul','Dindigul-624001'),
('B Engineering College',5376,'Chennai','Chennai-600001'),
('C Engineering College',5677,'Madurai','Madurai-628001'),
('D Engineering College',5678,'Trichy','Trichy-645006');
select*from College_Details;
create table Student_Details(
Student_Name varchar(55) not null,
Student_Department varchar(55) not null,
Student_CourseFee int not null,
Student_Age int not null);
insert into  Student_Details values
('Karthik','EEE',25000,21),
('Suriya','ECE',25000,21),
('Kumar','MECH',25000,21),
('Arun','CSE',25000,21);
select*from Student_Details;
create table Student_Marks(
College_id int,
DepartmentCode int not null,
Subject_Name varchar(55),
Marks int not null,
Staff_Name varchar(55),
primary key(College_id)
);
insert into Student_Marks values
('32',5578,'EE5201',78,'Bala');
select*from Student_Marks;
update Student_Marks set Staff_Name='siva';
select*from Student_Marks;
