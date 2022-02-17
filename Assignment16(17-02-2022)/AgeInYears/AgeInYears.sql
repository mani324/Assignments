create database AgeInYears;
use AgeInYears;
select date_format(from_days(datediff(now(),'1998-05-21')), '%Y')+0 as Age;
