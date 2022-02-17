create database  Organisation;
use Organisation;
create table Employee_detail(
Employee_Id int auto_increment,
Department_name varchar(50) not null,
 Manager_name varchar(50) not null,
 Manager_salary int not null,
 primary key(Employee_Id)
 );
 insert into Employee_detail values
  (001,'Production','Siva',60000),(002,'Devoloping','Karthik',55000),(003,'Testiing','Suriya',53000),(004,'Marketting','Lokesh',49000),
  (005,'sales','david',45000),(006,'Maintanence','kumar',43000);
select*from  Employee_detail;

 
